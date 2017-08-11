package idv.david.additional.sort;

import java.util.*;

public class Test_LIFO_Stack {
	public static void main(String[] args) {
		Stack list = new Stack();
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("a");
		System.out.println(list.toString());

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println();

		while (!list.empty())
			System.out.println(list.pop());
		//後進先出pop():Removes the object at the top of this stack and returns that object as the value of this function.

	}
}