package inheritanceAndAbstraction;

public class Ointment extends Medicine {
    public Ointment(double price, String expiryDate) {
		super(price, expiryDate);
}
    @Override
	void displayLabel() {
		System.out.println("For external use only");
}
}
