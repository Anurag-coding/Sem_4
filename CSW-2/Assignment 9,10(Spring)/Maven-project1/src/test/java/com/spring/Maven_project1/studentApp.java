package com.spring.Maven_project1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class studentApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 student s1 = (student) context.getBean("student1");
		 student s2 = (student) context.getBean("student2");
		 s1.display();
		 System.out.println(" ");
		 s2.display();
	}
}
/* output:-
   Name: Anurag kumar
   Rollno: 34
   Emailid: Anuragkr.@gmail.com
 
   Name: Ashu
   Rollno: 28
   Emailid: Ashu28@gmail.com
*/