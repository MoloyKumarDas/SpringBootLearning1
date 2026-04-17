package com.example.SpringBootLearning1.repository;

import com.example.SpringBootLearning1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // optional
public interface StudentRepository extends JpaRepository<Student, Long> {     // incide JpaReposity there are many method
}
