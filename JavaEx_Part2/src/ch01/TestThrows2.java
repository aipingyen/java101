package ch01;

public class TestThrows2 {
	String[] strs = { "Hello1", "Hello2", "Hello3" };

	public void printStrs(int i) throws Exception {
		System.out.println(strs[i]);
	}

	public static void main(String[] args) throws Exception { //printStrs throws Exception必須處理, 用try catch或再throws一次, 二擇一
		int i = 0;
		TestThrows2 t2 = new TestThrows2();
		while (i < 4) {
			t2.printStrs(i);
			i++;
		}
	}
}
