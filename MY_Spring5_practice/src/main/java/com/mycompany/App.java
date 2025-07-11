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
    	
    Foo foo=context.getBean("foo",Foo.class);
    	
    System.out.println("The Value is:=>:=>:=>"+foo.getX());
    	
    // by the help of this method() java app shutdown and the destroy method is run
     context.registerShutdownHook();
    
    
      System.out.println( "Hello World!" );
    
    }
}
