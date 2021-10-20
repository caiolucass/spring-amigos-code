package com.example.springCourse.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //retorna a lista de usuários
    public  List<Student> getStudents(){
        return studentRepository.findAll();
    }

    //retorna o usuário pelo nome sem casesensitivity
    public List<Student> getStudentByName(String name){
        return studentRepository.findByNameIgnoreCase(name);
    }
}
