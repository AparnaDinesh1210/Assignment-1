package Assignment;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n  = sc.nextInt();
		
		int rev = 0, d;
		while(n!=0)
		{
			d = n%10;
			rev = rev*10 + d;
			n = n/10;
		}
		
		System.out.println("Enter the reversed number: " +rev);

	}

}
