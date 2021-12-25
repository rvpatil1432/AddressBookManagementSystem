package com.bridgelabz.interfaces;

import java.util.List;

import com.bridgelabz.entity.*;
/*
 * interface having methods for future implementations.
 */
public interface IContact 
{
	public List<Contact> addNewContact(Contact contact);
	
	public List<Contact> updatePerson(Contact contact);
	
	public void showContacts();

}
