package ch03;

import java.util.*;
//自訂類別TreeSet
//排序
public class TestTreeSetEmp {
	public static void main(String args[]) {

		Set<Employee> set2 = new HashSet<Employee>();
		Employee em1 = new Employee(7001, "king1");
		Employee em2 = new Employee(7002, "king2");
		Employee em3 = new Employee(7003, "king3");
		Employee em4 = new Employee(7004, "king4");
		Employee em5 = new Employee(7005, "king5");
		Employee em6 = new Employee(7005, "king5");
		
		set2.add(em5);
		set2.add(em2);
		set2.add(em3);
		set2.add(em4);
		set2.add(em1);
		set2.add(em6); //HashSet若不Override hashCode & equals(),重複資料會被加入

		for (Employee aEmp2 : set2) {
			System.out.println(aEmp2.getEmpno() + "-" + aEmp2.getEname());
		}
		
		System.out.println("===========");
//		Set<Employee> set = new TreeSet<Employee>();
//		Employee e1 = new Employee(7001, "king1");
//		Employee e2 = new Employee(7002, "king2");
//		Employee e3 = new Employee(7003, "king3");
//		Employee e4 = new Employee(7004, "king4");
//		Employee e5 = new Employee(7005, "king5");
//		Employee e6 = new Employee(7005, "king5");
//		set.add(e5);
//		set.add(e2);
//		set.add(e3);
//		set.add(e4);
//		set.add(e1);
//		set.add(e6);
//
//		for (Employee aEmp : set) {
//			System.out.println(aEmp.getEmpno() + "-" + aEmp.getEname());
//		}
//		
	}
}
