package com.akshay.jpademoproject.service;

import com.akshay.jpademoproject.model.Student;
import com.akshay.jpademoproject.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student createStudent(Student student){
        System.out.println(student);
        Student savedStudent = studentRepo.save(student);
        System.out.println(savedStudent);

        return savedStudent;
    }

    public Student getStudent(Integer studentId){
        return studentRepo.findById(studentId).get();
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public void deleteStudent(Integer studentId){
        studentRepo.deleteById(studentId);
    }
}
