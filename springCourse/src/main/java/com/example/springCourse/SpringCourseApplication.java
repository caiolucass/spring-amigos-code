package com.example.springCourse;

import com.example.springCourse.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringCourseApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCourseApplication.class, args);
	}

	@GetMapping
	public List<student> hello(){
		return List.of(
				new student(
						1L,
						"Caio",
						"caioteste@gmail.com",
						LocalDate.of(1998, Month.SEPTEMBER, 28),
						23
				)
		);
	}

}
