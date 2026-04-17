package com.example.SpringBootLearning1.service;

import com.example.SpringBootLearning1.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

}
