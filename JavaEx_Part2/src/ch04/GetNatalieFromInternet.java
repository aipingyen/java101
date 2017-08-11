package ch04;

import java.io.*;
import java.net.*;

public class GetNatalieFromInternet {

	public static void main(String[] args) {
		File dir = new File("E:\\images");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		for (int i = 1; i <= 42; i++) {
			String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" + 
					"/natalie_portman_" + i	+ ".jpg";
			String filename = url.substring(url.lastIndexOf("/") + 1);
			File file = new File(dir, filename);
			try {
				URL myURL = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
				bis = new BufferedInputStream(conn.getInputStream());
				bos = new BufferedOutputStream(new FileOutputStream(file));

				System.out.println("Wallpaper: " + filename + " kick-off!");

				int length = 0;
				byte[] b = new byte[8192]; 
				while ((length = bis.read(b)) != -1){ //自訂緩衝區大小
					bos.write(b, 0, length);
				}
				//read(byte[] b)Reads up to byte.length bytes of data from this input stream into an array of bytes. This method blocks until some input is available. 
				//This method simply performs the call read(b, 0, b.length) and returns the result. It is important that it does not do in.read(b) instead; certain subclasses of FilterInputStream depend on the implementation strategy actually used.

				bos.flush();
				bos.close();
				System.out.println(filename + " Done!");

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
