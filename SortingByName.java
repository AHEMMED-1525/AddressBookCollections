package com.bridgelabz.addressbook;
import java.util.Comparator;

public class SortingByName implements Comparator<AddressBookSystem> {
	 @Override
    public int compare(AddressBookSystem firstperson, AddressBookSystem nextperson)
	{
        return (firstperson.getFirstName()).compareTo(nextperson.getFirstName());
    }
}
