package com.xxxx.dao;

import com.xxxx.pojo.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    int updateStudent(Student student);
    int selectStudentById(Student student);
    List<Student> selectAllStudents();

}
