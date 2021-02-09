package com.test;
import com.shape.*;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square=new Square();
		square.s=5;
		square.calcArea();
		square.calcPeri();
		
		Rectangle rectangle=new Rectangle();
		rectangle.l=6;
		rectangle.b=4;
		rectangle.calcArea();
		rectangle.calcPeri();
}
}
