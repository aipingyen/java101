package ch05;

/*
 * 巢狀迴圈應用，寫九九乘法表
 */
public class NineNineLoop {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println(); //(print line)print完自動換行的意思, 這裡是換行的功用
		}
		
		int a;
		for (a=11; a<=19; a++){
				System.out.println(a+"*"+a+"="+a*a);
			
		}
	}

}
