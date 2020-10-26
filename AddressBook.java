package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class AddressBook {
	static List<AddressBookManage> contactList = new ArrayList<>();
	AddressBookSystem addressBookSystem = new AddressBookSystem();
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
				System.out.println(contactList.get(index));
				Scanner editInput = new Scanner(System.in);
				System.out.println(" Enter a choice 	1.first name 2.last name 3. city 4.state 5.zip 6.phone 7.email ");
				int selection = nameInput.nextInt();
				switch (selection)
				{
					case 1: 	System.out.println(" Enter first name ");
								String first_Name = editInput.nextLine();
								contactList.get(index).setFirstName(first_Name);
								System.out.println(contactList.get(index).getFirstName());
					break;
					case 2: 	System.out.println(" Enter last name ");
								String second_Name = editInput.nextLine();
								contactList.get(index).setLastName(second_Name);
					break;
					case 3:	System.out.println(" Enter city name ");
								String input_City = editInput.nextLine();
								contactList.get(index).setCity(input_City);
					break;
               case 4:  System.out.println(" Enter State ");
                        String input_State = editInput.nextLine();
                        contactList.get(index).setCity(input_State);
               break;
               case 5:  System.out.println(" Enter pincode ");
                        String input_Zip = editInput.nextLine();
                        contactList.get(index).setCity(input_Zip);
               break;
					case 6:	System.out.println(" Enter Mobile number ");
								String input_Phone = editInput.nextLine();
								contactList.get(index).setZip(input_Phone);
					break;
               case 7:  System.out.println(" Enter Email id ");
                        String input_Email = editInput.nextLine();
                        contactList.get(index).setCity(input_Email);
               break;
					default:	System.out.println(" Enter valid input ");
 					break;
				}
			}
		}
		System.out.println(contactList);
	}
	// Remove a person contact
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
	//Search a person by city
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
	// View a person by his city
	public void viewPersonByCity()
	{
		Scanner cityViewInput = new Scanner(System.in);
		System.out.println(" Enter the city name you want to get the person details");
		String city = cityViewInput.nextLine();
		for (AddressBookManage cityList : contactList)
		{
			if ( cityList.getCity().equals(city))
				System.out.println(cityList);
		}
	}
	// Calculate No.of person
	public void countOfPersonsByCity()
	{
		int count = 0;
		Collections.sort(contactList, new SortByName());
		Scanner cityCountInput = new Scanner(System.in);
		System.out.println(" Enter the city ");
		String city = cityCountInput.nextLine();
		for ( int index = 0 ; index+1 < contactList.size() ; index ++)
		{
			if (contactList.get(index).getCity().equals(city))
			if (contactList.get(index).getCity().equals(contactList.get(index+1).getCity()))
			{
				count += 1 ;
			}
		}
		count++;
		System.out.println(" The number of persons from the city " + city + " is " + count);
	}
	// sort a person name by using java stream
	public void sortingByName()
	{
		Comparator<AddressBookSystem> sortingNameList = (firstAddressObject , secondAddessObject) -> firstAddressObject.getFirstName().compareTo(secondAddessObject.getFirstName());
		List<AddressBookSystem> sortedNames = contactList.stream().sorted(sortingNameList).collect(Collectors.toList());
		System.out.println(sortedNames);
	}

}
