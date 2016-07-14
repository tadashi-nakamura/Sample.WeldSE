package com.mamezou.sample.weld_se.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

import com.mamezou.sample.weld_se.interceptor.Sample;

@Sample
@ApplicationScoped
public class EnglishSpeaker implements Speaker {

    @Override
    public void speak() {
        System.out.println("Hello World!!");
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("EnglishSpeaker#postConstruct");
    }
    
    @PreDestroy
    public void preDestory() {
        System.out.println("EnglishSpeaker#preDestory");
    }
}