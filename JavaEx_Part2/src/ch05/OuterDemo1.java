package ch05;

class OuterDemo1_Test {
	private int outerNumber = 0;
	
	public void printOuterNumber() {
		System.out.println("3-再由OuterClass自行列印出外層類別的數值");
		System.out.println("outerNumber=" + outerNumber);
	}

	public class InnerClass {
		public void changeOuterNumber() {
			System.out.println("2-由InnerClass驅動變更外層OuterClass的數值");
			outerNumber++; //因為是內部類別所以才能直接取得static的attribute
		}
	}
	
	public void event() {
		System.out.println("1-OuterClass發生事件");
		InnerClass ic = new InnerClass(); //外部類別方法中建立內部類別物件
		ic.changeOuterNumber(); //外部類別方法中, 內部類別物件呼叫內部類別方法 
	}
}
public class OuterDemo1 {
	public static void main(String[] args) {
		OuterDemo1_Test oc = new OuterDemo1_Test();
		oc.event();
		oc.printOuterNumber();
	}
}
