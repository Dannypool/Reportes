package mx.com.ragna.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceLocator {
	
	public static Object buscaServicio(String service){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		    return appContext.getBean(service);
	}

}
