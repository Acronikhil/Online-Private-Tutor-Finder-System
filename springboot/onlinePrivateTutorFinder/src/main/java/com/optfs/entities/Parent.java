package com.optfs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Parent {

	@Id
	@GeneratedValue
	private Integer parentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(Integer parentId, String firstName, String lastName, String email, String password) {
		super();
		this.parentId = parentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + "]";
	}

}
