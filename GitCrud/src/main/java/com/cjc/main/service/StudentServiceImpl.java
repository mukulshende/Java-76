package com.cjc.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;

@Service
public class StudentServiceImpl  implements StudentService{

 @Autowired
 StudentRepository sr;

	public Student postStudent(Student st) {
		Student stu=sr.save(st);
		return stu;
	}

	@Override
	public List<Student> getAllStudentData() {
		Iterable<Student> st=sr.findAll();
		return (List<Student>)st;
	}

}
