package ch02;

import java.io.File;


public class FileTest {

	public static void main(String[] args) {
//		File file = new File("C:\\javawork\\Hello.txt");//沒有真正建立Hello.txt在檔案系統
//		if (file.delete()) {
//			System.out.println("File deleted.");
//		} else {
//			System.out.println("Failed...");     //檔案系統中沒有Hello.txt時會fail
//		}
		
//		File dir = new File("C:\\Test\\xyz");	//真的會建立路徑
//		if (dir.mkdirs()) {
//			System.out.println("Success!");    //成功
//		} else {
//			System.out.println("Failed...");
//		}
		
		File oldFile = new File("C:\\javawork\\NASA_USA.jpg");
		File newFile = new File("C:\\Test\\xyz\\copyNASA_USA.jpg");
		oldFile.renameTo(newFile); //更改名稱+移動到指定路徑
		
	}

}
