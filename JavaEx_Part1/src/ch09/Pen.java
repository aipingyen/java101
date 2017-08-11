package ch09;
/*
 * 設計此類別與PenTest.java一起使用
 * 暸解封裝的觀念
 */
class Pen {
	private String brand;
	private double price;
	public void showInfo() {
		System.out.println("牌子為：" + brand);
		System.out.println("價格為：" + price);
	}
}
