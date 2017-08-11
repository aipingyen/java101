package ch03;

public class TestShiftOP {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("2的1次方 = " + (num << 1)); //由於是2進位, 每往左推一位就是*2的意思
		System.out.println("2的2次方 = " + (num << 2));
		System.out.println("2的3次方 = " + (num << 3));
		System.out.println("2的3次方 = " + (num << 4));
	
		
	}

}
