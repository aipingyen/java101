package ch03;

import java.util.*;

public class TestTreeSet {
	public static void main(String args[]) {
		Set set = new TreeSet(); //資料sorted
		set.add(new Integer(56));
		set.add(new Integer(34));
		set.add(new Integer(12));
		set.add(new Integer(12));//且不重複

		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
	}
}
