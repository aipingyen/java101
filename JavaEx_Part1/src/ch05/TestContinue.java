package ch05;
/*
 * 關鍵字continue在迴圈裡的用法
 */
public class TestContinue {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if (i % 2 == 1) {
				continue;//直接回到for(){
			}
			System.out.println(i);
		}
		
		for (int i=1; i<=10; i++) {
			if (i % 2 == 1) {
				break;//直接跳出for迴圈
			}
			System.out.println(i);
		}
	}

}
