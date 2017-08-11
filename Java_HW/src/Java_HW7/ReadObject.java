package Java_HW7;

import java.io.*;

public class ReadObject {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\data\\Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Pet) ois.readObject()).speak();
			}

		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		} 
		fis.close();
		ois.close();

	}

}
