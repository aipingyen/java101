
public class ArrayXYZmethod {

	public static void main(String[] args){
		int[][] x = getRandomArray();
		int[][] y = getRandomArray();
		int[][] z = new int[3][3];
		
		for(int i = 0; i < z.length; i++){
			for(int j = 0; j < z[i].length; j++){
				z[i][j] = x [i][j] + y [i][j];
			}
		}
		
		showRandomArray(z);
		
	}
	
	public static int[][] getRandomArray(){
		int[][] randomArray = new int[3][3];
		for(int i = 0; i < randomArray.length; i++){
			for(int j = 0; j < randomArray[i].length; j++){
				randomArray [i][j] = (int)(Math.random()*31);
			}
		}
		return randomArray;
	}
	
	public static void showRandomArray(int[][] sArray){
		for(int i = 0; i < sArray.length; i++){
			for(int j = 0; j < sArray[i].length; j++){
				System.out.print(sArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
