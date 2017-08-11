package ch01;

public class TestTryCatchFinally {

	public static void main(String[] args) {
		int i = 0;
		String[] strs = { "Hello1", "Hello2", "Hello3" };
//		while (i < 4) {
//			try {
//				System.out.println(strs[i]);				//i=0 1 2
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("1-已超出陣列的長度"); 	//i=3
//			} catch (Exception e) {
//				System.out.println("2-發生Exception");   
//			} finally {
//				System.out.println("一定要執行的程式碼"); 	//i=0 1 2 3
//			}
//			i++;
//		}
		while (i < 4) {
			try {
				System.out.println("before");				//i=0 1 2 3
				System.out.println(strs[i]);				//i=0 1 2 
				System.out.println("after");				//i=0 1 2 (3在上一行就被產生exception而終止了)
			} finally {
				System.out.println("一定要執行的程式碼"); 	//i=0 1 2 3(會run完finally才 顯示錯誤 然後程式跳出)
			}
			i++;
			
		}
	}

}
