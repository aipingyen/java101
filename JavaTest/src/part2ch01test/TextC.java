package part2ch01test;

import java.util.Scanner;

public class TextC {

	public static void main(String[] args) {
		System.out.println("請輸入邊長:");
		Scanner sc = new Scanner(System.in);
		C c1 = new C(sc.nextDouble());
		
		sc.close();
		
	}

}
