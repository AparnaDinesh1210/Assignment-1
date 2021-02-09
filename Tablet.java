package inheritanceAndAbstraction;

public class Tablet extends Medicine {
    public Tablet(double price, String expiryDate) {
		super(price, expiryDate);
	}
    @Override
	void displayLabel() {
		System.out.println("Keep it in dry place");
	}
}
