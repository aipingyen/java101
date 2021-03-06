package ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamWriteFile {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello.txt", true);
			//FileOutputStream (file,true/false),預設false寫入資料覆蓋原本資料, true才會繼續寫
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);

			ps.println("Hello World 世界你好 !");
			
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
