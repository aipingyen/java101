package Java_HW9;

public class AllowanceTest {
	public static void main(String[] args){
		Allowance a = new Allowance();
		Mom bearMom = new Mom(a);
		Student bear = new Student(a);
		bearMom.start();
		bear.start();
	}
}
class Allowance {
	private int savings = 0;

	synchronized public void save(int money) {
		while (savings > 2000) {
			System.out.println("媽媽看到餘額在2000以上，暫停存款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		savings += money;
		System.out.println("媽媽存了"+money+"，帳戶共有:"+savings);
		notify();
	}
	synchronized public void withdraw(int money){
		while(savings<money){
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait(); //wait()外面用while因為會讓出lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		savings -= money;
		System.out.println("熊大領了"+money+"，帳戶共有:"+savings);
		if(savings<=1000){
			System.out.println("媽媽被熊大要求匯款!");
			notify();	//notify()是叫醒其他blocked執行緒, 並沒有讓出lock, 外面用while會無限迴圈出不去
		}
	}
}
class Student extends Thread{
	private Allowance a;
	
	public Student(Allowance a){
		this.a = a;
	}
	public void run(){
		for(int i=1; i<=10; i++){
			a.withdraw(1000);
		}
	}
}
class Mom extends Thread{
	private Allowance a;
	public Mom(Allowance a){
		this.a=a;
	}
	public void run(){
		for(int i=1; i<=10; i++){
			a.save(2000);
		}
	}
	
}