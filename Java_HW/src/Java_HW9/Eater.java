package Java_HW9;

public class Eater extends Thread{
	String name;
	public static Boolean ready = false;
	public Eater(String name){
		this.name = name;
		this.start();
	}
	public void run(){
		while(!ready){
			
		}
		for(int i = 1; i<=10; i++){
			System.out.println(name+"吃第"+i+"碗飯");
			try{
				Thread.sleep((long)(Math.random()*2501)+500);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
		System.out.println(name+"吃完了!");
	}
	public static void main(String[] args){
		Eater james = new Eater("詹姆士");
		Eater manto = new Eater("饅頭人");
		
		Eater.ready = true;
		try{james.join();
			manto.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("=============大胃王快食比賽結束!=============");
	}

}
