package com.bridgelabz.entity;
/*
 * Entity class to add contact information. 
 */
public class Contact
{
	String firstName,lastName,address,city,state,email;
	String phoneNumber;
	String zip;
	
	
	public Contact(String firstName, String lastName, String address, String city,
			String state, String email, String phoneNumber, String zip)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
	}

	public Contact() {
		this.firstName = "";
		this.lastName = "";
		this.address = "";
		this.city = "";
		this.state = "";
		this.email = "";
		this.phoneNumber = "";
		this.zip = "";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String string) {
		this.phoneNumber = string;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
	}

	
}