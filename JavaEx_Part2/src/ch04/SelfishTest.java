package ch04;

public class SelfishTest {
	private final static int NUMRUNNERS = 2;

	public static void main(String[] args) {
		SelfishRunner[] runners = new SelfishRunner[NUMRUNNERS];

		for (int i = 0; i < NUMRUNNERS; i++) {
			runners[i] = new SelfishRunner(i);
			runners[i].setPriority(2); //兩條thread priority設定一樣
		}
		for (int i = 0; i < NUMRUNNERS; i++)
			runners[i].start(); //通常selfish runners會有一條明顯先跑完
	}
}
