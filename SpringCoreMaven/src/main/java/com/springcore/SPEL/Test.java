package com.springcore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/SPEL/spelconfig.xml");
		Student student=(Student) context.getBean("student");
		System.out.println(student);
		
		Student student1=(Student) context.getBean("student");
		System.out.println(student1);
		
		//we create a object od spel
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression experssion =temp.parseExpression("20+44");
		System.out.println(experssion.getValue());

	}

}
