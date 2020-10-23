package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
	static List<AddressBookManage> contactList = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	
	//method for adding contacts
	public  static void addContact()
	{
		System.out.println(" Enter your first name : ");
		String firstName = input.nextLine();
		System.out.println(" Enter your last name : ");
		String lastName = input.nextLine();
		System.out.println(" Enter your city name : ");
		String city = input.nextLine();
		System.out.println("Enter your state  : ");
		String state = input.nextLine();
		System.out.println(" Enter your zip code : ");
		String zip = input.nextLine();
		System.out.println(" Enter your phone number : ");
		String phone = input.nextLine();
		System.out.println(" Enter your email : ");
		String email = input.nextLine();
		
		AddressBookManage addressBook = new AddressBookManage(firstName,lastName,city,state,zip,phone,email);
		contactList.add(addressBook);			
		
	}
 
	//main Method
	public static void main(String[] args) {
		System.out.println(" Welcome to address book program ");
		addContact();
		System.out.println(contactList);		
	}
	

}
