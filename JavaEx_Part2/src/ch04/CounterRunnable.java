package ch04;

//當CounterRunnable已繼承別的類別時, 用implements Runnable取代extends thread
//實做run()

public class CounterRunnable implements Runnable {
	int counter = 10;

	public CounterRunnable() {
	} // 建構者函數
	//實做Runnable中的run()
	public void run() { // 執行緒執行的地方
		while (counter > 0) {
			System.out.println(counter);
			counter--;

			try {
				Thread.sleep(1000); // 暫停一秒
			} catch (Exception e) {
			}
		}
	}

	public static void main(String arg[]) {
		CounterRunnable r1 = new CounterRunnable();// 產生Runnable物件, Runnable中沒有start可以呼叫
		Thread t1 = new Thread(r1); // 所以再由Runnable物件, 產生執行緒Thread物件
		CounterRunnable r2 = new CounterRunnable();
		Thread t2 = new Thread(r2);
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
	}
}
