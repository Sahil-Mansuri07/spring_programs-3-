package My_Spring2.My_Spring2;

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
    	
   Employee employee=(Employee)context.getBean("emp1");
    	
   
   System.out.println(employee.getName());
   System.out.println(employee.getSkills()+"->"+employee.getSkills().getClass());
   System.out.println(employee.getMobile()+"=>"+employee.getMobile().getClass());
   System.out.println(employee.getProject()+"==>"+employee.getProject().getClass());
       
   context.close();
    
    }
}
