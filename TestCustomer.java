package assignment3;
class Address
{
	private String addressLine;
	private String city;
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
		System.out.println("Address of the employee: " + addressLine + "," +city);
	}
}
class Customer
{
	private String customerName;
	Address residentialAddress;
	
	public Customer() {
		super();
		customerName="John";
		
	
}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
        public String getCustomerName() {
		return customerName;
	}

public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

public Address getResidentialAddress() {
		return residentialAddress;
	}
public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
    void getCustomerDetails()
	{
		System.out.println("Customer : " +customerName);
		System.out.println("Residential Address : "+residentialAddress.getAddressLine() +"," + residentialAddress.getCity());
	}
	
}

public class TestCustomer {
public static void main(String[] args) {
		Address add = new Address("1st Main HSR Layout", "Banglore");
		add.getAddressDetails();
		
		Customer ct = new Customer();
		System.out.println("Customer : " +ct.getCustomerName());
		System.out.println("Residential Address : "+add.getAddressLine());
		
		
		
		Customer c = new Customer("John",add);
		c.getCustomerDetails();
}
}
