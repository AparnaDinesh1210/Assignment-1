package oops;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		
		PrepaidCard pc = new TravelCard(4567846,200000,2000,3);
		Rewardable re = new TravelCard();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(pc);
		
		System.out.println("Amount : "+ pc.availableBalance/60);
		
		System.out.println("Enter the swipe amount: ");
		
		double amount = sc.nextDouble();
		pc.swipeCard(amount);
		
		System.out.println("Reward points : " +re.rewards(amount*60));

	}

}
