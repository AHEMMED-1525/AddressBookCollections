package com.bridgelabz.addressbook;
import java.util.Comparator;

public class SortingByName implements Comparator<AddressBookSystem> {
	 @Override
    public int compare(AddressBookSystem person1, AddressBookSystem person2)
	{
        return (person1.getFirstName()).compareTo(person2.getFirstName());
    }
}
