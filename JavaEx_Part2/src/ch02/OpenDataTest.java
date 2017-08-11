package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class OpenDataTest {
	
	private static final String MY_URL = "http://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json";
	//http://data.tycg.gov.tw/ 桃園開放資料網
	public static void main(String[] args) throws IOException {
		URL url = new URL(MY_URL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET"); //get或post選一種
		con.setDoInput(true); //設定這個connection可以input
		
		InputStream is = con.getInputStream(); //getInputStream(): Returns an input stream that reads from this open connection.
		InputStreamReader isr = new InputStreamReader(is); //轉接頭, 因為網路連線預設是傳送位元資料, 若須轉換成unicode要寫這行轉接
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		isr.close();
		is.close();
	}

}
