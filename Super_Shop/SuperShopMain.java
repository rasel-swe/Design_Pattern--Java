package Super_Shop;

public class SuperShopMain {
	public static void main(String[]args) {
		
		Customer c = new Customer("N145","Rasel","1457458");
		c.showInfo();
		
		RawProduct rp = new RawProduct("Apple",500,"Fresh");
		rp.showInfo();
		RawProduct rp1 = new RawProduct("Banana",100,"Fresh");
		rp1.showInfo();
		
		OrderInfo o = new OrderInfo("x14","12/12/22","12:10","1. Apple 2. Banana");
		o.TotalPayble(500+100);
		o.showInfo();
	}

}
