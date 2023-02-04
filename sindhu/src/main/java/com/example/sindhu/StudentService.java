package com.example.sindhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    public Student getStudent(int id){
        return studentRepository.getStudent(id);
    }
    public String delete_Student(int id){
        return studentRepository.deleteStudent(id);

    }
    public Student updateStudent(int id, int age){
        return studentRepository.getStudent(id);
    }

}
