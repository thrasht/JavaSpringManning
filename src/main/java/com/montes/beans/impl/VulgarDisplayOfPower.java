package com.montes.beans.impl;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import com.montes.beans.CompactDisk;
import com.montes.conditionals.DiscCondition;

@Component
@Conditional(DiscCondition.class)
public class VulgarDisplayOfPower implements CompactDisk, BeanPostProcessor, InitializingBean, DisposableBean {

	private String title = "Vulgar Display of Power";
	private String artist = "Pantera";
	
	public void play() {
		System.out.println("Paying " + title + " by " + artist);
		
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization " + beanName);
		return bean;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	
	public void init() {
		System.out.println("init");
	}
	

}
