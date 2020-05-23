package com.stackroute.spring.ioc.annotation.spring_ioc_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.spring.ioc.annotation.beans.Hobby;
import com.stackroute.spring.ioc.annotation.beans.Student;
import com.stackroute.spring.ioc.annotation.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
		
		/*
		 * Hobby hobby1 = context.getBean("hobby1",Hobby.class);
		 * System.out.println(hobby1); Hobby hobby2 =
		 * context.getBean("hobby2",Hobby.class); System.out.println(hobby2); Hobby
		 * hobby3 = context.getBean("hobby3",Hobby.class); System.out.println(hobby3);
		 * 
		 * Student student1 = context.getBean("student1",Student.class);
		 * System.out.println(student1);
		 * 
		 * Student student2 = context.getBean("student2",Student.class);
		 * System.out.println(student2);
		 * 
		 * Student student3 = context.getBean("student3",Student.class);
		 * System.out.println(student3);
		 */
        
		
		  Hobby hobby1 = context.getBean("hobby1",Hobby.class);
		  System.out.println(hobby1.hashCode());
		  
		  Hobby hobby111 = context.getBean("hobby1",Hobby.class);
		  System.out.println(hobby111.hashCode());
		  
		 
		/*
		 * Student student1 = context.getBean(Student.class);
		 * System.out.println(student1);
		 */
		 
    }
}
