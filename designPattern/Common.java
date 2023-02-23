package designPattern;

public class  Common extends Student1 {
	String Qualification;
	
	public void setInfo(String q) {
		Qualification = q;
		
	}
	
	void display() {
		
		System.out.println("Qualification is :"+Qualification);
	}

}
