package ch13;

public class TestAutoboxing2 {
	public static void main(String[] args){
	int i1 = 1;
	int i2 = 1;
	
	Integer i3 = new Integer(1);
	Integer i4 = new Integer(1);
	
	System.out.println(i1 == i2);		//T
	
	System.out.println(i3 == i4);		//F
	System.out.println(i3.equals(i4));	//T
	
	System.out.println(i3 == i1);		//T, i3 auto unboxing
	System.out.println(i3.equals(i1));	//T, i1 auto boxing
	//System.out.println(i1.equals(i3));  //error i1不是Integer物件無法呼叫.equals方法
	}

}
