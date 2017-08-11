
public class Java_HW4_3 {
	public static void main(String[] args) {
		
		//3.有個字串陣列如下 (八大行星):
		//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] p = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for(int i = 0; i < p.length; i++){
			p[i]=p[i].toLowerCase();
			for(int j = 0; j < p[i].length(); j++){
				if(p[i].charAt(j)=='a') count++;
				if(p[i].charAt(j)=='e') count++;
				if(p[i].charAt(j)=='i') count++;
				if(p[i].charAt(j)=='o') count++;
				if(p[i].charAt(j)=='u') count++;
			}
		}
		System.out.println("母音共有:"+count+"個");
			
	}
}
