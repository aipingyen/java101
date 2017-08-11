package ch05;
/*
 * 三種迴圈比較用法
 */
public class Test3TenAdd {

	public static void main(String[] args) {
		 /* for */
        int sum = 0;   
        for (int count = 1; count <= 10; count++) 
        	//count++是做完sum+=count後再回到迴圈才做
        	//所以count++, ++count結果一樣!
             sum+=count;
        
        int sum1 = 0;
        for (int count = 1; count <= 10; ++count){
        	sum1 += count;
        }
        
        int sum2 = 0;
        int count2 = 1;
        for (; count2 <= 10; count2++){
        	sum2 += count2;
        }
        		
    
    
    
//        while
//        int sum = 0;
//        int count = 1;
//        while ( count <= 10) {
//             sum += count;
//             count++;
//        }
     
    
    
//         do…while
//         int sum = 0;
//         int count = 1;
//         do {
//             sum += count;
//             count++;
//         } while ( count <= 10);
    
         System.out.println(sum);
         System.out.println(sum1);
         System.out.println(sum2);
         System.out.println(count2); 
         //只有count2是在main下面宣告, 所以能夠在main方法裡使用, 
         //count和count1是屬於for方法的區域變數, 會print不出來

	}

}
