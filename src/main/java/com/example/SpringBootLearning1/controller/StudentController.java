package com.example.SpringBootLearning1.controller;

import com.example.SpringBootLearning1.dto.StudentDto;
import com.example.SpringBootLearning1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @GetMapping("/student")
    public List<StudentDto> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(5L,"Anuj2","anuj2@gmail.com");
    }



}
