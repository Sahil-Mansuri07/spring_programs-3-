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
    
  Foo f=(Foo)context.getBean("foo1");
  
  System.out.println("Value=>"+f.getX());
     context.registerShutdownHook();
     context.close();
     
    }
}
