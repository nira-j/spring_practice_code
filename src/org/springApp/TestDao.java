package org.springApp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestDao {
	public static void main(String args[]) {
//		Resource res=new ClassPathResource("spring.xml");
//		BeanFactory bef=new XmlBeanFactory(res);
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		HelloWorld hw=(HelloWorld) context.getBean("obj1");
//		HelloWorld hw=(HelloWorld) bef.getBean("obj1");
//		hw.displayMessage();
	}
}
