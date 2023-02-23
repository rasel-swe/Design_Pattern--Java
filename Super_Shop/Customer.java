package Super_Shop;

public class Customer {
	private String ID;
	private String name;
	private String phnNum;
	
	public  Customer(String i, String n, String p) {
		this.ID = i;
		this.name = n;
		this.phnNum = p;
		
	}
	
	public void showInfo() {
		System.out.println("***Customer Information***");
		System.out.println("Customer ID: "+ID);
		System.out.println("Customer name: "+name);
		System.out.println("Customer phone number: "+phnNum);
		System.out.println();
	}

}
