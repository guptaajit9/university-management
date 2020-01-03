package com.project.univmgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.project.univmgmt.model.University;
import com.project.univmgmt.repo.UniversityRepo;



@Service
public class UniversityService {
	
	@Autowired
	UniversityRepo universityRepo;
	
	public List<University> saveUniversity(List<University> university) {
		return universityRepo.saveAll(university);
	}
	
	public List<University> getUniversity() {
		return universityRepo.findAll();
	}
	
	@SuppressWarnings("deprecation")
	public List<University> getUniversityInOrder(Integer pageNumber, Integer pageSize) {
		Sort sort = new Sort(Direction.ASC, "universityName");
		Pageable pageRequest = new PageRequest(pageNumber, pageSize, sort);
		
		return universityRepo.findAll(pageRequest).getContent();
	}

	public String deleteUniversity(Integer universityId) {
		 universityRepo.deleteById(universityId);
		 return "deletion successful!!!";
	}

	@SuppressWarnings("unused")
	public String updateUniversity(List<University> universityList) {
		List<University> updatedUniversityList = new ArrayList<University>();
		for(University university : universityList)
		{
			University existUniv=universityRepo.getOne(university.getUniversityId());
			existUniv.setCity(university.getCity());
			existUniv = universityRepo.save(existUniv);
			updatedUniversityList.add(existUniv);
		}
		return "updation successful!!";
	}
	
   

}
