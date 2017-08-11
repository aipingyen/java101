import java.util.Scanner;

public class Java_HW3_2 {

	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜
//		錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		System.out.println("請輸入你猜的數字");
		int ans = (int)(Math.random()*10);
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		while(guess!=ans){
			System.out.println("猜錯囉");
			guess = sc.nextInt();
		}
		System.out.println("答對了!答案就是"+guess);
		sc.close();
			
		
	}

}
