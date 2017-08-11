package ch12;

import static java.lang.System.out;
import static java.lang.Math.*;
public class TestStaticImport {

	public static void main(String[] args) {
		//可省略System.
		out.println("看起來有點不習慣...");
		//可省略Math.
		out.println(random()); //小心會以為是自己寫的random()方法
	}

}
