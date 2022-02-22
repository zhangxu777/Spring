package com.xxxx.service.impl;

import com.xxxx.dao.StudentDao;
import com.xxxx.pojo.Student;
import com.xxxx.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryStudent(Student student) {
        List<Student> students =  studentDao.selectAllStudents();
        return students;
    }

    @Override
    public int addStudent(Student student) {
        int row = studentDao.insertStudent(student);
        return row;
    }
}
