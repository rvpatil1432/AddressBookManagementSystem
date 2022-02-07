package com.bridgelabz.entity;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import com.bridgelabz.exceptions.ContactPersonException;

/*
 * Entity class to add contact information. 
 */
public class Contact {
	String firstName, lastName, address, city, state, email;
	long phoneNumber;
	long zip;
	boolean patternMatch;

	public Contact(String firstName, String lastName, String address, String city, String state, String email,
			long phoneNumber, long zip) throws ContactPersonException {
		this.firstName = firstName;
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Predicate<String> predicate = pattern.asPredicate();
		patternMatch = predicate.test(firstName);
		if (patternMatch == false) {
			throw new ContactPersonException("Invalid First Name.",
					ContactPersonException.ExceptionType.FIRST_NAME_EXCEPTION);
		}
		this.lastName = lastName;
		patternMatch = predicate.test(lastName);
		if (patternMatch == false) {
			throw new ContactPersonException("Invalid Last Name.",
					ContactPersonException.ExceptionType.FIRST_NAME_EXCEPTION);
		}
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
	}
//
//	public Contact() {
//		this.firstName = "";
//		this.lastName = "";
//		this.address = "";
//		this.city = "";
//		this.state = "";
//		this.email = "";
//		this.phoneNumber = "";
//		this.zip = "";
//	}

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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
	}

}