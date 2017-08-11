package ch05;

import java.util.*;

public class TestScan2 {
	public static void main(String[] args) {
		// 也可以從字串輸入

		Scanner sc = new Scanner("Add 1 2 3"); 
		//Scanner API可以直接取得想要的輸入資料類型
		
		String str = sc.next(); //next回傳String
		int x = sc.nextInt();	//nextInt回傳int
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(str);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z+x+y);
		sc.close();
		
		

	}
}
