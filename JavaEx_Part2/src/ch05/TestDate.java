package ch05;

public class TestDate {
	public static void main(String argv[]) {

		// java.util.Date(今天)(現在)(如:Wed Aug 18 22:10:06 CST 2010)
		java.util.Date du = new java.util.Date();
		System.out.println("java.util.Date() = " + du);

		// java.sql.Date(今天)(如:2010-08-18)
		long long1 = du.getTime(); // 也可用long long1 =System.currentTimeMillis();
		//可得到自1970年1月1日0時0分0秒起的毫秒(紀念Unix作業系統誕生)
		java.sql.Date ds1 = new java.sql.Date(long1); //用java.sql.Date(Long l)讀出來
		System.out.println("java.sql.Date()  = " + ds1);

		// java.sql.Date(30天後)(如:2010-09-17)
		long long2 = du.getTime() + 30 * 24 * 60 * 60 * 1000L; 
		//因為getTime回傳是毫秒, 所以方便直接做時間加減法
		java.sql.Date ds2 = new java.sql.Date(long2);
		System.out.println("java.sql.Date()  = " + ds2);
	}
}
