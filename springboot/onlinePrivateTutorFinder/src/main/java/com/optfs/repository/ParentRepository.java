package com.optfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.optfs.entities.Parent;

public interface ParentRepository extends JpaRepository<Parent, Integer> {
	
	@Query("from Parent p where p.parentId=:id")
	public Parent getParentById(@Param(value="id")Integer id );

}
