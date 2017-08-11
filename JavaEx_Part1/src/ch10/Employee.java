package ch10;

public class Employee {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) { //建構子不會被繼承
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {//建構子不會被繼承
		this(empno, "-");
	}

	public Employee(String ename) {//建構子不會被繼承
		this(0, ename);
	}

	public Employee() {//建構子不會被繼承
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("ename = " + ename);
	}
}
