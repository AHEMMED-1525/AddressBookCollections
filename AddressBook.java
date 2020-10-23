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
		// No duplicate entries Allow
		for (int index = 0 ; index < contactList.size(); index ++)
		{
			if(firstName.equals(contactList.get(index).getFirstName()))
			{
				System.out.println(" The name already exists ");
				AddressBookSystem.entryOptions();
			}
		}
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
		AddressBookManage addressBookSystem = new AddressBookManage(firstName,lastName,city,state,zip,phone,email);
			contactList.add(addressBookSystem);			
		
	}
// method for editing existing contact
	public void editContact()
	{
		Scanner nameInput = new Scanner(System.in);
		System.out.println(" Enter the first name ");
		String fName = nameInput.nextLine();
		for(int index = 0 ; index < contactList.size(); index++)
		{
			if (contactList.get(index).getFirstName().equals(fName))
			{
				contactList.remove(index);
				AddressBook addressBook = new AddressBook();
				addressBook.addContact();				
			}
			else
			{
				System.out.println(" There is no contact ");
			}
		}
	}
 
	public void deleteContact()
	{
		Scanner deleteNameInput = new Scanner(System.in);
		String deleteFirstName = deleteNameInput.nextLine();
		for (int increment = 0 ; increment < contactList.size(); increment++)
		{
			if(contactList.get(increment).getFirstName().equals(deleteFirstName))
			{
				contactList.remove(increment);
			}
			else
			{
				System.out.println(" Name does not exist");
			}
		}
	}
	//Search a person 
	public void searchByCity()
	{
		Scanner cityInput = new Scanner(System.in);
		System.out.println(" Enter the city name you want to get contact details ");
		String city = cityInput.nextLine();
		for (AddressBookManage cityList : contactList)
		{
			if ( cityList.getCity().equals(city))
				System.out.println(cityList);
		}
		
	}
	

}
