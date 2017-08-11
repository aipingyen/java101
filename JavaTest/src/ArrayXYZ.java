
public class ArrayXYZ {

	public static void main(String[] args) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		//老師是是寫四次迴圈
		for (int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				x[i][j] = (int)(java.lang.Math.random()*31);
				y[i][j] = (int)(java.lang.Math.random()*31);
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
