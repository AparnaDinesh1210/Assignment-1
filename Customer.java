package aggregationAndEncapsulation;

import assignment3.*;

class Address
{
	private String addressLine;
	private String city;
	public String officialAddress;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	void getAddressDetails()
	{
		
	}
	
}

public class Customer {
	private String customerName;
	Address residentialAddress;
	Address officialAddress;
	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

	void getCustomerDetails()
	{
		System.out.println("Customer : " +customerName);
		System.out.println("Residential Address : "+residentialAddress.getAddressLine() +"," + residentialAddress.getCity());
		System.out.println("Official Address: "+officialAddress.getAddressLine()+"," +officialAddress.getCity());
	}
}
