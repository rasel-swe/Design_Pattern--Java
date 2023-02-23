package designPattern;

public class Rectangle extends Shape{
	
		double height;
		double width;
		
		Rectangle(double h, double w){
			
			this.height = h;
			this.width = w;
		}
	
double area() {
		
		return height* width;
	}
}
