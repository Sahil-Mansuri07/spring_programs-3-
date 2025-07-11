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
    	
    	Person person=context.getBean("person",Person.class);
    	
    	System.out.println(person.getFriends());
    	
    	System.out.println(person.getFriends().getClass().getSimpleName());
    
    	System.out.println( "DONE✅✅✅!" );
    
    	context.close();
    }
}
