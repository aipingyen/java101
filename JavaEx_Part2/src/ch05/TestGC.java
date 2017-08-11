package ch05;

public class TestGC {
	public static void main(String args[]) {
		System.out.print("剩餘記憶體:");
		System.out.println(Runtime.getRuntime().freeMemory()); //這裡的freeMemory是指JVM能夠使用的(bytes)
		//Runtime方法singleton設計, 無法使用他的private constructor
		String str = "Hello World!";
		System.out.print("剩餘記憶體:");
		System.out.println(Runtime.getRuntime().freeMemory());

		System.out.println("強制進行垃圾收集");
		System.gc(); //建議系統趕快收, 實際上不一定立即收, 還是看系統安排這個執行緒什麼時候開始跑run

		System.out.print("剩餘記憶體:");
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
