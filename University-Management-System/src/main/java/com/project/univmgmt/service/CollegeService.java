package com.project.univmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.project.univmgmt.model.College;
import com.project.univmgmt.repo.CollegeRepo;


@Service
public class CollegeService {

	@Autowired
	private CollegeRepo collegeRepo;
	
	public List<College> saveCollege(List<College> college) {
		
		return collegeRepo.saveAll(college);
	}
	
	public List<College> getColleges() {
		return collegeRepo.findAll();
	}
	
	@SuppressWarnings({ "deprecation" })
	public List<College> getCollegesInOrder(Integer pageNumber, Integer pageSize) {
		Sort sort=new Sort(Direction.ASC,"collegeName");
		Pageable pageRequest=new PageRequest(pageNumber, pageSize, sort);
		return collegeRepo.findAll(pageRequest).getContent();
	}

	public String deleteCollege(Integer collegeId) {
		collegeRepo.deleteById(collegeId);
		return "deletion successful!!!";
	}

	public String updateCollege(List<College> collegeList) {
		List<College> updatedCollegeList=new ArrayList<College>();
		for(College college:collegeList)
		{
			College existCollege=collegeRepo.getOne(college.getCollegeId());
			existCollege.setCity(college.getCity());
			existCollege=collegeRepo.save(existCollege);
			updatedCollegeList.add(existCollege);
		}
		  return "updation successful!!!!";
	}

}
