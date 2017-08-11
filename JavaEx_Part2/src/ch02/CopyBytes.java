package ch02;

import java.io.*;

public class CopyBytes {
	public static void main(String[] args) throws IOException { //read和write方法都有throw IOException
		File inputFile = new File("farrago.txt"); //建立Java的file
		File outputFile = new File("outagain.txt");

		FileInputStream in = new FileInputStream(inputFile); //用FileInputStream/OutputStream水管,中文會亂碼
		FileOutputStream out = new FileOutputStream(outputFile);
		int c;

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1 (所以read不但存資料給c, 還可以順便當回圈條件)
			out.write(c); //存到outputFile(outagain)
			System.out.print((char) c); //直接把int c 轉成char
			System.out.flush();
		}

		// 使用FileInputStream,FileOutputStream 時, 解決中文碼印出問題
//		int i = 0;
//		byte ch[] = new byte[(int) inputFile.length()]; //建立byte陣列, 檔案有幾byte就存幾個
//		while ((c = in.read()) != -1) {
//			out.write(c);
//			ch[i++] = (byte) c; //c由int轉成byte
//		}
//		System.out.print(new String(ch));
//		System.out.flush();

		in.close();
		out.close();
	}
}
