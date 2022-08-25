package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}

/*
Jparepository provides functions with implementations on how to work with the database
here you arent required to write the sql querries to get the data, you can use jpaRepository functions
but to use it
 */