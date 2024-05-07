package com.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.StudentRepository;
import com.rest.model.Student;
import com.rest.service.studentService;

@Service
public class StudentServiceImpl implements studentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		
		List<Student> student1= studentRepo.findAll();
		return student1;
		
	}

	@Override
	public Object createStudent(Student student) {
		return studentRepo.save(student);
		
	}


}
