package com.shape;

public class Rectangle implements Polygon {
	public float l;
	public float b;
	@Override
	public void calcArea() {
		float a=(l*b);
		System.out.println("Area of rectangle: " +a);
}
	@Override
	public void calcPeri() {
		float p= (2*(l+b));
		System.out.println("Perimeter of rectangle: "+p);
		}
}
