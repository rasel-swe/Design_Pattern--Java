package designPattern;

public class TEst {
	public static void main(String[]args) {
		
		Shape s = new Shape();
		System.out.println(s.area());
		Triangle t =  new Triangle(10,20);
		System.out.println(t.area());
	Rectangle r = new Rectangle(20,10);
		
		System.out.println(r.area());
	}
	
	

}
