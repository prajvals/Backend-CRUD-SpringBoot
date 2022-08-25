package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent()
    {
        return studentRepository.findAll();

    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
/*
there is a confusion for me atm, the studentRepository is an interface and we have created an instacne of an interface and using it
how is that even possible
there must be something else that would be working in it

 */
