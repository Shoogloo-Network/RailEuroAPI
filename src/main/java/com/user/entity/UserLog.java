package com.user.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserLog")
public class UserLog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	String name;
	
	String email;
	String password;
	String role;
	Integer isVerified; 
	Date createdAt;
	Date  updatedAt;
	String provider;


	String address;
	String phone;
Date dob;
	public UserLog()
	{}
	public UserLog(User user) {
		this.setEmail(user.getEmail());
		this.setUserId(user.getId());
		this.setIsVerified(user.getIsVerified());
		this.setName(user.getName());
		this.setPassword(user.getPassword());
		this.setProvider(user.getProvider());
		this.setRole(user.getRole());
		this.setUpdatedAt(user.getUpdatedAt());
		this.setCreatedAt(user.getCreatedAt());
		this.setAddress(user.getAddress());
		this.setPhone(user.getPhone());
		this.setDob(user.getDob());
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(Integer isVerified) {
		this.isVerified = isVerified;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", isVerified=" + isVerified + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", provider="
				+ provider + "]";
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
