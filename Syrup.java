package inheritanceAndAbstraction;

public class Syrup extends Medicine {
    public Syrup(double price, String expiryDate) {
		super(price, expiryDate);
	}
    @Override
	void displayLabel() {
		System.out.println("Keep out of reach of children");
		}
}
