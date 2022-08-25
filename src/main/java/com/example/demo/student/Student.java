package com.example.demo.student;

import org.springframework.cglib.core.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;

    @Transient
    private Integer age;
    private String name;
    private String email;
    private LocalDate Dob;


    public Student() {
    }

        public Student(Long id, String name, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        Dob = dob;
        this.email = email;
    }

    public Student(String name,  LocalDate dob, String email) {
        this.name = name;
        Dob = dob;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Dob=" + Dob +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Period.between(this.Dob, LocalDate.now()).getYears();
    }

    public LocalDate getDob() {
        return Dob;
    }

    public String getEmail() {
        return email;
    }
}

