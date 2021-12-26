package com.bridgelabz.services;
import com.bridgelabz.entity.Contact;
import com.bridgelabz.interfaces.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * implementation class for all abstract methods present inside the interface.
 */
public class ContactImpl implements IContact{

	Contact contact = new Contact();
	List<Contact> list = new ArrayList<Contact>();	
	@Override
	public List<Contact> addNewContact(Contact contact){

		list.add(contact);
		if(list.isEmpty()) {
			System.out.println("Record Not found..");
		}else {
			System.out.println("Record added successfully..");
		}
		return list;
	}

	@Override
	public List<Contact> updatePerson(Contact contact) {
		if(list.isEmpty()) {
			System.out.println("Record Not found..");
		}
		for(Contact contct : list) {

			if (contct.getFirstName().equalsIgnoreCase(contact.getFirstName())) {
				contct.setFirstName(contact.getFirstName());
				contct.setLastName(contact.getLastName());
				contct.setAddress(contact.getAddress());
				contct.setCity(contact.getCity());
				contct.setState(contact.getState());
				contct.setEmail(contact.getEmail());
				contct.setPhoneNumber(contact.getPhoneNumber());
				contct.setZip(contact.getZip());
			}
		}
		return list;
	}

	@Override
	public void showContacts() {
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Contact obj =  (Contact)itr.next();
			System.out.println("First Name : "+obj.getFirstName());
			System.out.println("Last Name : "+obj.getLastName());
			System.out.println("Address : "+obj.getAddress());
			System.out.println("City : "+obj.getCity());
			System.out.println("State : "+obj.getState());
			System.out.println("Email : "+obj.getEmail());
			System.out.println("Phone Number : "+obj.getPhoneNumber());
			System.out.println("Zip : "+obj.getZip());
		}
	}

	@Override
	public void deleteByName(String firstName) {
		try {
			for (Contact contct : list) {
				if (contct.getFirstName().equalsIgnoreCase(firstName)) {
					list.remove(contct);
					System.out.println("Delete successful");
				}
				else {
					System.out.println("Record not present with given name..");
				}
			}
		}catch(Exception e) {
			//System.out.println(e.getMessage());
		}	
	}

}
