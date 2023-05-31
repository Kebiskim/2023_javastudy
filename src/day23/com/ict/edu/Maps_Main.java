package day23.com.ict.edu;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Maps_Main extends JFrame {
	
	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = "서울";
	private JLabel googleMap;
	
	
	public Maps_Main() {
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		setTitle("Google Maps");
		setVisible(true);
		pack();
	}
}
