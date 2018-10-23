import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class mainPage {

	private JFrame frmPpV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
					window.frmPpV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPpV = new JFrame();
		frmPpV.getContentPane().setBackground(SystemColor.inactiveCaptionText);
		frmPpV.setBackground(new Color(67, 78, 84));
		frmPpV.setTitle("P&P V1.0");
		frmPpV.setBounds(100, 100, 450, 300);
		frmPpV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaptionText);
		frmPpV.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mnýtmNew = new JMenuItem("New");
		mnFile.add(mnýtmNew);
		
		JMenuItem mnýtmNewMenuItem = new JMenuItem("New menu item");
		mnFile.add(mnýtmNewMenuItem);
		
		JMenuItem mnýtmNewMenuItem_1 = new JMenuItem("New menu item");
		mnFile.add(mnýtmNewMenuItem_1);
	}

}
