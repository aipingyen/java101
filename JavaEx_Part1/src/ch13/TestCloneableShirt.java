package ch13;

public class TestCloneableShirt implements Cloneable { 
	//實做Cloneable介面, 但卻不用自己寫出方法實做, 因為JVM會做
	//所以想要clone時, 只要implements Cloneable即可直接用.clone();

	private char colorCode = 'U';

	public char getColorCode() {
		return colorCode;
	}

	public void setColorCode(char newCode) {
		switch (newCode) {
		case 'R':
		case 'G':
		case 'B':
			colorCode = newCode;
			break;
		default:
			System.out.println("不正確的顏色碼. 請使用 R, G, or B");
		}
	}

	public static void main(String[] args) {
		TestCloneableShirt myShirt = new TestCloneableShirt();
		TestCloneableShirt yourShirt = new TestCloneableShirt();
		myShirt.setColorCode('R');
		yourShirt.setColorCode('G');

		System.out.println(myShirt.getColorCode()); // R
		try {
			myShirt = (TestCloneableShirt) yourShirt.clone(); 
			//clone是Object裡面的方法大家都可以用, 所以寫的時候回傳值是Object型態
			//使用時務必轉換成想要的型態
		} catch (CloneNotSupportedException e) {
			System.out.println("不允許複製此物件!");
			e.printStackTrace();
		}
		System.out.println(myShirt.getColorCode()); // G
	}
}