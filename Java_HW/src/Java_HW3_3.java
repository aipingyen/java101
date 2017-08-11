import java.util.Scanner;

public class Java_HW3_3 {
//	阿文很喜歡簽大樂透(1~49),請您設計一隻程式,讓阿文
//	可以輸入他不想要的數字,畫面會顯示他可以選擇的號碼與總數
	public static void main(String[] args){
		System.out.println("請輸入你討厭的數字:");
		Scanner sc = new Scanner(System.in);
		int ng = sc.nextInt();
		sc.close();
		int count = 0;
		for(int i = 1; i <= 49; i++){
			if(i/10.0==ng||i%10.0==ng){
				continue;
			}else{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有"+count+"個數字可選");
		
	}
}
