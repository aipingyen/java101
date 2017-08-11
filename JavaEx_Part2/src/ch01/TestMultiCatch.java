package ch01;

public class TestMultiCatch {
	static class ExceptionA extends Exception {	} //巢狀類別在part2ch05才會講
	static class ExceptionB extends Exception {	}
	static class ExceptionC extends ExceptionB { } //C是繼承B

	public static void methodA(String exceptionName) throws ExceptionA {
		if (exceptionName.equals("A")) {
			throw new ExceptionA();
		}
	}

	public static void methodB(String exceptionName) throws ExceptionB {
		if (exceptionName.equals("B")) {
			throw new ExceptionB();
		}
	}
	
	public static void methodC(String exceptionName) throws ExceptionC {
		if (exceptionName.equals("C")) {
			throw new ExceptionC();
		}
	}

	public static void main(String[] args) {
		// before, 一個catch區塊只能處理一個例外類型
		try {
			methodA("A");
			methodB("B");
			methodC("C");
		} catch (ExceptionC e) { //C必須寫在B前面(C是B得子類別)
			e.printStackTrace();
		} catch (ExceptionB e) {
			e.printStackTrace();
		} catch (ExceptionA e) { //A和BC沒有關係, 所以寫在第幾個都可以
			e.printStackTrace();
		}

		// Java 7, 一個catch區塊可以處理一個以上的例外類型，可以精簡程式碼
		try {
			methodA("A");
			methodB("B");
		} catch (ExceptionA | ExceptionB e) {
			e.printStackTrace();
		}

		// 編譯失敗，catch括號內的例外類型不可有繼承關係
//		try {
//			methodA("A");
//			methodB("B");
//			methodC("C");
//		} catch (ExceptionA | ExceptionB | ExceptionC e) {
//			e.printStackTrace();
//		}
	}
}
