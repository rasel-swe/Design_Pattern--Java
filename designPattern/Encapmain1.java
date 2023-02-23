package designPattern;

public class Encapmain1 {
	public static void main(String[]args) {
		
		/*Student1 s1 = new Student1();
		s1.setName("Rasel");
		
		//s1.name = "Rasel";
		s1.setAge(27);
		s1.setInfo("Dhaka");
		s1.showInfo();
		Teacher t = new Teacher("Asif", "Khulna", 25);
		t.showInfo1();*/
		
		Common  c = new Common();
		c.setInfo("B.sc in SWE");
		c.display();
		c.setAge(25);
		c.setName("Arif");
		c.add = "Dhaka";
		c.showInfo();
		
	}

}
