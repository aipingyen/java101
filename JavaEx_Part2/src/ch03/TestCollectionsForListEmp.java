package ch03;

import java.util.*;

public class TestCollectionsForListEmp {

	public static void main(String args[]) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(7001, "king1");
		Employee e2 = new Employee(7002, "king2");
		Employee e3 = new Employee(7003, "king3");
		Employee e4 = new Employee(7004, "king4");
		Employee e5 = new Employee(7005, "king5");

		list.add(e5);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e1);

		Collections.sort(list);
//		Collections.reverse(list);
		
		//Collections的sort要求List中的物件要implement Comparable並且支援泛型, 
		//所以若Employee沒有implement Comparable寫的時候就會error了

		for (Employee aEmp : list) {
			System.out.println(aEmp.getEmpno() + "-" + aEmp.getEname());
		}
	}
}
