import java.awt.EventQueue;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;

public class Ejercicio3 {

	private JFrame frame;
	private JFrame frmMiniEncuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
					window.frame.setVisible(true);
					window.frmMiniEncuesta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Mini Encuesta");
		frame.setResizable(false);
		frame.setBounds(100, 100, 250, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 244, 371);
		frame.getContentPane().add(panel_1);

		
		JLabel lblNewLabel = new JLabel("Elige tu sistema operativo");
		lblNewLabel.setBounds(23, 21, 190, 21);
		panel_1.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(23, 48, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(23, 76, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(23, 102, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup Grupo = new ButtonGroup();
		Grupo.add(rdbtnNewRadioButton);
		Grupo.add(rdbtnNewRadioButton_1);
		Grupo.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elige tu especialidad (una o m\u00E1s)");
		lblNewLabel_1.setBounds(23, 141, 190, 21);
		panel_1.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setBounds(23, 169, 123, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o grafico ");
		chckbxNewCheckBox_1.setBounds(23, 195, 123, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administraci\u00F3n");
		chckbxNewCheckBox_2.setBounds(23, 221, 123, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas al ordenador");
		lblNewLabel_2.setBounds(23, 258, 190, 21);
		panel_1.add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setValue(0);
		slider.setBounds(45, 290, 153, 26);
		panel_1.add(slider);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    while(slider.getValue()==0) {
			    	Grupo.clearSelection();
			        break;
			    }
			    try {
			    	Grupo.getSelection().getActionCommand();
			        JOptionPane.showMessageDialog(frmMiniEncuesta, "Tu "
			    	+ "sistema operativo preferido es: "
			        +selChkbox1(rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2)
			        +","+"\ntus especialidades son: " 
			   		+ selChkbox(chckbxNewCheckBox, chckbxNewCheckBox_1, chckbxNewCheckBox_2)
				    + "\n el numero de horas dedicadas en el"
				    + "ordenador son "+slider.getValue()+"h");
			        
			    }
			    catch(Exception e1) {
			        JOptionPane.showMessageDialog(frmMiniEncuesta,"No puedes dejar nada vacio");
			    }
			}
		});

		btnNewButton.setBounds(67, 327, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(23, 290, 23, 26);
		panel_1.add(lblNewLabel_3);
		
		slider.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				lblNewLabel_3.setText(""+slider.getValue());
			}
		});
	}
	String selChkbox(JCheckBox a,JCheckBox b,JCheckBox c) {
		String txt="ninguna";
		if(a.isSelected()) {
		    txt=a.getText()+",";
		}
		else if(b.isSelected())
		    txt= b.getText()+",";
		else if (c.isSelected()) {
		    txt= c.getText()+",";
		}
		if(a.isSelected() && b.isSelected()) {
		    txt= a.getText()+" y "+b.getText()+",";
		}
		else if(a.isSelected() && c.isSelected()) {
		    txt=a.getText()+" y "+c.getText()+",";
		}
		else if (b.isSelected() && c.isSelected()) {
		    txt= b.getText()+" y "+c.getText()+",";
		}
		if(a.isSelected() && b.isSelected() && c.isSelected()) {
		    txt= a.getText()+", "+b.getText()+" y "+c.getText()+",";
		}
		return txt;
    }
	String selChkbox1(JRadioButton d, JRadioButton e, JRadioButton f) {
		String txt1="";
		if(d.isSelected()) {
		    txt1=d.getText();
		}
		if(e.isSelected()) {
		    txt1=e.getText();
		}
		if(f.isSelected()) {
		    txt1=f.getText();
		}
		return txt1;
	}
}
