package idv.david.additional.sort;

import java.util.*;

public class TestPriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		System.out.println(pq);
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println(pq);
	}
}