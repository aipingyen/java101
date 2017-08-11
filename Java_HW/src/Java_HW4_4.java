import java.util.Scanner;

public class Java_HW4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲借金額:");
		int borrow = sc.nextInt();
		sc.close();
		
		int[][] cowork = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		int count = 0;
		System.out.print("有錢可借的員工編號:");
		for(int i = 0; i < cowork[0].length; i++){
			if(cowork[1][i]>=borrow){
				System.out.print(cowork[0][i]+" ");
				count++;
			}
		}
		System.out.print("共"+count+"人!");
		
	}

}
