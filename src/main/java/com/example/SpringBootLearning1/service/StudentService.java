package com.example.SpringBootLearning1.service;

import com.example.SpringBootLearning1.dto.AddStudentRequestDto;
import com.example.SpringBootLearning1.dto.StudentDto;

import java.util.List;

public interface StudentService {




    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
     void deleteStudentById(Long id);

}
