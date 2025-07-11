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
    
    Student student=context.getBean("stu1",Student.class); 	
    	
    System.out.println(student.roll+"=->"+student.name+"=-->"+student.percent);	
    	
    context.close();
    
    	
       System.out.println( "Hello World!" );
   
    }
}
