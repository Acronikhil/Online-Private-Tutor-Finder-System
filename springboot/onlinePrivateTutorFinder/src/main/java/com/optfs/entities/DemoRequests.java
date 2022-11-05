package com.optfs.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class DemoRequests {

	@Id
	@GeneratedValue
	private Integer demoId;

	@OneToOne(cascade = CascadeType.ALL)
	private Parent parent;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Tutor tutor;

	public DemoRequests() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public DemoRequests(Integer demoId, Parent parent, Tutor tutor) {
		super();
		this.demoId = demoId;
		this.parent = parent;
		this.tutor = tutor;
	}



	public Integer getDemoId() {
		return demoId;
	}

	public void setDemoId(Integer demoId) {
		this.demoId = demoId;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}



	@Override
	public String toString() {
		return "DemoRequests [demoId=" + demoId + ", parent=" + parent + ", tutor=" + tutor + "]";
	}

	

}
