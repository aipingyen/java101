package ch07;
/*
 * 此範例為傳值傳址測試
 */
public class PassArgTest {
	
	static void passValue(double value) {
		value = 20.0;
	}
	
	static void passReference(Pen reference) {
		reference.price = 20.0;
	}
	
	public static void main(String[] args) {
		double price = 10.0;
		passValue(price); 
		//把price的值傳給value, value=20 後來 value=10, price沒變
		System.out.println(price);        // 10
		
		Pen myPen = new Pen();
		myPen.price = 10.0;
		passReference(myPen);
		//把mypen的位置傳給reference, 
		//reference.price被改成20就等同mypen.price被改成20
		System.out.println(myPen.price);  // 20
	}
}
