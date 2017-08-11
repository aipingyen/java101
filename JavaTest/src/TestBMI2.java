
public class TestBMI2 {
	public static void main(String[] args){
		double h = 1.53;
		double w = 44;
		double bmi = w/(h*h);
		System.out.println("BMI "+(double)Math.round(bmi*10)/10);
		if (bmi < 18.5) {
			System.out.println("過瘦");
		}
		else if (bmi >=24){
			System.out.println("過胖");
		}
		else {
			System.out.println("正常");
		}
	}

}
