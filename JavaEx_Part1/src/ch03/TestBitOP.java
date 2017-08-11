package ch03;
/*
 * 以下為位元運算測試
 * 需將1(十位數)轉換成二進位，以8個bits表示
 * 也就是 0000 0001
 */
public class TestBitOP {

	public static void main(String[] args) {
		// AND運算
		System.out.println(0 & 1);//0,0,0,1,1,0,1,1
		System.out.println(0 & 0);
		System.out.println(1 & 0);
		System.out.println(1 & 1);
		System.out.println("===========");
		// OR運算
		System.out.println(0 | 1);
		System.out.println(0 | 0);
		System.out.println(1 | 0);
		System.out.println(1 | 1);
		System.out.println("===========");
		// XOR運算
		System.out.println(0 ^ 1);//1,0,1,0
		System.out.println(0 ^ 0);
		System.out.println(1 ^ 0);
		System.out.println(1 ^ 1);
		System.out.println("===========");
		// 位元反轉
		System.out.println(~0);//答案是-1, 因為~00000000=>11111111, 十進位=>-1
		byte x=1;
		System.out.println(~x);//1
		
	}

}
