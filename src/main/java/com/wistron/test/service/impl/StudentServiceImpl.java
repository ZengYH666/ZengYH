package com.wistron.test.service.impl;

import java.util.List;

import com.wistron.test.entity.Student;
import com.wistron.test.mapper.StudentMapper;
import com.wistron.test.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudent(Integer id) {
        return studentMapper.getStudent(id);
    }    
    @Override
    public List<Student> getStudents() {
        return studentMapper.getStudents();
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }


}