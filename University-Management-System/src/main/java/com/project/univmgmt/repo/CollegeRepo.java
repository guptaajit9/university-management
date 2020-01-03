package com.project.univmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.univmgmt.model.College;

@Repository
public interface CollegeRepo extends JpaRepository<College,Integer>{

}
