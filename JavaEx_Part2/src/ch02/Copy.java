package ch02;

import java.io.*;

public class Copy {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("farrago.txt");
		File outputFile = new File("outagain.txt"); 
		//開始write以後會自動產生outagain.txt(左邊目錄eclipse不會自動更新, 要收闔資料夾後重新整理)

		FileReader in = new FileReader(inputFile); //用FileReader/FileWriter中文字不會亂碼
		FileWriter out = new FileWriter(outputFile);
		int c;

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c); //int c 轉成char(對照unicode)
			System.out.flush();
		}

		in.close(); //水管用完要拔掉, 資源占用的話, 別人無法接水管
		out.close();
	}
}
