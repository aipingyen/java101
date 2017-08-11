
public class Java_HW2_adv {
	public static void main(String[] args){
		//進階1.
		int count = 0;
		System.out.print("可以選擇的數字: ");
		for(int j = 1; j <= 49; j++){
			if(j%10==4 || j/10==4){ //因為j是int所以j/10也是整數
				continue;
			}
			System.out.print(j+" ");
			count++;
		}
		System.out.println();
		System.out.println("(共"+count+"個)");
		
		//進階2.
		for(int j = 1; j <= 10; j++){
			for(int k = 1; k<=11-j; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		//進階3.
		for(int j = 1; j <= 6; j++){
			for(int k = 1; k <= j; k++){
				switch(j){
				case 1:
					System.out.print("A ");
					break;
				case 2:
					System.out.print("B ");
					break;
				case 3:
					System.out.print("C ");
					break;
				case 4:
					System.out.print("D ");
					break;
				case 5:
					System.out.print("E ");
					break;
				case 6:
					System.out.print("F ");
					break;
				}		
			}
			System.out.println();
		}
		
		//進階3.練習用array
		char[] arr={'A','B','C','D','E','F'};
		for(int i = 1; i<=arr.length; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(arr[i-1]+" ");
			}
			System.out.println();
		}
		
	}

}
