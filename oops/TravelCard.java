package oops;

public class TravelCard extends PrepaidCard implements Rewardable{
	int rewardPoints=0;

	public TravelCard(int cardNo, double availableBalance, double swipeLimit, int rewardPoints) {
		super(cardNo, availableBalance, swipeLimit);
		this.rewardPoints = rewardPoints;
	}
	
	public TravelCard()
	{
		super();
	}

	@Override
	public boolean swipeCard(double amount) {
		amount=amount*60;
		if(amount<=swipeLimit && amount<=availableBalance)
		{
			double remainBalance = availableBalance-amount;
			remainBalance=remainBalance-(0.05*remainBalance);
			System.out.println("Balance after withdrawal: " +remainBalance);
			System.out.println("Transaction Successfull");
			return true;
		}
		else
		{
			System.out.println("Transaction failed");
			return false;
		}
	}
	
	public double reward(double amount)
	{
		while(amount>=100)
		{
			rewardPoints = rewardPoints+5;
			amount=amount-100;
		}
		return rewardPoints;
	}

	@Override
	public double rewards(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
}
