package com.bridgelabz.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.entity.Contact;
import com.bridgelabz.services.ContactImpl;

public class AddressBookMain {
	public static void getInputFromUser() {
		ContactImpl con = new ContactImpl();
		Scanner sc = new Scanner(System.in);
		List<Contact> list = new ArrayList<Contact>();
		System.out.println("Add Your Contact details");
		System.out.println("Enter your friend\'s firstName:");
		String firstName = sc.next();
		System.out.println("Enter your friend\'s lastName:");
		String lastName = sc.next();
		System.out.println("Enter your friend\'s address:");
		String address = sc.next();
		System.out.println("Enter your friend\'s city:");
		String city = sc.next();
		System.out.println("Enter your friend\'s state:");
		String state = sc.next();
		System.out.println("Enter your friend\'s email:");
		String email = sc.next();
		System.out.println("Enter their phone number.");
		String phoneNumber = sc.next();
		System.out.println("Enter their zip code.");
		String zip = sc.next();
		list = con.addNewContact(new Contact(firstName,lastName,address,city,state,email,phoneNumber,zip));
	}
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program...");
	getInputFromUser();
}
}
