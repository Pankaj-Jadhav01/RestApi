package com.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.model.Student;


public interface studentService {

	List<Student> getAllStudents();

	Object createStudent(Student student);




	
	
	

}
