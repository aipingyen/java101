package ch03;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {

		Map<Integer , String> map = new HashMap<Integer , String>();//不保證Key有做排序(資料量大時這個範例就看得出來), Key可以各種型別 
//		Map<Integer, String> map = new TreeMap<Integer, String>(); // Key有排序, TreeMap的Key值要同一種資料型別

		for (int i = 0; i < 600000; i++) { 
			map.put(i, "David" + i);
		}
		for (String val : map.values()) {
			System.out.println(val);
		}
	}
}

/*
 * HashMap 可能輸出結果： 
 * David2 
 * David4 
 * David1 
 * David3 
 * David5 
 * David0
 */

/*
 * TreeMap 輸出結果： 
 * David0 
 * David1 
 * David2 
 * David3 
 * David4 
 * David5
 */
