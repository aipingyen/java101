package ch01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestTryWithResources {

	public static void main(String[] args) {
		File file = new File("files/data.txt");
		BufferedReader br = null; 
		//1.區域變數必須宣告初始值 
		//2.br不能等到在try區塊才宣告,那樣finally區塊就認不得br

		// before, finally內自行處理資源的關閉
		try {
			br = new BufferedReader(new FileReader(file)); 
			//new FileReader沒有宣告變數儲存, 所以當區塊run完, 就會被垃圾回收
			String bookInfo = "";
			while ((bookInfo = br.readLine()) != null) {
				System.out.println(bookInfo);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ex) { //IO不是runtime, 所以一定要處理
				ex.printStackTrace();
			}
		}

		// Java 7, try-with-resources可確保物件（資源）在最後都會被關閉
		try (BufferedReader in = new BufferedReader(new FileReader(file));) {
			String bookInfo = "";
			while ((bookInfo = in.readLine()) != null) {
				System.out.println(bookInfo);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
