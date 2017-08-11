package idv.david.additional.sort;

import java.util.*;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		Object o;
		System.out.println(q.toString());
		while ((o = q.poll()) != null) { 
			//poll方法：1. 做事情(取資料Retrieves and removes the head of this queue, or returns null if this queue is empty.), 
			//		   2. 回傳值當成判斷條件
			String s = (String) o;
			System.out.println(s);
		}
		System.out.println(q.toString());
	}
}
