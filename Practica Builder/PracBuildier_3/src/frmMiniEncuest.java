import java.awt.ComponentOrientation;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

public class frmMiniEncuest extends Ejercicio3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMiniEncuest window = new frmMiniEncuest();
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
	public frmMiniEncuest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frmMiniEncuesta = new JFrame();
		frmMiniEncuesta.setFont(new Font("Dialog", Font.PLAIN, 6));
		frmMiniEncuesta.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frmMiniEncuesta.setTitle("Mini Encuesta");
		frmMiniEncuesta.setBounds(100, 100, 258, 486);
		frmMiniEncuesta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniEncuesta.getContentPane().setLayout(null);
		
	}

}
