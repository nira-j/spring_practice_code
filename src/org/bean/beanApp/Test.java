package org.bean.beanApp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Student st1=(Student) ctx.getBean("obj1");
		System.out.println(st1.hashCode());
		
		Student st2=(Student) ctx.getBean("obj1");
		System.out.println(st2.hashCode());
		
		Student st3=(Student) ctx.getBean("obj1");
		System.out.println(st3.hashCode());
		
		Student st4=(Student) ctx.getBean("obj1");
		System.out.println(st4.hashCode());
		
		Student s1=new Student();
		System.out.println(s1.hashCode());
		
		Student s2=new Student();
		System.out.println(s2.hashCode());
	}

}
