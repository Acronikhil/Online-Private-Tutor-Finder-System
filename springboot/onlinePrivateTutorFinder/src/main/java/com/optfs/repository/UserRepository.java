package com.optfs.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.optfs.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>  {

	
	@Query("from Users u where u.isParent=true")
	public ArrayList<Users> getAllParents();
	
	@Query("from Users u where u.isTutor=true")
	public ArrayList<Users> getAllTutors();
	
	@Query("from Users u where u.isAdmin=true")
	public ArrayList<Users> getAllAdmin();
	
	@Query("select u from Users u")
	public ArrayList<Users> getAllUsers();
	
	@Query("from Users u where u.userId=:uId")
	public Users getUserById(@Param(value="uId") Integer uId);
	
	
}
