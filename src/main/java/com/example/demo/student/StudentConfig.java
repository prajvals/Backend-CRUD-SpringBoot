package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    )
    {
        return args -> {
          Student mariam = new Student("Prajval Singh", LocalDate.of(2000, Month.JUNE,06),"prajval.singh@get.com");
            Student alex= new Student("Prajval Singh", LocalDate.of(2000, Month.JUNE,06),"prajval.singh@get.com");

            List a = new ArrayList<Student>();
            a.add(mariam);
            a.add(alex);
            repository.saveAll(a);
        };


    }
}
