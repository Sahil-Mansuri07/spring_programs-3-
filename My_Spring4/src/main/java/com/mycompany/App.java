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
    	
   Foo f=(Foo)context.getBean("foo1");
    	
   f.add();
   
   context.close();
    
    }
}
