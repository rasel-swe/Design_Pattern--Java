package Super_Shop;

public class OrderInfo {
	
	private String OrderNo;
	private String date;
	private String time;
	private String ProductList;
	private int payment;
	
	
	public OrderInfo(String o, String d, String t, String pl) {
		OrderNo = o;
		date = d;
		time = t;
		ProductList = pl;
	}
	
	public void TotalPayble(int p) {
		payment = p;
	}
	
	public void showInfo() {
		
		System.out.println("***Order Information***");
		System.out.println("Order No: "+OrderNo);
		System.out.println("Order Date: "+date);
		System.out.println("Order time: "+time);
		System.out.println("Product list : "+ProductList);
		System.out.println("Total Payment amount: "+payment);
		System.out.println();
	}

}
