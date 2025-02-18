package ru.prekin.MySpingBootDbase.controller;


import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.prekin.MySpingBootDbase.entity.Student;
import ru.prekin.MySpingBootDbase.service.StudentService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> allStudents() {
    List<Student> allStudents = studentService.getAllStudents();
    return allStudents;
}

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
    return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
    return studentService.saveStudent(student);
    }

    @PutMapping("/students")
     public Student updateStudent(@RequestBody Student student) {
    studentService.saveStudent(student);
    return student;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        }
}