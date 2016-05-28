package info.chari.springaopdemo;

import info.dto.EmployeeDTO;
import info.service.EmployeeManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// this is test for jenkins build 
// this is test for jenkins auto build triggering

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = context.getBean(EmployeeManager.class);
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}
