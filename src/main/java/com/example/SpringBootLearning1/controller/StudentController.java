package com.example.SpringBootLearning1.controller;

import com.example.SpringBootLearning1.dto.AddStudentRequestDto;
import com.example.SpringBootLearning1.dto.StudentDto;
import com.example.SpringBootLearning1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        //return ResponseEntity.status(HttpStatus.OK).body((studentService.getAllStudents()));
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {

        return ResponseEntity.ok(studentService.getStudentById(id));

    }


@PostMapping
   public ResponseEntity<StudentDto>createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
       return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
}

@DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteAStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
}

}
