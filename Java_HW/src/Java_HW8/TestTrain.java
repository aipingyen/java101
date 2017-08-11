package Java_HW8;

import java.util.*;

public class TestTrain {
	public static void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t8 = new Train(116, "自強", "高雄", "台北", 500);

		Set<Train> hs = new HashSet<Train>();
		hs.add(t1);
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		hs.add(t7);
		Set<Train> ts = new TreeSet<Train>();
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		ts.add(t6);
		ts.add(t7);
		List<Train> al = new ArrayList<Train>();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		al.add(t5);
		al.add(t6);
		al.add(t7);
		al.add(t8);
		
		System.out.println("====用iterator取elements====");
		Iterator<Train> it1 = hs.iterator();
		while (it1.hasNext()) {
			Train tr = it1.next();
			System.out.print(tr.getNumber() + " ");
			System.out.print(tr.getType() + " ");
			System.out.print(tr.getStart() + " ");
			System.out.print(tr.getDest() + " ");
			System.out.print(tr.getPrice());
			System.out.println();
		}
		System.out.println("====用增強式for取elements====");
		for (Train tr : hs) {
			System.out.print(tr.getNumber() + " ");
			System.out.print(tr.getType() + " ");
			System.out.print(tr.getStart() + " ");
			System.out.print(tr.getDest() + " ");
			System.out.print(tr.getPrice());
			System.out.println();
		}

		System.out.println("====排序結果====");
		for (Train tr : ts) {
			System.out.print(tr.getNumber() + " ");
			System.out.print(tr.getType() + " ");
			System.out.print(tr.getStart() + " ");
			System.out.print(tr.getDest() + " ");
			System.out.print(tr.getPrice());
			System.out.println();
		}
		
		System.out.println("====加開第8班列車====");
		for (Train tr : al) {
			System.out.print(tr.getNumber() + " ");
			System.out.print(tr.getType() + " ");
			System.out.print(tr.getStart() + " ");
			System.out.print(tr.getDest() + " ");
			System.out.print(tr.getPrice());
			System.out.println();
		}

	}

}
