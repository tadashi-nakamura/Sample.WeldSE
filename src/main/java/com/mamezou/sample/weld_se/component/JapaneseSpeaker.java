package com.mamezou.sample.weld_se.component;

import javax.enterprise.inject.Alternative;

@Alternative
public class JapaneseSpeaker implements Speaker {

	@Override
	public void speak() {
        System.out.println("‚±‚ñ‚É‚¿‚Í¢ŠEI");
	}

}
