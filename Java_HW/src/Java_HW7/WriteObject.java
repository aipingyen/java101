package Java_HW7;

import java.io.*;

public class WriteObject {

	public static void main(String[] args) {
		
		
		
		try{
			File dir = new File("C:\\data");
			if(!dir.exists())
				dir.mkdirs();
			FileOutputStream fos = new FileOutputStream("C:\\data\\Object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			int petNum = 4;
			Pet[] pets = new Pet[petNum];
			
			for(int i = 0; i < petNum/2; i+=1){
				pets[i] = new Dog((i+1)+"號阿狗");
				oos.writeObject(pets[i]);
				pets[i+2] = new Cat((i+1)+"號阿貓");
				oos.writeObject(pets[i+2]);
								
			}
			

			oos.close();
			fos.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
