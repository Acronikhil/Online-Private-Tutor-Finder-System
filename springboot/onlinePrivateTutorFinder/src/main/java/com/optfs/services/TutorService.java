package com.optfs.services;

import java.util.List;

import com.optfs.entities.Tutor;
import com.optfs.exceptions.NullUserFound;

public interface TutorService {
	
	public Tutor registerTutor(Tutor tutor) throws NullUserFound;
	
	public List<Tutor> getAllTutors();
	
	public Tutor getTutorById(Integer pid) throws NullUserFound;
	
	public Tutor updateTutor(Tutor tutor) throws NullUserFound;
	
	public String deleteTutor(Tutor tutor) throws NullUserFound;
	
	
}
