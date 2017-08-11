
public class Java_HW2 {
	public static void main(String[] args){
		//1. 計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for(int i = 2; i <= 1000; i+=2){
				sum = sum + i;
		}
		System.out.println(sum);
		
		//2. 計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product = 1;
		for(int i = 1; i <= 10; i++){
			product = product * i;
		}
		System.out.println(product);
		
		//3. 計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		product = 1;
		int i = 1;
		while(i <= 10){
			product = product * i;
			i++;
		}
		System.out.println(product);
		
		//4. 請設計一隻Java程式,
		//輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		for(int a = 1; a <= 10; a++){
			System.out.print(a*a+" ");			
		}
		System.out.println();
		
	}

}
