package com.spring.Maven_project2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class mobileApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim1=(Sim) context.getBean("air");
		Sim sim2=(Sim) context.getBean("voda");
		sim1.calling();
		sim1.data();
		System.out.println(" ");
		sim2.calling();
		sim2.data();
	}
}
/* output:-
   Calling from vodafone.
   Data available:200mb!!
 
   Calling from airtel.
   Data available:100mb!!
*/