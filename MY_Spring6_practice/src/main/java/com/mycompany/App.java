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
    	
    Foo foo=(Foo)context.getBean("foo");
    	
    System.out.println("Value is::=>" +foo.getX());
    	
    
    context.close();
    
    	
       System.out.println( "Hello World!" );
    
       context.registerShutdownHook();
       
       
    }
}
