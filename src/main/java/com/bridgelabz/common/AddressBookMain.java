package com.bridgelabz.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.entity.Contact;
import com.bridgelabz.services.ContactImpl;

public class AddressBookMain {
	public static void menu() {

		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Display contact");
		System.out.println("3.Edit a contact from your address book.");
		System.out.println("4.Quit.");
		System.out.println("Enter your menu choice:");
	}
	public static void getInputFromUser() {
		ContactImpl con = new ContactImpl();
		Scanner sc = new Scanner(System.in);
		List<Contact> list = new ArrayList<Contact>();
		menu();
		int choice = sc.nextInt();
		while (choice!=4) {
			if (choice == 1)
			{
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
			else if (choice == 2) {
				con.showContacts();
			}
			else if (choice == 3) {
				System.out.println("Edit Your Contact details");
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
				Contact c = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);
				list = con.updatePerson(c);
				System.out.println("Modification succeeded!!");
				
			}
			else if (choice == 4) {
				System.out.println("You choosed to Quit..");
				System.exit(0);
			}
			else if (choice !=4) {
				System.out.println("Sorry, that was an invalid menu choice, try again.");
			}
			menu();
			choice = sc.nextInt();
		}

	}
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program...");
	getInputFromUser();
}
}
