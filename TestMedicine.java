package inheritanceAndAbstraction;
import java.util.Random;
public class TestMedicine {
  public static void main(String[] args) {
	  
		double d=Math.random()*4;
		int i=(int) d;
		System.out.println(i);
		
		switch(i)
		{
		case 1:
		{
			Medicine m=new Ointment(120.50,"04/12/2022");
			m.displayLabel();
			m.getDetails();
			break;
		}
		case 2:
		{
			Medicine m2=new Syrup(150.65,"11/05/2021");
			m2.displayLabel();
			m2.getDetails();
			break;
		}
		case 3:
		{
			Medicine m3=new Tablet(85.65,"06/08/2020");
			m3.displayLabel();
			m3.getDetails();
			break;
		}
		}
	}
}
