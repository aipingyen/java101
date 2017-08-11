package Java_HW7;

import java.io.*;

public class TestCopyFile {

	public TestCopyFile(){
		
	}
	
	public void copyFile(File f1, File f2) throws IOException{
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		int b = 0;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		fos.close();
		fis.close();
	}
	
	
	
	public static void main(String[] args) {
		TestCopyFile test = new TestCopyFile();
		try {
			test.copyFile( new File("E:\\Java\\txt\\sample.txt"), new File("E:\\Java\\txt\\data.txt"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
