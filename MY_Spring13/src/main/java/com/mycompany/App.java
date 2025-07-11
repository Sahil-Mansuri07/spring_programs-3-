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
    	
    	Demo demo=context.getBean("demo",Demo.class);
    	
    	System.out.println(demo.getX()+"=>>"+demo.getY()+"=>>"+demo.getZ()+"=>>"+demo.getE()+"=>>"+demo.getS()+"=>>"+demo.isB());
    	
    	System.out.println( "DONE👍👍👍!" );
    
    	context.close();
    
    }
}
