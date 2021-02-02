package Assignment;

import java.util.Scanner;

public class PatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		
		int rows = sc.nextInt();
        
        //Taking rows value from the user
         
		int i, j;  
		for (i = rows; i >= 1; i--)   
		{  
		for (j = 1; j <= i; j++)  
		{  
		System.out.print(j+" ");  
		}  
		System.out.println();  
		

	

}
	}
}