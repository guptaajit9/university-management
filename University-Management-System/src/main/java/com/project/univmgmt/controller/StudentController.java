package com.project.univmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.univmgmt.model.Student;
import com.project.univmgmt.request.SaveStudentRequest;
import com.project.univmgmt.service.StudentService;


@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/saveStudents")
	public List<Student> saveStudents(@RequestBody SaveStudentRequest saveStudentReq){
		return studentService.saveStudents(saveStudentReq.getStudent());	
	}
	
	@GetMapping(value="/getStudents")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping(value="/deleteStudent")
	public String deleteStudent(@RequestBody Student student) {
		return studentService.deleteStudent(student.getStudentId());
	}
	
	@PostMapping(value="/updateStudent")
	public String updateStudent(@RequestBody SaveStudentRequest saveStudentReq) {
		return studentService.updateStudent(saveStudentReq.getStudent());
	}

}
