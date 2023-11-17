package com.project.expensesTrackerBacked.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Date dateOfBirth;
	private String bio;
	private int phone;
	private int income;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	public UserEntity(Long userId, String firstName, String lastName, String email, String gender, Date dateOfBirth,
			String bio, int phone, int income) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.bio = bio;
		this.phone = phone;
		this.income = income;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", bio=" + bio + ", phone=" + phone
				+ ", income=" + income + "]";
	}
	
}
