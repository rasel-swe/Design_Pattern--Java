package Super_Shop;

public class PacketProduct extends Products{
	
	protected String expireDate;
	
	public PacketProduct(String n, int p, String ex) {
		this.name = n;
		this.price = p;
		this.expireDate = ex;
		
	}
	
	public void showInfo() {
		
		System.out.println("***Packet Product***");
		System.out.println("Product Name: "+name);
		System.out.println("Product Expire Date: "+expireDate);
		System.out.println();
		
		}
}
