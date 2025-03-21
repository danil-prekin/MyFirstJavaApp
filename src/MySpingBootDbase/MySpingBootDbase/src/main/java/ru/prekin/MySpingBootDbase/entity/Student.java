package ru.prekin.MySpingBootDbase.entity;

import jakarta.persistence.*;
import  lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "age")
    private int age;

// Геттеры и сеттеры
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getSurname() {
    return surname;
}

public void setSurname(String surname) {
    this.surname = surname;
}

public String getFaculty() {
    return faculty;
}

public void setFaculty(String faculty) {
    this.faculty = faculty;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}
}