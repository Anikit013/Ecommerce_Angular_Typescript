package com.pelatro.pelatrocartapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users") //if we don't give the table name here, it will take default table name as a class name
public class Users  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int userid;
	@Column(name="first_name") //we we don't give the column name here, it will take default as the variable name
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	public Users() {
		super();
	
	}

public Users(int id, String firstname, String lastname, String email, String password) {
		super();
		this.userid = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}



	public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Users get() {
		// TODO Auto-generated method stub
		return null;
	}

	




}

//Start with creating the Entities

//Entities -------->> UserRepository