package Singleton;

public class Teacher {
	
	private static Teacher  t = new Teacher();
	
	private Teacher() {
		
	}
	
	public static  Teacher gett() {
		return t;
	}
	
	public void showInfo() {
		System.out.println("I am Rasel");
	}

}
