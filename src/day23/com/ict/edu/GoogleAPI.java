package day23.com.ict.edu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.ImageIcon;

public class GoogleAPI {
	public void downloadMap(String location) {
		try {
			// https://maps.googleapis.com/api/staticmap?center=서울&zoom=11&size=612x612&scale=2
			// 하단 링크 동작 x
			
			https://maps.googleapis.com/maps/api/staticmap?center=Berkeley,CA&zoom=14&size=400x400&key=YOUR_API_KEY&signature=
			
//			https://maps.googleapis.com/maps/api/staticmap?center=Brooklyn+Bridge,New+York,NY&zoom=13&size=600x300&maptype=roadmap
//			&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318
//			&markers=color:red%7Clabel:C%7C40.718217,-73.998284
//			&key=YOUR_API_KEY&signature=YOUR_SIGNATURE
				
			String imageURL = "";
			imageURL = "https://maps.googleapis.com/maps/api/staticmap?center=" + URLEncoder.encode(location, "UTF-8") + "&zoom=14&size=400x400&key=AIzaSyCckfqUIhKYJuu8lUaQR4nFZx_yBNG6hZM&signature=SWKIM";
			URL url = new URL(imageURL);
			// 실제 해당 주소에 접근할 수 있게 해줌
			InputStream is = url.openStream();
//			InputStream is = url.open
			OutputStream os = new FileOutputStream(location);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}
			is.close();
			os.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ImageIcon getMap(String location) {
		return new ImageIcon((new ImageIcon(location)).getImage().getScaledInstance(612, 612, java.awt.Image.SCALE_SMOOTH));
	}
	public void fileDelete(String fileName) {
		File f = new File(fileName);
		f.delete();
	}
}
