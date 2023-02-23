package Prototype;

public class Circle implements Shape{
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Calculating Area");
	}
	
	public Shape clone() {
		Circle newCircle = new Circle();
		newCircle.setRadius(radius);
		return newCircle;
	}
}

