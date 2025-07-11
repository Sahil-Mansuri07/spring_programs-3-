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
    	
    Foo foo=context.getBean("foo",Foo.class); 	
    	
    foo.add();	
    
    context.close();
    	
      System.out.println( "Hello World!" );
    }
}
