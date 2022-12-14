package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=context.getBean("student", Student.class);
        System.out.println(student);
        
        // SPRING BEANS Scope ....* SINGLETON *
        System.out.println(student.hashCode());
        
        //again we create a same object
        Student student1=context.getBean("student", Student.class);
		System.out.println(student1 .hashCode());
		
		//* PROTOTYPE * in prototype is will give you a different HASHCODE
	    //through annotation 
		//@scope

	}

}
