package aggregationAndEncapsulation;

import aggregationAndEncapsulation.*;


public class TestCustomerEncap {

	public static void main(String[] args) {
		Address add = new Address("1st Main HSR Layout", "Bangalore");
		Address add1 = new Address("1st Main Electronics city","Bangalore");
		add.getAddressDetails();
		
		
		Customer c = new Customer("John",add,add1);
		c.getCustomerDetails();

	}

}
