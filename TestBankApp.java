package Assignment2;

class SavingsAccount
{
	double balance;
	double intrest;
	
	public SavingsAccount(double balance, double intrest) {
		super();
		this.balance = balance;
		this.intrest = intrest;
	}
	
	void withdraw(int amount)
	{
		balance=balance-amount;
	}
	
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	
	

	public double getBalance() {
		double intrestRate = balance * (intrest/100);
		balance+=intrestRate;
		return balance;
	}

	
}

public class TestBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount s1 = new SavingsAccount(2000.00,4.35);
		s1.deposit(500);
		System.out.println(s1.getBalance());
		s1.withdraw(200);
		System.out.println(s1.getBalance());

	}

}
