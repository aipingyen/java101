
public class PolyAnimal {

	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0]=new Animal(2,5.0f);
		a[1]=new Elephant(1,5f,"瘦瘦");
		a[2]=new Elephant(1,10f,"胖胖");
		for(int i=0; i<a.length; i++){
			a[i].speak();
		}
		
						
	}

}
