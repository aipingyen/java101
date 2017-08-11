import java.util.Scanner;

public class Java_HW3_2_adv {

	public static void main(String[] args) {
		System.out.println("請輸入你猜的數字");
		int ans = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		while(guess!=ans){
			if(guess>ans)
				System.out.println("猜錯囉, 大於正確答案");
			else
				System.out.println("猜錯囉, 小於正確答案");
			guess = sc.nextInt();
		}
		System.out.println("答對了!答案就是"+guess);
		sc.close();
		
	}

}
