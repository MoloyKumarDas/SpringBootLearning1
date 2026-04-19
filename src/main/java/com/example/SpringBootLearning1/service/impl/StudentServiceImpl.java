package com.example.SpringBootLearning1.service.impl;

import com.example.SpringBootLearning1.dto.AddStudentRequestDto;
import com.example.SpringBootLearning1.dto.StudentDto;
import com.example.SpringBootLearning1.entity.Student;
import com.example.SpringBootLearning1.repository.StudentRepository;
import com.example.SpringBootLearning1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {

        List<Student>students=studentRepository.findAll();
        List<StudentDto>studentDtoList= students
                .stream()
                .map(student -> modelMapper.map(student,StudentDto.class))
                //map(student ->new StudentDto(student.getId(),student.getName(),student.getEmail()))
                .toList();
        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with Id: "+id));
        return modelMapper.map(student,StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent=modelMapper.map(addStudentRequestDto,Student.class);
        Student student=studentRepository.save(newStudent);
        return modelMapper.map(student,StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student does not exists by id: "+id);
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student student = studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with Id: "+id));
    modelMapper.map(addStudentRequestDto,student);
   student=studentRepository.save(student);
   return modelMapper.map(student,StudentDto.class);
    }
}
