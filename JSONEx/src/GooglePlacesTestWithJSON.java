import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class GooglePlacesTestWithJSON {
	
	private static final String MY_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=24.95375,121.22575&radius=500&types=food&name=%E9%A4%90%E5%BB%B3&language=zh-TW&key=AIzaSyAYmC8oUYc9DGAZn8hqZKakFeclhAbTRSI";
	
	public static void main(String[] args) throws IOException, JSONException {
		URL url = new URL(MY_URL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setDoInput(true);
		
		InputStream is = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		StringBuilder sb = new StringBuilder();
		
		String str;
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}

		JSONObject obj = new JSONObject(sb.toString());
		JSONArray resultA = obj.getJSONArray("results");
		System.out.println("搜尋到"+resultA.length()+"間餐廳:");
		System.out.println("========================");
		
		for (int i = 0; i < resultA.length(); i++) {
			JSONObject resultO = resultA.getJSONObject(i);
			String name = resultO.getString("name");
			double rating = resultO.getDouble("rating");
			JSONObject geoO = resultO.getJSONObject("geometry");
			JSONObject locO = geoO.getJSONObject("location");
			double lat = locO.getDouble("lat");
			double lng = locO.getDouble("lng");
					
			System.out.println("店名: " + name);
			System.out.println("評分: " + rating);
			System.out.println("緯度: " + lat);
			System.out.println("經度: " + lng);
			
			try{
				JSONObject openO = resultO.getJSONObject("opening_hours");
				boolean open_now = openO.getBoolean("open_now");
				System.out.println("是否營業中: " + open_now);
			}catch(JSONException je){
				System.out.println("是否營業中: 不知道");
			}
			System.out.println("========================");
			
		}
		
		br.close();
		isr.close();
		is.close();
	}

}
