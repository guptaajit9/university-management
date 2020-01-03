package com.project.univmgmt.request;

import java.util.List;

import com.project.univmgmt.model.College;

public class SaveCollegeRequest {
	private List<College> college;

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}
	

}
