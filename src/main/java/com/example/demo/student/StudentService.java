package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Service
public class StudentService {

    public ArrayList<Student> getStudent()
    {
        return new ArrayList<Student>(){{
            add(new Student(1L,"Prajval Singh",23, LocalDate.of(1999, Month.JUNE,06),"prajval.singh@getonedirect.com"));
        }};

    }
}
