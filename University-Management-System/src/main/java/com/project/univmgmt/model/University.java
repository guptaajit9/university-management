package com.project.univmgmt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNIVERSITIES")
public class University implements Serializable{
	
	private static final long serialVersionUID = -5873864295268790857L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UNIVERSITY_ID")
	private Integer universityId;

	@Column(name = "UNIVERSITY_NAME")
	private String universityName;

	@Column(name = "CITY")
	private String city;

	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Universities [universityId=" + universityId + ", universityName=" + universityName + ", city=" + city
				+ "]";
	}
	

}
