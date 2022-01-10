package setterinjection.setterinjectionApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springcfg.xml");
		Bmw bmw=(Bmw)ctx.getBean("obj1");
		bmw.drive();
	}	
}
