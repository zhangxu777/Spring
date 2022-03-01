package com.xxxx.service;

import com.xxxx.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> queryStudent();
    int addStudent(Student student);
    int removeStudent(Student student);
}
