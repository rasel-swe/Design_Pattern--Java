package Prototype;

public class Triangle implements Shape{
	private int height;
	private int width;
	
	public void setHeight(int h) {
		this.height = h;
	}
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	public int gettWidth() {
		return width;
	}
	
	public void area() {
		System.out.println("Calculatiing area of triangle");
	}
	
	public Shape clone() {
		Triangle tr = new Triangle();
		tr.setHeight(height);
		tr.setWidth(width);
		return tr;
	}
	
}
