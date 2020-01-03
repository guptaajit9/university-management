package com.project.univmgmt.request;

import java.util.List;

import com.project.univmgmt.model.Student;

public class SaveStudentRequest {
    
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	

	
}
