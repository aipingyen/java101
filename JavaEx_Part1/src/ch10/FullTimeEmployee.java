package ch10;

public class FullTimeEmployee extends Employee {
	private double monthlySalary; // 月薪

	public void display() { //override employee的display
		super.display(); //run上一層(employee)的display
		System.out.println("月薪 = " + monthlySalary);//override加上這一行
	}

	public FullTimeEmployee(int empno, String ename, double monthlySalary) {
		super(empno, ename); 
		//呼叫上一層(employee)的建構子(int x, String y), 給予共同參數:empno, ename初始值
		this.monthlySalary = monthlySalary; //給予子類別參數monthlySalary初始值
	}
}
