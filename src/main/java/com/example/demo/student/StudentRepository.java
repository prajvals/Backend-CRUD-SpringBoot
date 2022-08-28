package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(" SELECT s FROM Student s WHERE s.email = ?1 ")
    Optional<Student> findStudentByEmail(String Email);



}

/*
Jparepository provides functions with implementations on how to work with the database
here you arent required to write the sql querries to get the data, you can use jpaRepository functions
but to use it
 */