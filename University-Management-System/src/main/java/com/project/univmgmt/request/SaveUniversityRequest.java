package com.project.univmgmt.request;

import java.util.List;

import com.project.univmgmt.model.University;

public class SaveUniversityRequest {
	
	public List<University> university;

	public List<University> getUniversity() {
		return university;
	}

	public void setUniversity(List<University> university) {
		this.university = university;
	}
	

}
