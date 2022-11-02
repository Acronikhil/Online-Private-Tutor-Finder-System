package com.optfs.services;

import java.util.ArrayList;
import java.util.List;

import com.optfs.entities.Users;

public interface UserService {
	
	public String addUser(Users users);
	
	public List<Users> getAllUser();
	
	public ArrayList<Users> getAllParents();
	
	public ArrayList<Users> getAllTutors();
	
	public ArrayList<Users> getAllAdmins();
	
	public String deleteUser(Integer delUserId);
	
	

}
