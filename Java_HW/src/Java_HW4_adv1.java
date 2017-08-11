import java.util.Scanner;

public class Java_HW4_adv1 {
	//請設計一隻程式由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,
	//它會顯示是該年的第幾天
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy) 月(mm) 日(dd):"); //還沒做防呆...
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		int[] d28 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] d29 = {31,29,31,30,31,30,31,31,30,31,30,31};
		boolean leap = y%400==0||(y%4==0&&y%100!=0);
		
		
		int count=d;
		if(leap){
			for(int i = 0; i < m-1; i++){
				count+=d29[i];
			}
		}else{
			for(int i = 0; i < m-1; i++){
				count+=d28[i];
			}
		}
		System.out.println("西元"+y+"年，第"+count+"天");
		
		//能被400整除 或能被4整除但不被100整除的 ==>閏年
	
	}
	
}
