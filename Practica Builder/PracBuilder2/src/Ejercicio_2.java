import java.awt.EventQueue;
import java.awt.SystemColor;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_2 {

	private JFrame frame;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2 window = new Ejercicio_2();
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
	public Ejercicio_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Generador de números");
		frame.setBounds(100, 100, 350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 334, 261);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNum1 = new JLabel("Número 1");
		lblNum1.setBounds(39, 35, 66, 25);
		panel_1.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Número 2");
		lblNum2.setBounds(39, 79, 66, 25);
		panel_1.add(lblNum2);
		
		JLabel lblNumG = new JLabel("Número generado:");
		lblNumG.setBounds(39, 133, 109, 25);
		panel_1.add(lblNumG);
		
		JSpinner spNum1 = new JSpinner();
		spNum1.setBounds(148, 37, 47, 20);
		panel_1.add(spNum1);
		
		JSpinner spNum2 = new JSpinner();
		spNum2.setBounds(148, 81, 47, 20);
		panel_1.add(spNum2);
		
		txtResult = new JTextField();
		txtResult.setBounds(148, 135, 47, 20);
		panel_1.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrar.setBounds(235, 227, 89, 23);
		panel_1.add(btnCerrar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
			            int num1=(int)spNum1.getValue();
			            int num2=(int)spNum2.getValue();
			            int numero_aletorio=Generador.GeneraNumAleatorio(num1, num2);
			            txtResult.setText(numero_aletorio+"");
			        }catch(Exception e1) {
			            JOptionPane.showMessageDialog(btnGenerar,( e1.getMessage()),"error",JOptionPane.ERROR_MESSAGE);
			        }
			    }
			});
		btnGenerar.setBounds(106, 183, 89, 23);
		panel_1.add(btnGenerar);
	}
}
class Generador {
    public static int GeneraNumAleatorio (int numA,int numB) {
        int num=(int) Math.floor(Math.random()*(numB-numA)+(numA));
        return num;
    }
}
