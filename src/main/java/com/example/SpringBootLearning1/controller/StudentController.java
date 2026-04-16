package com.example.SpringBootLearning1.controller;

import com.example.SpringBootLearning1.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(4L,"Anuj","anuj@gmail.com");
    }
}
