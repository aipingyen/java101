package ch02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CSVTest {

	public static void main(String[] args) throws IOException  {
//		FileReader fr = new FileReader("C:\\javawork\\Classmates.csv");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);  
		//雖然是CSV檔也用Reader, 中文還是亂碼, 因為若是windows系統產生的CSV, 編碼不是unicode
//		}
//		
//		br.close();
//		fr.close();
		
		FileInputStream fis = new FileInputStream("C:\\javawork\\Classmates.csv");
		InputStreamReader isr = new InputStreamReader(fis, "MS950"); 
		//InputStreamReader轉接頭, 告訴Java這個資料流的編碼是MS950
		BufferedReader br = new BufferedReader(isr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		isr.close();
		fis.close();
		
	}

}
