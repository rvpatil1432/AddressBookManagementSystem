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
}
