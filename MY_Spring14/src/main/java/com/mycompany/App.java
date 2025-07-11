package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    Demo demo=context.getBean("getDemo",Demo.class);	
    
    System.out.println( demo );
    
    demo.myDemo();
    
        context.close();
    
    }
}
