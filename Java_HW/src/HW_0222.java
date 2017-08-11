
public class HW_0222 {
    public static void main(String[] args){
    	//      計算12，6這兩個數值的和與積
    	int i1=12, i2=6;
    	int sum=i1+i2, product= i1*i2;
     	System.out.println("和="+sum+",積="+ product);
     	//    	計算200顆蛋共是幾打幾顆？ (一打為12顆)
     	int e=200;
     	int d=e/12;
     	int r=e%12;
     	System.out.println(d+"打"+r+"顆");
     	//    	算出256559秒為多少天、多少小時、多少分與多少秒
     	int s=256559;
     	int day=s/(60*60*24);
     	int hr=s%(60*60*24)/(60*60);
     	int min=s%(60*60)/60;
     	int sec=s%60;
     	System.out.println(day+"天"+hr+"小時"+min+"分"+sec+"秒");
     	//    	定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
     	final double PI=3.1415;
     	double radius=5;
     	double area=radius*radius*PI;
     	double cir=radius*2*PI;
     	System.out.println("面積="+area+",周長="+cir);
     	//    	某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
     	//    	請用程式計算10年後，本金加利息共有多少錢
        int m1=1500000;
        double rate=2;
        double year=10;
        double m2=m1*Math.pow((1+rate/100),year);
        //Math.pow(a,b):a的b次方
        System.out.println("本金加利息共"+Math.round(m2)+"元");
        //Math.round(#):將#四捨五入至整數
              
        //    	利用System.out.println()印出以下三個運算式結果：
        //    	5 + 5
        //    	5 + '5'
        //    	5 + "5"
        //      並請用註解各別說明答案的產生原因
        System.out.println(5+5);
        //數字5+5=10
        System.out.println(5+'5');
        /*數字5+字元5
        =數字5+5的unicode(0x35)
        =數字5+(3*16+5)
        =5+53
        =58
        */
        System.out.println(5+"5");
        //數字5接上字串5 
        System.out.println('5');
       
    }
}
