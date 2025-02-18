package ru.prekin.MySpingBootDbase.service;

import org.springframework.stereotype.Service;
import ru.prekin.MySpingBootDbase.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
