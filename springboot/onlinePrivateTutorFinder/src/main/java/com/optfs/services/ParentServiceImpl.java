package com.optfs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optfs.entities.Parent;
import com.optfs.exceptions.NullUserFound;
import com.optfs.repository.ParentRepository;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	ParentRepository parentRepository;

	@Override
	public Parent registerParent(Parent parent) throws NullUserFound {
		if (parent.getFirstName().isEmpty() || parent.getLastName().isEmpty() || parent.getEmail().isEmpty()
				|| parent.getPassword().isEmpty()) {
			throw new NullUserFound("Error: Null value is not accepted.");
		}
		return parentRepository.save(parent);
	}

	@Override
	public List<Parent> getAllParents() {
		
		return parentRepository.findAll();
	}

	@Override
	public Parent getParentById(Integer pid) {
		// TODO Auto-generated method stub
		return null;
	}

}
