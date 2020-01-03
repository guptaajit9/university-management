package com.project.univmgmt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student implements Serializable{

	private static final long serialVersionUID = 1550667976576350710L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private Integer studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STREAM")
	private String stream;

	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="COLLEGE_ID")
	private Integer collegeId;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	
		
	
}
