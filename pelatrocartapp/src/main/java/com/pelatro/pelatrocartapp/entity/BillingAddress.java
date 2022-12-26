package com.pelatro.pelatrocartapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billingaddress")
public class BillingAddress {
	
	@Id
	@Column(name="first_name")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="country")
	private String country;
	@Column(name="streetAddress")
	private String streetAddress;
	@Column(name="apartment")
	private String apartment;
	@Column(name="city")
	private String city;
	@Column(name="district")
	private String district;
	@Column(name="postcode")
	private int postcode;
	@Column(name="phoneno")
	private int phoneno;
	@Column(name="email")
	private String email;
	@Column(name="notes")
	private String notes;
	
	
	public BillingAddress(String firstname, String lastname, String country, String streetAddress, String apartment,
			String city, String district, int postcode, int phoneno, String email, String notes) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.streetAddress = streetAddress;
		this.apartment = apartment;
		this.city = city;
		this.district = district;
		this.postcode = postcode;
		this.phoneno = phoneno;
		this.email = email;
		this.notes = notes;
	}
	public BillingAddress() {
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}	

}
