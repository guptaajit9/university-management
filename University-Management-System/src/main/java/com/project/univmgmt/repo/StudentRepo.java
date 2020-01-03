package com.project.univmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.univmgmt.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
