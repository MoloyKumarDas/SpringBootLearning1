package com.example.SpringBootLearning1.controller;

import com.example.SpringBootLearning1.dto.StudentDto;
import com.example.SpringBootLearning1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @GetMapping("/students")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable Long id) {

        return "path variable"+id;
    }



}
