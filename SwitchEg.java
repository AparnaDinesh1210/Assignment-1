package Day3;

import java.util.Scanner;

public class SwitchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cl;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter colour code: ");
			cl = sc.next().charAt(0);
			
			switch(cl)
			{
			case 'r':
			{
				System.out.println("Red");
				break;
			}
			case 'b':
			{
				System.out.println("Blue");
				break;
			}
			case 'g':
			{
				System.out.println("Green");
				break;
			}
			case 'o':
			{
				System.out.println("Orange");
				break;
			}
			case 'y':
			{
				System.out.println("Yellow");
				break;
			}
			case 'w':
			{
				System.out.println("White");
				break;
			}
			default:
				System.out.println("Invalid code");
			}
			
			

	}

}
