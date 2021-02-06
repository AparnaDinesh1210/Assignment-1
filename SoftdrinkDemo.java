package day8;

interface Softdrink
{
	String colourOfDrink(String colour);
	String tasteOfDrink(String taste);
}

class Pepsi implements Softdrink
{

	@Override
	public String colourOfDrink(String colour) {
		return colour;
	}

	@Override
	public String tasteOfDrink(String taste) {
		return taste;
	}
	
}

class Mazza implements Softdrink
{

	@Override
	public String colourOfDrink(String colour) {
		// TODO Auto-generated method stub
		return colour;
	}

	@Override
	public String tasteOfDrink(String taste) {
		// TODO Auto-generated method stub
		return taste;
	}
	
}

public class SoftdrinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Softdrink p = new Pepsi();
		
		System.out.println("The colour of pepsi : "+ p.colourOfDrink("Black"));
		System.out.println("The taste of pepsi : " +p.tasteOfDrink("Sweet"));
		
		Softdrink m = new Mazza();
	
		System.out.println("The colour of mazza : "+ m.colourOfDrink("Orange"));
		System.out.println("The taste of mazza : " +m.tasteOfDrink("Sweet and Juicy"));
		
		
	}

}
