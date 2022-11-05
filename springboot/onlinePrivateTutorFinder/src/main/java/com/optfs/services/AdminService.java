package com.optfs.services;

import java.util.List;

import com.optfs.entities.Admin;
import com.optfs.exceptions.NullUserFound;

public interface AdminService {
	
	public Admin registerAdmin(Admin admin) throws NullUserFound;
	
	public List<Admin> getAllAdmins();
	
	public Admin getAdminById(Integer pid) throws NullUserFound;
	
	public Admin updateAdmin(Admin admin) throws NullUserFound;
	
	public String deleteAdmin(Admin admin) throws NullUserFound;
}
