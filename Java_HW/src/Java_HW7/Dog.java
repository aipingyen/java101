package Java_HW7;

import java.io.Serializable;

public class Dog implements Pet, Serializable{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}