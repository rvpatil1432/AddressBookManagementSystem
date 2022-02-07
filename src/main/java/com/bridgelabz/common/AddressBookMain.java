package com.bridgelabz.common;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.entity.Contact;
import com.bridgelabz.exceptions.ContactPersonException;
import com.bridgelabz.services.ContactImpl;

public class AddressBookMain {
	public static void menu() {

		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Display contact");
		System.out.println("3.Edit a contact from your address book.");
		System.out.println("4.Delete contact from your address book.");
		System.out.println("5.Quit.");
		System.out.println("Enter your menu choice:");
	}
	public static void getInputFromUser() throws ContactPersonException {
		ContactImpl con = new ContactImpl();
		Scanner sc = new Scanner(System.in);
		List<Contact> list = new ArrayList<Contact>();
		Contact c;
		
		menu();
		int choice = sc.nextInt();
		while (choice!=5) {
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
				long phoneNumber = sc.nextLong();
				System.out.println("Enter their zip code.");
				long zip = sc.nextLong();
				try {
					c = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);
					list = con.addNewContact(c);
				} catch (ContactPersonException e) {
					// TODO Auto-generated catch block
					System.out.println(e.message);
				}catch (InputMismatchException e) {
					// TODO Auto-generated catch block
					throw new ContactPersonException("You did not input a number. Please try again!",
							ContactPersonException.ExceptionType.NOT_NUMBER);
				}
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
				long phoneNumber = sc.nextLong();
				System.out.println("Enter their zip code.");
				long zip = sc.nextLong();
				
				try {
					c = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);
					list = con.updatePerson(c);
				} catch (ContactPersonException e) {
					// TODO Auto-generated catch block
					System.out.println(e.message);
				}
				
				System.out.println("Modification succeeded!!");
			}
			else if (choice == 4) {
				System.out.println("Enter name to delete contact");
				String name = sc.next();

				con.deleteByName(name);
			}
			else if (choice == 5) {
				System.out.println("You choosed to Quit..");
				System.exit(0);
			}
			else if (choice !=5) {
				System.out.println("Sorry, that was an invalid menu choice, try again.");
			}
			menu();
			choice = sc.nextInt();
		}
	}
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program...");
	try {
		getInputFromUser();
	} catch (ContactPersonException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
