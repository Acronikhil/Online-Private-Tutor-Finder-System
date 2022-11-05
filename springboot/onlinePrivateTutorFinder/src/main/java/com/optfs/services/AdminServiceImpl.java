package com.optfs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optfs.entities.Admin;
import com.optfs.exceptions.NullUserFound;
import com.optfs.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin registerAdmin(Admin admin) throws NullUserFound {
		if (admin.getFirstName().isEmpty() || admin.getLastName().isEmpty() || admin.getEmail().isEmpty()
				|| admin.getPassword().isEmpty()) {
			throw new NullUserFound("Error: Null value is not accepted.");
		}
		else if (admin.getFirstName().equals("string") || admin.getLastName().equals("string") || admin.getPassword().equals("string") || admin.getEmail().equals("string") ) {
			throw new NullUserFound("Error: Null value is not accepted.");
		}
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {
		
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Integer pid) throws NullUserFound {
		if(pid == 0) {
			throw new NullUserFound("Null value is not excepted");
		}
		
		return adminRepository.getAdminById(pid) ;
	}

	@Override
	public Admin updateAdmin(Admin admin) throws NullUserFound {
		Admin p =  getAdminById(admin.getId());
		
		if(p == null) {
			throw new NullUserFound("No Admin Exixts with same this id: "+ admin.getId());
		}
		
		return adminRepository.save(admin);
	}

	@Override
	public String deleteAdmin(Admin admin) throws NullUserFound {
Admin p =  getAdminById(admin.getId());
		
		if(p == null) {
			throw new NullUserFound("No Admin Exixts with same this id: "+ admin.getId());
		}
		adminRepository.delete(p);
		return "Admin Deleted Successfully";
	}

}
