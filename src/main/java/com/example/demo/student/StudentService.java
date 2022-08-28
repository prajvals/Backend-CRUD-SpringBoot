package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent())
        {
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);

    }

    public void deleteStudentById(Long id) {
        boolean exists = studentRepository.existsById(id);
        if(exists)
        {
            System.out.println("called with the id " + id);
            Student studentToBeDeleted = studentRepository.findById(id).get();
            studentRepository.delete(studentRepository.findById(id).get());
        }
        else {
            throw new IllegalStateException("No such entity exists");
        }
    }

    public void updateStudent(Long id, String name) {
        boolean exsists = studentRepository.existsById(id);
        if(exsists)
        {
            System.out.println("called with the id " + id + "triggering the update logic ");
            Optional<Student> student = studentRepository.findById(id);
            student.get().setName(name);
            studentRepository.save(student.get());
        }
    }
}
/*
there is a confusion for me atm, the studentRepository is an interface and we have created an instacne of an interface and using it
how is that even possible
there must be something else that would be working in it

 */
