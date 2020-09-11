package com.wistron.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wistron.test.entity.Student;
import com.wistron.test.service.StudentService;

@CrossOrigin // 解决跨域问题
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/{stuId}")
	public Student getStudent(@PathVariable Integer stuId) {
		return studentService.getStudent(stuId);
	}

	@RequestMapping("/getStudents")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@RequestMapping("/insert")
	public String insert(Student student) {
		// student.setId(5);
		student.setStuName("add");
		student.setStuSex("man");
		student.setStuTime("20170418");
		if (studentService.insert(student) == 1) {
			return "添加成功";
		} else {
			return "添加失败";
		}
	}
}