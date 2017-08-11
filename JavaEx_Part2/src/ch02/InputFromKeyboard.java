package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromKeyboard {
	public static void main(String args[]) {

		System.out.println("請輸入資料....");

		InputStreamReader isr = new InputStreamReader(System.in); 
		//還沒有Scanner API的年代取得鍵盤輸入資料是放入水管中

		BufferedReader br = new BufferedReader(isr);

		try {

			String data = br.readLine(); 
			//水管吐出來的資料會是String(不像Scanner API有多種資料型態overloading)
			int intdata = Integer.parseInt(data);
			System.out.println(data+1);
			System.out.println(intdata+1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
