
public class Elephant extends Animal{ 
	//只寫這行時會有error, extends後 Elephant產生預設建構子
	//裡面會自總產生super()就是Animal(), 
	//可是Animal()不存在(因為我們有寫Animal(int age, float weight))
	//public Elephant(){
	//	super();
	//}
	
	//解決方法: 在Class Animal中加上public Animal(){} 這個建構子
	private String name;
	public Elephant(int age, float weight, String name){
		super(age, weight);
		this.name= name;
	}
	public void speak(){
		super.speak();
		System.out.println(name);
		
	}
	public void setName (String name){
		this.name =name;
	}
	public String getName() {
		return name;
	}

}
