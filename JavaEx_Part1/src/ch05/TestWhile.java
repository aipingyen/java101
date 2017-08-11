package ch05;
/*
 * 此範例為while迴圈測試
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
	
		System.out.println("------------------------------");

		int count = 1;
		while (count++ < 5)//count++是先讀取資料判斷完count=count+1
			System.out.println("count = " + count);
	}

}
