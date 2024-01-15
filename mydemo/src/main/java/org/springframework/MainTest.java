package org.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.po.Person;

/**
 * @author shanmengyuan
 * @date 2024/1/10 10:44
 */
public class MainTest {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//		Person person = applicationContext.getBean("Person", Person.class);
//		System.out.println(person.getId());
//		System.out.println(person.getCat().getColor());

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		Person bean = (Person) bf.getBean("person");
		System.out.println(bean.getId());
	}
}