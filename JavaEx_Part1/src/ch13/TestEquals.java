package ch13;

public class TestEquals {
	public static void main(String args[]) {
		Employee e1 = new Employee(7001, "king");
		Employee e2 = new Employee(7001, "king");

		System.out.println("e1==e2 = " + (e1 == e2));//F(位置不同)
		System.out.println("e1.equals(e2) = " + e1.equals(e2));
		//沒有改寫Employee中的equals()==>False(Object中的equals方法是比位置)
		//改寫Employee中的equals()去分別比較int和String==>True
	}
}
