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
    	
    Employee employee=context.getBean("employee",Employee.class);
    
    System.out.println(employee.getAddress().getStreet());
    System.out.println(employee.getAddress().getCity());
    
      System.out.println( "DONE ✅✅✅!" );
   
      context.close();
      
    }
}
