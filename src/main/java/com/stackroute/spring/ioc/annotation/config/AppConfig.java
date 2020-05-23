package com.stackroute.spring.ioc.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.stackroute.spring.ioc.annotation.beans.Hobby;

@Configuration
@ComponentScan(basePackages = "com.stackroute.spring.ioc.annotation.beans")
public class AppConfig {

//	Bean Definitions
//Factory methods

	
	  @Bean(name="hobby1") 
	  @Scope("prototype")
	  public Hobby getHobby1() { return new
	  Hobby(1,"Playing Cricket",2018); }
	  
	  @Bean(name="hobby2") public Hobby getHobby2() { return new
	  Hobby(2,"Playing Chess",2017); }
	  
	  @Bean(name="hobby3") public Hobby getHobby3() { return new
	  Hobby(3,"Reading Books",2015); }
	  
	  
	  
	 

	/*
	 * @Bean(name = "student1") public Student getStudent1() { return new
	 * Student(1,"Student1","Student1@gmail.com",111111,new
	 * ArrayList(Arrays.asList(getHobby1(),getHobby2()))); }
	 * 
	 * @Bean(name = "student2") public Student getStudent2() { return new
	 * Student(2,"Student2","Student2@gmail.com",22222,new
	 * ArrayList(Arrays.asList(getHobby2(),getHobby3()))); }
	 * 
	 * @Bean(name = "student3") public Student getStudent3() { return new
	 * Student(3,"Student3","Student3@gmail.com",33333,new
	 * ArrayList(Arrays.asList(getHobby1(),getHobby2(),getHobby3())));
	 */

}
