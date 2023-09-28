package it.veda.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vedait.maven2.model.Student;
import org.vedait.maven2.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext container= new ClassPathXmlApplicationContext("maven2.xml");
        
        Teacher t=container.getBean("teacher2",Teacher.class);
        
        /*Object o=container.getBean("teacherRefObj");
        Teacher t=(Teacher)o;
        t.t1();*/
       /* Student student = (Student)container.getBean("studentRefObj");
        student.getDetails();
        System.out.println(student);
        System.out.println("Container="+container);*/
        
    }
}
