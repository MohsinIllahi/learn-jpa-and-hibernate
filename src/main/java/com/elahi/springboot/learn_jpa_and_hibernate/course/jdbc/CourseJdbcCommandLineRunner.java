package com.elahi.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.elahi.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	public void run(String... args) throws Exception {
//		repository.insert(new Course(2,"learn spring","illahi mohsin"));
//		repository.insert(new Course(4,"learn AWS","illahi mohsin"));
//		repository.insert(new Course(5,"learn JPA","illahi mohsin"));
		
		//delete
//		repository.delete(5);
	
		//getData
		
//		System.out.println(repository.retrieveDataById(2));
//		System.out.println(repository.retrieveDataById(4));

		
	}

}
