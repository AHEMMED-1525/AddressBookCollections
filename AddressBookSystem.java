package com.bridgelabz.addressbook;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class AddressBookSystem {
	// Main method
	public static void main(String[] args) {
		entryOptions();
	}

	static Map<String, AddressBookSystem> multipleAddressMap = new HashMap<>();

	public static void registerEntry()
	{
		AddressBookSystem addressBookSystem = new AddressBookSystem();
		Scanner registerInput = new Scanner(System.in);
		System.out.println(" Enter choice \n1. creating new addressbook \n2. adding contacts in existing register \n3. exit ");
		int registerEntry = registerInput.nextInt();
		if (registerEntry != 3 )
		{
			switch(registerEntry)
			{
				case 1 : 	Scanner nameInput = new Scanner(System.in);
							System.out.println(" Enter name of address book ");
							String nameOfNewRegister = nameInput.nextLine();
							if (multipleAddressMap.containsKey(nameOfNewRegister))
							{
								System.out.println(" address book already exists");
								break;
							}
							multipleAddressMap.put(nameOfNewRegister, addressBookSystem);
							System.out.println(" address  book" + nameOfNewRegister + " has been added");
							addressBookSystem.entryOptions();
				break;
				case 2 :	Scanner existingNameInput = new Scanner(System.in);
							System.out.println(" Enter name of address book ");
							String nameOfExistingRegister = existingNameInput.nextLine();
							if (multipleAddressMap.containsKey(nameOfExistingRegister))
		   					{
								multipleAddressMap.get(nameOfExistingRegister).entryOptions();
		   					}
		   					else
		   						System.out.println(" address book is not found ");
				case 3 :	registerEntry = 3 ;
				break;
				default : System.out.println(" Enter valid input ");
				break;
			}
		}
	}

	// Contact to Create,update,delete method
	public static void entryOptions() {
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		int flag = 1 ;
		while(flag == 1)
		{
			System.out.println(" Welcome to address book program ");
			System.out.println(" Select a choice : 1. Add 2.Edit 3.Delete 4.Search 5.View person 6.count no.of peoples in same city 7.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
					addressBook.addContact();
				break;
				case 2 :
					if (addressBook.contactList.isEmpty())
						 {
							System.out.println(" Address book is empty ");
							break;
						 }
						addressBook.editContact();
				break;
				case 3:
					 if (addressBook.contactList.isEmpty())
					 {
						System.out.println(" Address book is empty ");
						break;
					 }
					 addressBook.deleteContact();
				break;
				case 4:
					addressBook.searchByCity();
				break;
				case 5 :
					if (addressBook.contactList.isEmpty())
				  		{
							System.out.println(" Address book is empty ");
							break;
				  		}
				  		addressBook.viewPersonByCity();
				break;
				case 6:
						addressBook.countOfPersonByCity();
				break;
				case 7 :
					flag = 0 ;
				break;
				default:
					System.out.println(" Enter a valid choice");
				break;
			}
		}
		System.out.println(addressBook.contactList);
	}

}
