package mx.com.ragna.controlador;


import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class buscaBean {
	
	private static ClassPathXmlApplicationContext springContext = null;
 
  public static Object locator(String service) {
	  if (springContext != null){
			return springContext.getBean(service);
		}else{
			springContext = new ClassPathXmlApplicationContext("HORARIOS/applicationContext.xml");
			
			return springContext.getBean(service);
		}
	  
  }
}