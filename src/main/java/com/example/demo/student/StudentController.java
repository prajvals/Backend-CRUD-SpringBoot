package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    @GetMapping
    public ArrayList<Student> getStudent()
    {
        return new ArrayList<Student>(){{
            add(new Student(1L,"Prajval Singh",23, LocalDate.of(1999, Month.JUNE,06),"prajval.singh@getonedirect.com"));
        }};

    }
}
