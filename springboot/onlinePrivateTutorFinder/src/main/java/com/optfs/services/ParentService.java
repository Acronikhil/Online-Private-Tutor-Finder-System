package com.optfs.services;

import java.util.List;

import com.optfs.entities.Parent;
import com.optfs.exceptions.NullUserFound;

public interface ParentService {
	
	public Parent registerParent(Parent parent) throws NullUserFound;
	
	public List<Parent> getAllParents();
	
	public Parent getParentById(Integer pid);
}
