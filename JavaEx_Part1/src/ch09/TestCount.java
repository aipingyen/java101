package ch09;

public class TestCount {

	public static void main(String[] args) {
		System.out.println("起始數量:" + Count.getTotalCount() + "\n"); //預設初始count=0

		Count count1 = new Count(); //count=0+1=1, serial number=1000+1=1001
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count1.getSerialNumber() + "\n");

		Count count2 = new Count();//count=1+1=2(類別變數由屬於此類別的所有物件共同擁有)
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count2.getSerialNumber() + "\n"); //1002
		System.out.println("序號:" + count1.getSerialNumber() + "\n"); //1001 (serialnumber是區域變數所以count1中的還是1001)
	}

}
