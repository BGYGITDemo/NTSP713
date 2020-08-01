package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.PersonInfo;

public class NullInjectionTest {
public static void main(String[] args) {
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	PersonInfo gobin=null, amit=null;
	//create IOC container
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	//get Beans
	gobin=factory.getBean("gobinInfo",PersonInfo.class);
	System.out.println(gobin);
	System.out.println("-----------------------");
	amit=factory.getBean("amitInfo",PersonInfo.class);
	System.out.println(amit);
	System.out.println("------------------------");
	
}
}
