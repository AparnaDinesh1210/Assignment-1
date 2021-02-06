package Assignment2;

public class CarTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car(1965,"Bat Mobile");
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		c.accelerate();
		System.out.println(c.getSpeed());
		
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		c.brake();
		System.out.println(c.getSpeed());
		

	}

}
