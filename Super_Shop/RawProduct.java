package Super_Shop;

public class RawProduct extends Products{
	protected String freshnessInfo;
	
	public RawProduct(String n, int p, String fr) {
		
		this.name = n;
		this.price = p;
		this.freshnessInfo = fr;
	}
	
	public void showInfo() {
		System.out.println("***Raw Product***");
		System.out.println("Product Name: "+name);
		System.out.println("Fressness Info: "+freshnessInfo);
		System.out.println();
	}
}
