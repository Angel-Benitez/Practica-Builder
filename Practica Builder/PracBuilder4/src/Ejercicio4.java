import java.awt.EventQueue;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
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
	public Ejercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Peliculas");
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 434, 161);
		frame.getContentPane().add(panel_1);

		
		JLabel lblNewLabel = new JLabel("Escribe el nombre de una pel\u00EDcula:");
		lblNewLabel.setBounds(35, 21, 220, 26);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(35, 52, 169, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.setBounds(35, 105, 89, 23);
		panel_1.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(245, 54, 157, 22);
		panel_1.add(comboBox);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e){
			    String pelicula=textField.getText();
			    comboBox.addItem(pelicula);
			}
		});

		
		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas:");
		lblNewLabel_1.setBounds(245, 24, 113, 20);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Cerrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(335, 127, 89, 23);
		panel_1.add(btnNewButton_1);
	}
}
