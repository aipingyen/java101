
public class Animal {
	private int age;
	private float weight;
	public Animal(){
	}
	public Animal (int age, float weight){
		if(age<=0 || weight<=0){
			System.out.println("Please check input data!");
		}else{
			this.age=age;
			this.weight=weight;
		}
	}
	public void speak(){
		System.out.println(age+"歲"+"\t"+ weight+"公斤");
	}
	public void setAge(int age){
		if(age<=0){
			System.out.println("Please check age!");
		}else this.age=age;
	}
	public void setWeight(float weight){
		if(weight<=0){
			System.out.println("Please check weight!");
		}else this.weight=weight;
	}
	public int getAge(){
		return age;
	}
	public float getWeight(){
		return weight;
	}
		
}
