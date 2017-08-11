
public class TestBMI {
	public static void main(String[] args){
		double h = 1.53;
		double w = 41;
		double BMI = w/(h*h);
		System.out.println("BMI="+(double)Math.round(BMI*10)/10);
		
		if(BMI<18.5) {
			System.out.println("過瘦");
		}
		else if(18.5<=BMI&&BMI<24) {
			System.out.println("正常");
		}
		else {
			System.out.println("過胖");
		}
	}

}
