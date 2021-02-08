package exceptionassignment;

class AgeException extends Exception 
{
public AgeException(String msg) {
		super(msg);
		System.out.println("Checking Eligibility");
	}
}

class checkEligibility
{
	void checkAge(int age) throws AgeException 
	{
		if(age<18)
		{
			throw new AgeException("You are not eligible because your age is " +age);
		}
		else
		{
			System.out.println("You are eligibile");
		}
	}
}

public class AgeApp  {

	public static void main(String[] args) throws AgeException 
	{
		checkEligibility ce = new checkEligibility();
		ce.checkAge(10);
}
}
