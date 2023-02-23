package designPattern;

public class Teacher {
	
	String name;
	String add;
	int age;
	
	Teacher(String n, String a, int ag){
		 name = n;
		 add = a;
		 age = ag;
	}
void showInfo1() {
		
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Address is :"+add);
	}
}
