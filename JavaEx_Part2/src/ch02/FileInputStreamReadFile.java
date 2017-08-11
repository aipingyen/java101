package ch02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReadFile {
	public static void main(String args[]) {
		int i;
		try {

//			FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
//			while ((i = fis.read()) != -1)
//				System.out.print((char) i);
//			fis.close();

			FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((i = bis.read()) != -1)
				System.out.print((char) i);
				System.out.flush(); //確保buffer最後一次裝貨就算沒裝滿也會輸出
			bis.close();
			fis.close();

		} catch (IOException e) {
		}
	}
}
