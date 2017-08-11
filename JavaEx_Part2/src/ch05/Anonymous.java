package ch05;

interface Book {
	void show();
}

class BeforeAnonymous implements Book {

	@Override
	public void show() {
		System.out.println("我是一本書！");
	}

}

class Anonymous {
	public static void main(String[] args) {
		int a = 0;
		
		//以往需再新增類別去實做介面，然後再產生物件去呼叫Override的方法內容
//		Book ba = new BeforeAnonymous();
//		ba.show();
				
		//匿名類別直接實作介面，通常這樣寫法是自己使用，並不是要設計給其他人使用
		//而且使用到的次數非常少，使用匿名類別即可達到簡便目的
		Book ba = new Book(){
			@Override
			public void show() {
				System.out.println("我是一本書！");
				
//				int x = a; //使用區域變數a 這樣ok
//				a++;	   //改變a 這樣不行 (只要匿名類部類別使用到a, a就被自動加上final了)
				
			}
		};
		ba.show();
	}
}
