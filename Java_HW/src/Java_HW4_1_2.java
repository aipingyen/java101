
public class Java_HW4_1_2 {
	public static void main(String[] args) {
		//1.有個一維陣列如下:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] n = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		double avg;
		for(int i = 0; i < n.length; i++){
			sum += n[i];
		}
		avg=sum/n.length;
		System.out.println("平均值:"+avg);
		System.out.print("大於平均值的元素:");
		for(int i = 0; i<n.length; i++){
			if(n[i]>avg){
				System.out.print(n[i]+"\t");
			}
			continue;
		}
		System.out.println();
		
		//2.請建立一個字串,經過程式執行後,輸入結果是反過來的
		//例如String s = “Hello World”,執行結果即為dlroW olleH
		String s = "Hello World";
		char[] c = s.toCharArray();
				
		for(int i = 0; i < c.length; i++){
			System.out.print(c[c.length-1-i]+" ");
		}
		
		
	}
}
