package com.shape;
interface Polygon
{
	void calcArea();
	void calcPeri();
}
public class Square implements Polygon {
	public float s;

	@Override
	public void calcArea() {
		float area=(s*s);
		System.out.println("Area of square is: "+ area);
}
    @Override
	public void calcPeri() {
    	float peri=(4*s);
		System.out.println("Perimeter of square is: "+ peri);
		}
}
