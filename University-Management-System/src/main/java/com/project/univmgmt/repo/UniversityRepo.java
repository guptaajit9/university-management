package com.project.univmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.univmgmt.model.University;

@Repository
public interface UniversityRepo extends JpaRepository<University,Integer>{

}
