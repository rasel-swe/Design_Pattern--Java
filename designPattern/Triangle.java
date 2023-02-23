package designPattern;

public class Triangle extends Shape{
	
	double height;
	double base;
	
	Triangle( double h, double b){
		
		this.height = h;
		this.base = b;
	}
double area() {
		
	return 0.5*height*base;

	}

}
