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
		Scanner obj = new Scanner(System.in);
		int flag = 1;
	  while(flag == 1)
		{
			System.out.println(" Choose your choice : 1.Add 2.Exit ");
			int choice = obj.nextInt();
			switch(choice)
			{
			case 1:
				addContact();
			break;
			case 2:
				flag = 0;
			break;
			default:
				System.out.println("Enter a valid choice");
				break;
			}
		}

		System.out.println(contactList);		
	}
	

}
