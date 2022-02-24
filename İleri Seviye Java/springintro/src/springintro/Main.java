package springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		CustomerManager customerManager =new CustomerManager(context.getBean("database",ICustomerDal.class));
		customerManager.add();

	}
	
	//IoC - Inversion of Control
	//Dependency Injection
	//

}
