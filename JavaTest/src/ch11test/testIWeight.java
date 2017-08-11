package ch11test;

public class testIWeight {

	public static void main(String[] args) {
//		IWeight dog = new Dog();
//		IWeight plane = new Plane();
//		IWeight powder = new Powder();
//		dog.getWeightMethod();
//		plane.getWeightMethod();
//		powder.getWeightMethod();
		
		IWeight[] weight = new IWeight[3];
		weight[0]= new Dog();
		weight[1]= new Plane();
		weight[2]= new Powder();
		
		for(int i=0; i<weight.length; i++){
			weight[i].getWeightMethod();
		}
	}

}
