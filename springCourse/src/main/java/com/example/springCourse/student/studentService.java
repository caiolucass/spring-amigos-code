package com.example.springCourse.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class studentService {

    public  List<student> getStudents(){
        return List.of(
                new student(
                        1L,
                        "Caio Lucas",
                        "caio@gmail.com",
                        LocalDate.of(1998, Month.SEPTEMBER, 28),
                        23
                )
        );
    }
}
