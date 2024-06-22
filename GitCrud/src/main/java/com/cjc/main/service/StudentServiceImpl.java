package com.cjc.main.service;

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

}
