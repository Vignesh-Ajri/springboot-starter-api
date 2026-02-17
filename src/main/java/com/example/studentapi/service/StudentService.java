
package com.example.studentapi.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.model.Student;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
