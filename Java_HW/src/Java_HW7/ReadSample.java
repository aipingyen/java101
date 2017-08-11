package Java_HW7;

import java.io.*;

public class ReadSample {
	public static void main(String[] args) {
		File fSample = new File("E:\\Java\\txt\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(fSample);
			int countB = 0;
			while ((fis.read()) != -1)
				countB++;
			
			FileReader fr = new FileReader(fSample);
			int countC = 0;
			while ((fr.read()) != -1)
				countC++;

			FileReader fr2 = new FileReader(fSample);
			BufferedReader br = new BufferedReader(fr2);
			int countL = 0;
			while ((br.readLine()) != null)
				countL++;

			System.out.println("Sample.txt檔案共有" + countB + "個位元組," + countC + "個字元," + countL + "列資料");

			br.close();
			fr.close();
			fis.close();

		} catch (IOException e) {

		}
	}
}
