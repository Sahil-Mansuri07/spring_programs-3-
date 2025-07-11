package com.mycompany;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Foo foo=context.getBean("foo", Foo.class);
    	
    	System.out.println("Foo Foo =>"+foo.getX());
    	
    	context.registerShutdownHook();
    	
      System.out.println( "Hello World!" );
    
    }
}
