package Java_HW8;

import java.math.BigInteger;
import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(new Integer(100));
		list1.add(new Double(3.14));
		list1.add(new Long(21L));
		list1.add(new Short("100"));
		list1.add(new Double(5.1));
		list1.add("Kitty");
		list1.add(new Integer(100));
		list1.add(new Object());
		list1.add("Snoopy");
		list1.add(new BigInteger("1000"));
		//傳統與增強for迴圈取資料
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		for(Object o : list1){
			System.out.println(o);
		}
		
		
		Iterator it1 = list1.iterator();
		Object o;
		List<Number> listN = new ArrayList<Number>();
		while(it1.hasNext()){
			if((o=it1.next()) instanceof Number){
				listN.add((Number)o);
			}
		}
	
		System.out.println("Object家族List:"+list1);
		System.out.println("Number家族List:"+listN);
		
	
		
	}

}
