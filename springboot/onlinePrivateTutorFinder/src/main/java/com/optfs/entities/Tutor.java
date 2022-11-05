package com.optfs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Tutor {

	@Id
	@GeneratedValue
	private Integer tutorId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String subject;
	private Integer rating;
	private boolean isAvailable;
	
	

	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Tutor(Integer tutorId, String firstName, String lastName, String email, String password, String subject,
			Integer rating, boolean isAvailable) {
		super();
		this.tutorId = tutorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.subject = subject;
		this.rating = rating;
		this.isAvailable = isAvailable;
	}



	public Integer getTutorId() {
		return tutorId;
	}



	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
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



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}



	public boolean isAvailable() {
		return isAvailable;
	}



	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	@Override
	public String toString() {
		return "Tutor [tutorId=" + tutorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", subject=" + subject + ", rating=" + rating + ", isAvailable="
				+ isAvailable + "]";
	}

	
}
