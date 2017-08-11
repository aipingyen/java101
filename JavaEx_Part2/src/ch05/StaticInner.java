package ch05;

class Outer1 {
	
	int y = 2;
	
	public static class Inner {
		public int z = 3;
		public void show() {
			System.out.println("Outer1.x = " + Outer1.x); //因為x也是Static所以ok
			//static內部類別無法存取外部類別的實體成員，會編譯失敗
//			System.out.println("Outer1.this.y = " + Outer1.this.y); //單寫this.y指的是Inner.y沒這個東西
			System.out.println("this.z = " + this.z);//因為z在Inner建立以後也建立了所以ok
		}
	}
	static int x = 1;
}


public class StaticInner {
	public static void main(String[] args) {
		Outer1.Inner inner = new Outer1.Inner();//因為Outer1.Inner()直接存在, 所以new寫在前面
		inner.show();
	}
}
