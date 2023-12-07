package com.jpademo.user.User.Service;

import com.jpademo.user.User.Model.Student;
import com.jpademo.user.User.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public void addStudent(Student s){
        studentRepository.save(s);
    }
}
