package com.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "mariam",
                    "mm@mdmdm.tr",
                    LocalDate.of(2000, Month.APRIL, 4)
            );

            Student mark = new Student(
                    "mark",
                    "mark@mdmdm.tr",
                    LocalDate.of(2001, Month.JUNE, 4)
            );

            Student alex = new Student(
                    "alex",
                    "alex@mdmdm.tr",
                    LocalDate.of(2002, Month.JANUARY, 4)
            );

            repository.saveAll(List.of(mariam, mark, alex));

        };
    }
}
