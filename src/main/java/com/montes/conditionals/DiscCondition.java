package com.montes.conditionals;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.montes.beantest.App;

public class DiscCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ClassLoader cl = context.getClassLoader();
		
		
		try {
			if(cl.loadClass(App.class.getName()) != null) {
				System.out.println(App.class.getName());
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
