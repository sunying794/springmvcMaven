package main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GreetingService;

public class Main {



	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("111111111");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		String greetMessage = greetingService.hello("Eric");
		System.out.println("Consumer ==> " + greetMessage);
		greetingService.setData("bbsy3", "3bbsy");
		System.out.println("bbsy3值:" + greetingService.getData("bbsy3"));
		
		greetingService.setData("bbsy2", "2bbsy");
		System.out.println("bbsy2值:" + greetingService.getData("bbsy2"));
		
		System.out.println("bbsy磊值:" + greetingService.getData("bbsy3"));
		
		
		context.destroy();
	}
	
	

}
