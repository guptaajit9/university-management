package com.project.univmgmt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COLLEGES")
public class College implements Serializable{
	
	@Override
	public String toString() {
		return "Colleges [collegeId=" + collegeId + ", collegeName=" + collegeName + ", city=" + city
				+ ", universityId=" + universityId + "]";
	}

	private static final long serialVersionUID = 5681127092294408399L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COLLEGE_ID")
	private Integer collegeId;
	
	@Column(name="COLLEGE_NAME")
	private String collegeName;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="UNIVERSITY_ID")
	private Integer universityId;

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

}
