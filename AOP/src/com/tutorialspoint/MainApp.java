package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
      
      Student student = (Student) context.getBean("student");
      student.getName();
      student.getAge();
      student.printThrowException();
      System.out.println("first changed!");
      System.out.println("second changed!");
      System.out.println( "------------------------");
   }
}