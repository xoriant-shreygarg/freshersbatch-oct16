package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_MASTER")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;


	@Column(name = "FIRST_NAME")
	private String firstName;
	

	@Column(name = "LAST_NAME")
	private String lastName;
	

	@Column(name = "USERNAME")
	private String username;
	

	@Column(name = "PASSWORD")
	private String password;
	

	@Column(name = "EMAIL")
	private String email;
	

	@Column(name = "PHONE")
	private long phone;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, String username, String password, String email, long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phoneNumber;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		return this.getUsername().equals(user.getUsername());
	}
	
}