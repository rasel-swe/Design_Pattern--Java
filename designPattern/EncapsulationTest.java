package designPattern;

public class EncapsulationTest {
	
	private String name;
	 private String add;
	int age;
	int phone;
	
	
	EncapsulationTest( String n, String a, int ag, int p) {
		 
		this.name = n;
		this.add = a;
		this.age = ag;
		this.phone = p;
		
	}
	
	
	void showInfo() {
		
		System.out.println("Name is: "+name);
		System.out.println("address is: "+add);
		System.out.println("Age is: "+age);
		System.out.println("phone Number is: "+phone);
		
	}

}
