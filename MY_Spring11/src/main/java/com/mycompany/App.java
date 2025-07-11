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
    	
    	Student student1=(Student)context.getBean("student");
    	
    	Student student2=(Student)context.getBean("student");
    	
    	System.out.println(student1.getName());
    	
    	System.out.println(student2.getName());
    	
    	System.out.println(student1);
    	
    	System.out.println(student2);
    	
    	System.out.println( "DONE✅✅✅!" );
   
         context.close();
    	
    }
}
