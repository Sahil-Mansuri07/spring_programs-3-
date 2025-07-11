package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	
     JdbcTemplate jdbcTemplate=context.getBean("my_jdbc",JdbcTemplate.class);
   
   
        System.out.println( jdbcTemplate );
    
      context.close();    
    
    }
}
