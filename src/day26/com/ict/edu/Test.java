package day26.com.ict.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

public class Test {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=680,159
	 */
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=580,79
	 */
	private final JLabel label = new JLabel("New label");
	/**
	 * @wbp.nonvisual location=511,309
	 */
	private final JPopupMenu popupMenu = new JPopupMenu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
