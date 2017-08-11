package Java_HW7;

import java.io.*;

public class Data1_1000 {

	public static void main(String[] args) {

		try {
			File outputFile = new File("E:\\Java\\txt\\data.txt");
			FileOutputStream fos = new FileOutputStream(outputFile, true);
			PrintStream ps = new PrintStream(fos);
			int i = 1;
			while (i <= 10) {
				ps.println(i + ":" + ((int) (Math.random() * 1000) + 1));
				i++;
			}
			ps.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
