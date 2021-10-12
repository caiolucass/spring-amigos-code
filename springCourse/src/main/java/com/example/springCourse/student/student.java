package com.example.springCourse.student;
import java.time.LocalDate;


public class student {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    //construtor com arg
    public student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    //construtor sem o id
    public student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    //construtor sem arg
    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }

}
