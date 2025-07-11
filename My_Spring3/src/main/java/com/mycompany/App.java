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
    
  A a=(A)context.getBean("a1");
  
  System.out.println(a.getX()+"=>=>"+a.getRef().getY());
    
  context.close();
    
    }
}
