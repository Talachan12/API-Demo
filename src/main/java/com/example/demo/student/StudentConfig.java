package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student misiek = new Student(
                    "Misiek",
                    LocalDate.of(2000, NOVEMBER, 19),
                    "talachann12@gmail.com"


            );

            Student tosia = new Student(
                    "Tosia",
                    LocalDate.of(2001, JANUARY, 19),
                    "tosiaczek@gmail.com"
            );

            repository.saveAll(
                    List.of(misiek,tosia)

            );


        };
    }

}
