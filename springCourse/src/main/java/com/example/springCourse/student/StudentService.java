package com.example.springCourse.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //adiciona um novo estudante
    public void addNewStudent(Student student){
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        //valida se o email do estudante ja está cadastrado
        //caso nao esteja, ele cria um novo estudante
        //caso esteja, ele lança uma exeção
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
       studentRepository.save(student);
    }

    //exclui um estudante pelo Id
    public void deleteStudent(Long studentId){
       boolean exists = studentRepository.existsById(studentId);

       if(!exists){
           throw new IllegalStateException("student with " + studentId + " does not exists");
       }
       studentRepository.deleteById(studentId);
    }
}
