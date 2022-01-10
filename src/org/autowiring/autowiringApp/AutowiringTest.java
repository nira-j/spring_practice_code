package org.autowiring.autowiringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autowiringconstructor.xml");
		Flipkart fp=(Flipkart) ctx.getBean("fp");
		fp.purchase();
	}
}
