package Java_HW5;

public class TestMaxElement {
	public double maxElement(int[][] x){
		double m = 0;
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++){
				if(m<x[i][j]){
					m=(double)x[i][j];
				}
			}
		}
		return m;
	}
	
	public double maxElement(double[][] x){
		double m = 0;
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++){
				if(m<x[i][j]){
					m=(double)x[i][j];
				}
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray={{1.2,3.5,2.2},{7.4,2.1,8.2}};
		TestMaxElement t1 = new TestMaxElement();
		System.out.println((int)t1.maxElement(intArray));
		System.out.println(t1.maxElement(doubleArray));
	}

}
