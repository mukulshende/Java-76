package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/postStudent")
	public ResponseEntity<Student> addStudentData(@RequestBody Student st)
	{
		Student stu= studentService.postStudent(st);
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> st=studentService.getAllStudentData();
		return new ResponseEntity<List<Student>>(st,HttpStatus.OK);
	}

}
