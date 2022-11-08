package com.optfs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optfs.entities.DemoRequests;
import com.optfs.exceptions.NullValuesFoundException;
import com.optfs.repository.DemoRequestRepository;

@Service
public class DemoRequestServiceImpl implements DemoRequestService {
	
	@Autowired
	DemoRequestRepository demoReqRepo;

	@Override
	public DemoRequests addDemoRequests(DemoRequests d) throws NullValuesFoundException {
		
		if(d == null || d.getParent().getId() == null || d.getParent().getId() == 0 || d.getTutor().getId() == null || d.getTutor().getId() == 0 ) {
			throw new NullValuesFoundException("Cannot Add Demo Request! Null entries in ParentId or UserId.");
		}
		
		
		return demoReqRepo.save(d);
	}

	@Override
	public List<DemoRequests> getDemoRequestsByTutorId(Integer tId) throws NullValuesFoundException {
		if(tId == 0 || tId == null) {
			throw new NullValuesFoundException("Can't get demo request for null tutor.");
		}
		return demoReqRepo.getDemoRewuestByTutorId(tId);
	}

	@Override
	public List<DemoRequests> getDemoRequestsByParentId(Integer pId) throws NullValuesFoundException {
		if(pId == 0 || pId == null) {
			throw new NullValuesFoundException("Can't get demo request for null parent.");
		}

		return demoReqRepo.getDemoRequestByParentId(pId);
	}

	@Override
	public DemoRequests updateDemoRequest(Integer d) {
		DemoRequests dem = demoReqRepo.findById(d).get();
		dem.setAccepted(true);
		
		return demoReqRepo.save(dem);
	}

	@Override
	public void deleteDemoRequest(DemoRequests d) {
		d.getParent().setId(1);
		demoReqRepo.save(d);
		demoReqRepo.delete(d);
		
	}

}
