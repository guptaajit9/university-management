package com.project.univmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.univmgmt.model.Student;
import com.project.univmgmt.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired StudentRepo studentRepo;

	public List<Student> saveStudents(List<Student> student) {
		return studentRepo.saveAll(student);
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public String deleteStudent(Integer studentId) {
		studentRepo.deleteById(studentId);
		return "deletion successful!!!";
	}

	public String updateStudent(List<Student> studentList) {
		List<Student> updatedStudentList = new ArrayList<Student>();
		for(Student student:studentList)
		{
		Student existStudent=studentRepo.getOne(student.getStudentId());
		existStudent.setEmailId(student.getEmailId());
	    existStudent=studentRepo.save(existStudent);
	    updatedStudentList.add(existStudent);
	}
		return "updation successful!!";
}
}
