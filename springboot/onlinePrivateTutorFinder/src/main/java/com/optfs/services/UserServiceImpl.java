package com.optfs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.optfs.entities.Users;
import com.optfs.exceptions.NullUserFound;
import com.optfs.exceptions.UserIdCannotBeNull;
import com.optfs.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public String addUser(Users users) {
		try {
			if (users != null) {
				userRepo.save(users);
				return "User registered successfully" + users;
			} else {
				throw new NullUserFound("Null object found");
			}
		} catch (NullUserFound nufe) {
			System.out.println(nufe.getMessage());
			return "Error:" + nufe.getMessage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Error:" + e.getMessage();
		}
	}

	@Override
	public List<Users> getAllUser() {
		System.out.println(userRepo.findAll());
		return userRepo.findAll();
	}

	@Override
	public ArrayList<Users> getAllParents() {

		return userRepo.getAllParents();
	}

	@Override
	public ArrayList<Users> getAllTutors() {
		// TODO Auto-generated method stub
		return userRepo.getAllTutors();
	}

	@Override
	public ArrayList<Users> getAllAdmins() {
		// TODO Auto-generated method stub
		return userRepo.getAllAdmin();
	}

	@Override
	public String deleteUser(Integer userId) {
		try {
				if(userId == null) {
					throw new UserIdCannotBeNull("Null User Id sent so cant delete user");
				}
			
			  java.util.Optional<Users> u = userRepo.findById(userId);
			  if(u.isPresent()) {
				  userRepo.deleteById(userId);
			  }
			  
			 else {
				throw new NullUserFound("Cannot Delete Null User or User not found with this id: "+userId);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return e.getMessage();
		}

		return "User deleted successfully";
	}

}
