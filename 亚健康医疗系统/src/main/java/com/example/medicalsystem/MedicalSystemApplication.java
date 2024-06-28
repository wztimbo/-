package com.example.medicalsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.medicalsystem.mapper")

public class MedicalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalSystemApplication.class, args);
    }

}
