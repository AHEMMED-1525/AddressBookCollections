package com.bridgelabz.addressbook;

import java.util.Comparator;

public class SortByName implements Comparator<AddressBookSystem>
{
	public int compare(AddressBookSystem firstPerson , AddressBookSystem nextPerson)
	{
		return firstPerson.getFirstName().compareTo(nextPerson.getFirstName());
	}
}
