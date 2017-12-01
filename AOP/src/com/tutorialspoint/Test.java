package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
		 Sample sample=(Sample) context.getBean("business");
		 sample.dong();
		 sample.dong(2);
		 sample.ding();
		 sample.ding(2);
		 
	}

}
