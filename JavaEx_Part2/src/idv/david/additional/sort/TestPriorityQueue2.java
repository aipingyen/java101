package idv.david.additional.sort;

import java.util.*;
class MyComparator implements Comparator<String>{
	public int compare(String a, String b) {
		return a.compareTo(b) * -1;
	}
} 
public class TestPriorityQueue2 {
	public static void main(String[] args) {
		
		//匿名類別
//		Comparator<String> c = new Comparator<String>() {
//			public int compare(String a, String b) {
//				return a.compareTo(b) * -1;
//			}
//		};
		
		Comparator<String> c = new MyComparator();
		
		PriorityQueue<String> pq = new PriorityQueue<String>(3, c);//initial size, comparator
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		while ((s = pq.poll()) != null) { 
		//先進先出poll():Retrieves and removes the head of this queue, or returns null if this queue is empty.
			System.out.print(s + ", ");
		}
	}
}
