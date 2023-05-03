package com.thisisujjawal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext setterContext = new ClassPathXmlApplicationContext("com/thisisujjawal/springConfig/setterConfig.xml");
		
		Person person = (Person) setterContext.getBean("person");
		Person person2 = (Person) setterContext.getBean("person2"); 
		Person person3 = (Person) setterContext.getBean("person3");
		Person person4 = (Person) setterContext.getBean("person4");
		Person person5 = (Person) setterContext.getBean("person5");
		
		System.out.println(person);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		//use of Property in java.util
		System.out.println(person4.getProp().get("hello"));

	}

}
