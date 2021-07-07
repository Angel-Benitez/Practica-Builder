import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

import javax.swing.JCheckBox;

public class Ejercicio6 {
    private JFrame frmDeterminacionDeTriangulo;
	private boolean a;
/**
 * Launch the application.
 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Ejercicio6 window = new Ejercicio6();
                    window.frmDeterminacionDeTriangulo.setVisible(true);
                } catch (Exception e) {
                        e.printStackTrace();
                }
            }
        });
    }
/**
 * Create the application.
 */
    public Ejercicio6() {
        initialize();
    }
/**
 * Initialize the contents of the frame.
 * @param triangulo 
 */
    private void initialize() {
        frmDeterminacionDeTriangulo = new JFrame();
        frmDeterminacionDeTriangulo.setResizable(false);
        frmDeterminacionDeTriangulo.setTitle("Determinacion de Triangulo");
        frmDeterminacionDeTriangulo.setBounds(100, 100, 420, 441);
        frmDeterminacionDeTriangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDeterminacionDeTriangulo.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 382, 379);
        panel.setBackground(SystemColor.inactiveCaption);
        frmDeterminacionDeTriangulo.getContentPane().add(panel);
        panel.setLayout(null);
        
        JSpinner spinner1 = new JSpinner();
        spinner1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double (1)));
        spinner1.setBounds(63, 277, 65, 20);
        panel.add(spinner1);

        JSpinner spinner2 = new JSpinner();
        spinner2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
        spinner2.setBounds(164, 277, 65, 20);
        panel.add(spinner2);
        
        JSpinner spinner3 = new JSpinner();
        spinner3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
        spinner3.setBounds(258, 277, 65, 20);
        panel.add(spinner3);
        //spinner1.setEditor(spinner3);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(10, 11, 219, 204);
        
        ImageIcon ico = new ImageIcon(getClass().getResource("Triangulos.jpg"));
        ImageIcon ima = new  ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), 
        lblNewLabel.getWidth(), Image.SCALE_SMOOTH));
        lblNewLabel.setIcon(ima);
        
        panel.add(lblNewLabel);
        JButton btnNewButton = new JButton("Comprobar");
        btnNewButton.setBounds(50, 321, 102, 23);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("Lado 1");
        lblNewLabel_1.setBounds(63, 257, 46, 14);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Lado 2");
        lblNewLabel_1_1.setBounds(164, 257, 46, 14);
        panel.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Lado 3");
        lblNewLabel_1_2.setBounds(259, 252, 46, 14);
        panel.add(lblNewLabel_1_2);
        
        JLabel labelrespuesta = new JLabel("");
        labelrespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        labelrespuesta.setBounds(239, 122, 126, 36);
        panel.add(labelrespuesta);
        
        JCheckBox Arecto = new JCheckBox("Tiene angulo recto");
        Arecto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a=Arecto.isSelected();
            }
        });
        Arecto.setBounds(188, 321, 142, 23);
        panel.add(Arecto);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Triangulo triangulo =new Triangulo();
                    double lado1=(double) spinner1.getValue();
                    double lado2=(double) spinner2.getValue();
                    double lado3=(double) spinner3.getValue();
                    triangulo.setlados( lado1,lado2,lado3);
                    if (triangulo.EsEquilatero(false)) {
                    	if (a==true) {
                    		try {
            			        JOptionPane.showMessageDialog(Arecto,"Tus lados no pueden ser iguales");
            			    }catch(Exception e1) {
            			    }
                		}
                        else {
                        	labelrespuesta.setText("Es Equilatero");
                            ImageIcon ico = new ImageIcon(getClass().getResource("Triangulo equilatero.png"));
                            ImageIcon ima = new  ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), 
                            lblNewLabel.getWidth(), Image.SCALE_SMOOTH));
                            lblNewLabel.setIcon(ima);
                        }
                    }
                    else if(triangulo.EsIsoceles(false)) {
                        labelrespuesta.setText("Es Isoceles");
                        ImageIcon ico = new ImageIcon(getClass().getResource("Triángulo isósceles.png"));
                        ImageIcon ima = new  ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), 
                        lblNewLabel.getWidth(), Image.SCALE_SMOOTH));
                        lblNewLabel.setIcon(ima);
                    }
                    else if(triangulo.EsEscaleno(false)) {
                        labelrespuesta.setText("Es Escaleno");
                        ImageIcon ico = new ImageIcon(getClass().getResource("Triángulo escaleno.png"));
                        ImageIcon ima = new  ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(), 
                        lblNewLabel.getWidth(), Image.SCALE_SMOOTH));
                        lblNewLabel.setIcon(ima);
                    }
                }catch(Exception e1) {
                    JOptionPane.showMessageDialog(btnNewButton,( e1.getMessage()),"error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

