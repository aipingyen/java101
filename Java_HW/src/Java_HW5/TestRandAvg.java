package Java_HW5;

public class TestRandAvg {
	public void randAvg(){
		int[] rand = new int[10];
		int sum = 0;
		System.out.print("本次亂數結果:");
		for(int i = 0; i<rand.length; i++){
			rand[i] = (int)(Math.random()*101);
			sum+=rand[i];
			System.out.print(rand[i]+"\t");
		}
		System.out.println();
		System.out.println("平均值:"+sum/rand.length);
		
	}
	public static void main(String[] args) {
		TestRandAvg t1 = new TestRandAvg();
		t1.randAvg();
	}

}
