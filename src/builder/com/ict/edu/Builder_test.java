package builder.com.ict.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Builder_test {

	private JFrame frame;
	private JPanel jPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder_test window = new Builder_test();
					window.jPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Builder_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jPanel = new JPanel();
		jPanel.setBounds(100, 100, 1200, 800);
	}

}
