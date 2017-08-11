
public class TestStudent {
	public static void main(String[] args){
		Student irene = new Student(); 
		//建立irene物件 (資料類型是Student, 使用Student()) 
		irene.score=80; //給予特徵
		irene.play(3); //呼叫方法
		irene.study(2); //呼叫方法
		System.out.println("Irene的成績"+irene.score);
		
		Student shiyuan = new Student();
		//建立shiyuan物件 (資料類型是Student, 使用Student())
		shiyuan.score=80;//給予特徵
		shiyuan.play(10);//呼叫方法
		shiyuan.study(15);//呼叫方法
		System.out.println("士淵的成績"+shiyuan.score);
		
		
	}
}
