package com.optfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.optfs.entities.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Integer> {
	
	@Query("from Tutor p where p.id=:id")
	public Tutor getTutorById(@Param(value="id")Integer id );
	

}
