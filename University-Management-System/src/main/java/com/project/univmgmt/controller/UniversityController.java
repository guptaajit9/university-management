package com.project.univmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.univmgmt.model.University;
import com.project.univmgmt.request.SaveUniversityRequest;
import com.project.univmgmt.service.UniversityService;

@RestController
@RequestMapping(value="/university")
public class UniversityController {
	
	@Autowired
	private UniversityService universityService;
	
	@PostMapping(value="/saveUniversity")
	public List<University> saveUniversity(@RequestBody SaveUniversityRequest saveUnivReq) {
		return universityService.saveUniversity(saveUnivReq.getUniversity());
	}
	
	@GetMapping(value="/getUniversity")
	public List<University> getUniversity(){
		return universityService.getUniversity();
		
	}
	
	@GetMapping(value="/getUniversityInOrder")
	public List<University> getUniversityInOrder(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
		return universityService.getUniversityInOrder(pageNumber, pageSize);
	}
	
	@PostMapping(value="/deleteUniversity")
	public String deleteUniversity(@RequestBody University university) {
		return universityService.deleteUniversity(university.getUniversityId());
	}
	
	@PostMapping(value="/updateUniversity")
    public String updateUniversity(@RequestBody SaveUniversityRequest saveUnivReq) {
		return universityService.updateUniversity(saveUnivReq.getUniversity());
	}
	
		   

}
