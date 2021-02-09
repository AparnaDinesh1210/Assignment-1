package inheritanceAndAbstraction;

abstract class Medicine {
	double price;
	String expiryDate;
	public Medicine(double price, String expiryDate)
	{
		super();
		this.price=price;
		this.expiryDate=expiryDate;
	}
	abstract void displayLabel();
	void getDetails()
	{
		System.out.println("Price of the medicine: "+ price +" and expiry date is: " + expiryDate);
}
}
