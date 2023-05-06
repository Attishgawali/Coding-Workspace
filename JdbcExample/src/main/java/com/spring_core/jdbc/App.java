package com.spring_core.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_core.entity.Employee;
import com.springcore.dao.EmployeeDao;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcJavaConfig.class);
        
        EmployeeDao empDao = context.getBean("employeeDao",EmployeeDao.class);
        
//        INSERTING.....
//        Employee emp = new Employee();
//        emp.setEmpId(104);
//        emp.setEmpName("Tejas");
//        emp.setEmpAddress("Pune");
//        emp.setEmpPhones(65151);
//        int result = empDao.insert(emp);
//        System.out.println("Number of record inserted : " + result);
        
        
//        DELETING.....
        Employee emp1 = new Employee();
        emp1.setEmpId(104);
        int result = empDao.delete(emp1);
        System.out.println("NO of rows deleted is : " + result);
    }
}
			