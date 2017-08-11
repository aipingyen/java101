package ch01;

public class TestThrows1 {
	String[] strs = { "Hello1", "Hello2", "Hello3" };

	public void printStrs(int i) throws Exception {
		System.out.println(strs[i]);
	}

	public static void main(String[] args){
		int i = 0;
		TestThrows1 t1 = new TestThrows1();
		while (i < 4) {
			try { 
				//因為printStrs throws "Exception",屬於checked exceptions,所以必須要放在try裡面
				//如果throws "ArrayIndexOutOfBoundsException",屬於unchecked exceptions, 就可以不用
				
				t1.printStrs(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1-已超出陣列的長度");
			} catch (Exception e) {
				System.out.println("2-發生Exception");
			}
			i++;
		}
	}

}
