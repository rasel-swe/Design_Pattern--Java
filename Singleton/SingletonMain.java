package Singleton;

public class SingletonMain {
	
	public static void main(String[]args) {
		
		//Teacher t = new Teacher();
		
		Teacher t =  Teacher.gett();
		t.showInfo();
	}

}
