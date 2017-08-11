
public class ArrayAvg {

	public static void main(String[] args) {
	
		int[] scores={29,100,39,41,50,8,66,77,95,15};
		int sum=0;
		
		for(int i=0; i<scores.length; i++){
			sum+=scores[i];
			
		}
		System.out.println(sum/scores.length);
		System.out.println((29+100+39+41+50+8+66+77+95+15)/10);
		
		int x[] = new int[1];
		int[] y=new int[5];
	}

}
