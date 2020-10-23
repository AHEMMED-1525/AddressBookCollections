package com.bridgelabz.addressbook;

public class AddressBookManage {
	private String firstName ;
	private String lastName ;
	private String city ;
	private String state;
	private String zip ;
	private String phone;
	private String email;
	
	public AddressBookManage(String firstName, String lastName, String city, String state,String zip,String phone,String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}


	@Override
	public String toString() {
		return "AddressBookSystemManage [firstName=" + firstName + ", lastName=" + lastName + ","
										+ " city=" + city	+ ", state=" + state + ","
										+ " zip=" + zip + ", phone=" + phone + ", email=" + email +"]";
	}


	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
}
