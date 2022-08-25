package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    @Autowired
    private final StudentService studentServices;
    //see when we are using autowired, only the classname needs to be the same alright
    //the variable name as always can be anything

    public StudentController(StudentService studentService)
    {
        this.studentServices = studentService;
    }
    @GetMapping
    public List<Student> getStudent()
    {
        return studentServices.getStudent();
    }
}

/*
the point to be noticed here is that, we have not made the object of the rest controller studentController class
still we could use it that was because of the component scan of springBoot alright yeah
now here when we are using the Service annotation, again we are not instantiating the elements alright
the instantiation of elements can and do happen but that is not a good design decision
this is because if we are creating the instances inside of the functions, that would work fine if we only
need it there, but there are many places where we would be required to use the same instance of the class
throughout, and when that is the scene, we actually use the dependency injection principle
where the dependency is added by the spring boot framework itself
it makes the component/service/bean, and then pass it in feilds we required, when we use autowired with it alright yeah

there is more to it which I can learn from the durgesh channel.

 */