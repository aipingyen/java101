package Java_HW5;

import java.util.Scanner;

public class TestStarSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形寬和高:");
		TestStarSquare d1 = new TestStarSquare();
		d1.starSquare(sc.nextInt(),sc.nextInt());
		sc.close();
		
	}
	public void starSquare(int width, int length){
		for(int i=1; i<=length; i++){
			for(int j=1; j<=width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
