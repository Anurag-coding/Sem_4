package com.spring.Maven_project_extra;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s1 = (Student) context.getBean("student1");
        s1.display();
    }
}
/* output:-
   Name: Anurag kumar
   Rollno.: 34
   Address: [houseNo: 19, pinCode: 831003, city: Jamshedpur]
*/
