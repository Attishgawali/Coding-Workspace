package com.spring_core.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.spring.jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
                                               
//        INSERT
        
//        Student s1= new Student();
//        s1.setId(503);
//        s1.setName("Rajkumar");
//        s1.setCity("Luckhnow");
//        int result = studentDao.insert(s1);
//        System.out.println("rows inserted is : "+ result);
        
        
//        UPDATE
        
//        Student s= new Student();
//        s.setId(200);
//        s.setName("Prajwal");
//        s.setCity("Sangamner");
//        int result = studentDao.change(s);
//        System.out.println("rows inserted is : " + result);
        
        
//        DELETE
          
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter the id of row to Delete : ");
//       int id= sc.nextInt();
//	     Student s= new Student();
//	     s.setId(id);
//	     int result = studentDao.delete(s);
//	     System.out.println("rows deleted is : " + result);
        
//        System.out.println(studentDao.getStudent(103));
        
        List<Student> allStudents = studentDao.getAllStudents();
        for(Student student: allStudents) {
        	System.out.println(student);
        }
 
        
        
    }
}
