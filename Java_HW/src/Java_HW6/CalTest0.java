package Java_HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest0 {
	private int x;
	private int y;

	public int powerXY(int x, int y){
		int result = (int)Math.pow(x, y);
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CalTest test = new CalTest();
		while(true){
			
			try{
				System.out.println("請輸入x的值(整數):");
				int x = sc.nextInt();
				System.out.println("請輸入y的值(整數):");
				int y = sc.nextInt();	
					
				if(x==0 && y==0){
					throw new CalException("0的0次方沒有意義!");
				}
				if(y<0){
					throw new CalException("次方為負值，結果回傳不為整數!");
				}
				System.out.println(x+"的"+y+"次方等於"+test.powerXY(x, y));
				break;
			}catch(CalException ce){
				System.out.println(ce.getMessage());
			}catch(InputMismatchException e){ 			
				System.out.println("輸入格式不正確!"); 
				sc.nextLine(); //不加這個會導致無限迴圈.....sc.reset();也不行....
			}
		}
		sc.close();
		
	}
}
