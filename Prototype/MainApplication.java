package Prototype;

public class MainApplication {
	
	public static void main(String[]args) {
		
		Circle c = new Circle();
		CloneShape cc = new CloneShape();
		cc.clone(c);
		
		Triangle t = new Triangle();
		CloneShape ct = new CloneShape();
		ct.clone(t);
	}

}
