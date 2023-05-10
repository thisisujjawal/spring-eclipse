package com.thisisujjawal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		----------------------Setter Injection------------------------------
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
		
		
		
//		----------------------Constructor Injection---------------------------
		ApplicationContext constructorContext = new ClassPathXmlApplicationContext("com/thisisujjawal/springConfig/constructorConfig.xml");
		
		Person person6 = (Person) constructorContext.getBean("person");
		Address address = (Address) constructorContext.getBean("address");
		System.out.println(person6);
		System.out.println(address);
		
		
//		----------------------Init and Destroy method----------------------------

//		Instead of Application context use AbstractApplicationContext to call destroy method
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("com/thisisujjawal/springConfig/setterConfig.xml");
		Address address2 = (Address) abstractApplicationContext.getBean("address2");
		System.out.println(address2);
		abstractApplicationContext.registerShutdownHook();
		
	}

}
