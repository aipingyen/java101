package ch03;

class Book<T>{
	T price;
	public static void show(Book<? extends Number> b){ 
		//用這個技巧,可以在parameter限定Book裝入的資料類型(也就是price的資料類型)
		System.out.println("書籍定價為：" + b.price);
	}
}


public class GenericAdv {
	public static void main(String[] args){
		Book<Integer> book = new Book<Integer>();
		book.price = 580;
		Book.show(book);
		
		Book<Double> book1 = new Book<Double>();
		book1.price = 580.0;
		Book.show(book1);
		
		Book<Boolean> book2 = new Book<Boolean>();
		book2.price = true;
		//Book.show(book2); //到前面都還ok, 但show方法有卡Number
	}
}
