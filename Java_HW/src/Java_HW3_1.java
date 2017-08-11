import java.util.Arrays;
import java.util.Scanner;

public class Java_HW3_1 {

	public static void main(String[] args) {
//		1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三
//		角形、其它三角形或不是三角形,如圖示結果:
		System.out.println("請輸入三邊長:");
		Scanner sc1 = new Scanner(System.in);
		double[] tri = {sc1.nextDouble(),sc1.nextDouble(),sc1.nextDouble()};
		sc1.close();
		
		Arrays.sort(tri);
		double e1 = tri[0];
		double e2 = tri[1];
		double e3 = tri[2];
				
		if(e1+e2<=e3){
			System.out.println("不是三角形");
		}else if(e1==e2&&e2==e3){
			System.out.println("正三角形");
		}else if(e1==e2||e2==e3){
			if(Math.pow(e1, 2)+Math.pow(e2, 2)==Math.pow(e3, 2)){
				System.out.println("等腰直角三角形");
			}else{
				System.out.println("等腰三角形");
			}
		}else if(Math.pow(e1, 2)+Math.pow(e2, 2)==Math.pow(e3, 2)){
			System.out.println("直角三角形");
		}else{
			System.out.println("其他三角形");
		}
		
	}
		

}
