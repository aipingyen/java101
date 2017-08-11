package ch09;

public class PenConstructorThis {
	private String brand;
	private double price;
	
	public PenConstructorThis(String brand, double price) {
		this.brand = brand; //this是"這個物件"的代名詞(pct)
		this.price = price;
	}
	
	public static void main(String[] args) {
		PenConstructorThis pct = new PenConstructorThis("SKB", 10);
		System.out.println(pct.brand);
		System.out.println(pct.price);

	}

}
