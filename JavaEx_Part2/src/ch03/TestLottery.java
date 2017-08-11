package ch03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestLottery {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//用for迴圈丟6個數字進set, 結果不一定有6個element, 因為重複的不會加入
//		for(int i=1; i<=6; i++){ 
//			set.add((int)(Math.random()*11+1));
//		}
		
		//用while set.size()<7一定會有6個不重複的element
		while(set.size()!=6){
			set.add((int)(Math.random()*11+1));
		}
		

		System.out.println("toString()=" + set); 
		System.out.println("元素個數=" + set.size());

		// Set家族只能用Iterator 取值
		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

	}

}
