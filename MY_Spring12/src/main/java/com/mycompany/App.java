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
    	
    Demo demo1=context.getBean("demo",Demo.class);	
    
    System.out.println(demo1.hashCode());
    
   Demo demo2=context.getBean("demo",Demo.class);	
    
    System.out.println(demo2.hashCode());
    
    	
       System.out.println( "DONE👍👍👍!" );
    
       context.close();
       
    }
}
