package com.optfs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String email;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	private String password;
	private boolean isAdmin = false;
	private boolean isTutor = false;
	private boolean isParent = true;
	
	

	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public Long getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isAdmin() {
		return isAdmin;
	}



	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}



	public boolean isTutor() {
		return isTutor;
	}



	public void setTutor(boolean isTutor) {
		this.isTutor = isTutor;
	}



	public boolean isParent() {
		return isParent;
	}



	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}



	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ ", password=" + password + ", isAdmin=" + isAdmin + ", isTutor=" + isTutor + ", isParent=" + isParent
				+ "]";
	}

}
