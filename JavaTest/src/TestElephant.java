
public class TestElephant {

	public static void main(String[] args) {
		Animal AA = new Animal(3,8f);
		Elephant EE = new Elephant(8,1200f,"大象");
		AA.speak();
		EE.speak();
		
		AA.setAge(5);
		AA.setWeight(20f);
		EE.setAge(10);
		EE.setWeight(50f);
		EE.setName("Jumbo");
		
		AA.speak();
		EE.speak();

	}

}
