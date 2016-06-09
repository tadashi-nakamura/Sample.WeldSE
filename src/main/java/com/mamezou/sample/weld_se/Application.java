package com.mamezou.sample.weld_se;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.mamezou.sample.weld_se.component.Speaker;

@Singleton
public class Application {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		Application application = container.instance().select(Application.class).get();
		application.run();
		weld.shutdown();
	}

	@Inject
	private Speaker speaker;

	public void run() {
		this.speaker.speak();
	}

//	public void start(@Observes ContainerInitialized event) {
//		System.out.println("Start event output");
//		System.out.println(event);
//	}

	public void start(@Observes ContainerInitialized event, @Parameters List<String> parameters) {
		System.out.println("Start event output");
		System.out.println(event);
		System.out.println("Start parameters output");
		System.out.println(parameters);
	}
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("Application#postConstruct");
    }
    
    @PreDestroy
    public void preDestory() {
        System.out.println("Application#preDestory");
    }
}