package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Student student=context.getBean("student",Student.class);
    	
    	System.out.println(student.getRoll()+"👉"+student.getName()+"👉"+student.getPercent());
      	
   	  System.out.println( "Hello World!" );
    
   	  context.close();
   	  
    }
}
