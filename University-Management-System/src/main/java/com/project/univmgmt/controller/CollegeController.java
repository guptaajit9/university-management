package com.project.univmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.univmgmt.model.College;
import com.project.univmgmt.request.SaveCollegeRequest;
import com.project.univmgmt.service.CollegeService;

@RestController
@RequestMapping(value="/college")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping(value="/saveCollege")
	public List<College> saveCollege(@RequestBody SaveCollegeRequest saveCollegeReq){
		return collegeService.saveCollege(saveCollegeReq.getCollege());
	}
	
	@GetMapping(value="/getColleges")
	public List<College> getColleges(){
		return collegeService.getColleges();
	}
	
	@GetMapping(value="/getCollegesInOrder")
	public List<College> getCollegesInOrder(@RequestParam Integer pageNumber, @RequestParam Integer pageSize){
		return collegeService.getCollegesInOrder(pageNumber,pageSize);
	}
	
	@PostMapping(value="/deleteCollege")
	public String deleteCollege(College college) {
		return collegeService.deleteCollege(college.getCollegeId());
	}
	
	@PostMapping(value="/updateCollege")
	public String updateCollege(@RequestBody SaveCollegeRequest saveCollegeReq) {
		return collegeService.updateCollege(saveCollegeReq.getCollege());
	}

}
