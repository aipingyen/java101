package ch09;

public class PenConstructor {
	private String brand;
	private double price;
	
	public PenConstructor(String brandXXX, double priceXXX) {
		brand = brandXXX;
		price = priceXXX;
	}
	
	public static void main(String[] args) {
//	 	PenConstructor opc = new PenConstructor(); //PenConstructor()建構子已不存在
		PenConstructor pc = new PenConstructor("SKB", 10); 
		//呼叫建構子建構出pc並且設定brand, price初始值並且做好建構子內的工作
		System.out.println(pc.brand);//呼叫brand屬性
		System.out.println(pc.price);//呼叫price屬性
	}
	
}
