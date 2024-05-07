package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Student;
import com.rest.service.studentService;

@RestController
public class HomeController {
	
	@Autowired
	private studentService studentServ;

	@GetMapping("/getStudents")
	public List<Student> getAllStudents(){
		
		List<Student> s1= this.studentServ.getAllStudents();
		return s1;
	}
	
	@PostMapping("/student") 
	public ResponseEntity<?> createStudent( @RequestBody Student student) {
		System.out.println("pre process: "+student);
		
		return ResponseEntity.ok(this.studentServ.createStudent(student));
	}
	
	
}
