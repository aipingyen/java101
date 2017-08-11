
public class TestAnimal {

	public static void main(String[] args){
		Animal cutie = new Animal(2,5.0f);
		cutie.speak();
		
		System.out.println("三年過後...");
		
		cutie.setAge(5);
		cutie.setWeight(20f);
		cutie.speak();
		
	}

}
