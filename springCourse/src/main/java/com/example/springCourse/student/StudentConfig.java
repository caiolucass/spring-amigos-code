package com.example.springCourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Caio = new Student(
                    "Caio Lucas",
                    "caio@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 28),
                    23
            );
            Student Joao = new Student(
                    "João Reis",
                    "joao@gmail.com",
                    LocalDate.of(1998, Month.NOVEMBER, 11),
                    23
            );

            //salva no banco, os estudantes criados
            studentRepository.saveAll(
                   List.of(Caio, Joao)
            );
        };
    }
}
