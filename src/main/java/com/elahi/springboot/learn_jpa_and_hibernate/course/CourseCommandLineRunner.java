package com.elahi.springboot.learn_jpa_and_hibernate.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.elahi.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.elahi.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	public void run(String... args) throws Exception {
		repository.save(new Course(2l,"learn spring","illahi mohsin"));
		repository.save(new Course(4l,"learn AWS","illahi mohsin"));
		repository.save(new Course(5l,"learn JPA","illahi mohsin"));
		
		//delete
		repository.deleteById(5l);
	
		//getData
//		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(4l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("illahi mohsin"));
		System.out.println(repository.findByName("learn spring"));

		
	}

}
