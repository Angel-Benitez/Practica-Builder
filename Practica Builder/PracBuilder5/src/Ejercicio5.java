import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Ejercicio5 {
    private JFrame frame;
    private JTextField textField1;
    ButtonGroup grupo1 ,grupo2;
    private Libro [] libros;
/**
 * Launch the application.
 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Ejercicio5 window = new Ejercicio5();
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
    public Ejercicio5() {
        initialize();
    }
/**
 * Initialize the contents of the frame.
 * @return 
 */
    private void initialize() {
    	libros = new Libro [2];
        libros[0] = new Libro("LIB0001", "Sangre de Campeon", true, false);
        libros[1] = new Libro("LIB0002", "Troya", false, true);
    	
        frame = new JFrame();
        frame.setTitle("Prestamo de libros");
        frame.setResizable(false);
        frame.setBounds(100, 100, 330, 341);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Biblioteca Nacional",TitledBorder.LEFT, TitledBorder.TOP, null, null));
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(10, 11, 292, 278);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel Label1 = new JLabel("Codigo Libro");
        Label1.setBounds(21, 26, 93, 14);
        panel.add(Label1);
        
        JLabel Label2 = new JLabel("Libro");
        Label2.setBounds(21, 75, 46, 14);
        panel.add(Label2);
        
        JLabel Label3 = new JLabel("Original");
        Label3.setBounds(21, 121, 46, 14);
        panel.add(Label3);
        
        JLabel Label4 = new JLabel("Prestable");
        Label4.setBounds(21, 178, 93, 14);
        panel.add(Label4);
        
        textField1 = new JTextField();
        textField1.setEditable(false);
        textField1.setBounds(20, 44, 119, 20);
        panel.add(textField1);
        textField1.setColumns(10);
        
        grupo1=new ButtonGroup();
        JRadioButton rb1Si = new JRadioButton("Si");
        rb1Si.setEnabled(false);
        rb1Si.setBounds(21, 142, 46, 23);
        panel.add(rb1Si);
        
        JRadioButton rdb1No = new JRadioButton("No");
        rdb1No.setEnabled(false);
        rdb1No.setBounds(68, 142, 46, 23);
        panel.add(rdb1No);
        grupo1.add(rb1Si);
        grupo1.add(rdb1No);
        
        grupo2=new ButtonGroup();
        JRadioButton rdb2No = new JRadioButton("No");
        rdb2No.setEnabled(false);
        rdb2No.setBounds(68, 199, 46, 23);
        panel.add(rdb2No);
        
        JRadioButton rdb2Si = new JRadioButton("Si");
        rdb2Si.setEnabled(false);
        rdb2Si.setBounds(21, 199, 46, 23);
        panel.add(rdb2Si);
        grupo2.add(rdb2Si);
        grupo2.add(rdb2No);
        
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedIndex()==0) {
                    textField1.setText(libros[0].GetCodigoLibro());
                    if(libros[0].GetOriginal()) {
                        rb1Si.setSelected(libros[0].GetOriginal());
                    }
                    else
                    rdb1No.setSelected(true);
                    if (libros[0].GetPrestable()) {
                        rdb2Si.setSelected(libros[0].GetPrestable());
                    }
                    else
                    rdb2No.setSelected(true);
                }
                else if(comboBox.getSelectedIndex()==1) {
                    textField1.setText(libros[1].GetCodigoLibro());
                    textField1.setText(libros[1].GetCodigoLibro());
                    if(libros[1].GetOriginal()) {
                        rb1Si.setSelected(libros[1].GetOriginal());
                    }
                    else
                    rdb1No.setSelected(true);
                    if (libros[1].GetPrestable()) {
                        rdb2Si.setSelected(libros[1].GetPrestable());
                }
                else 
                rdb2No.setSelected(true);
                }
            }
        });
        comboBox.insertItemAt(libros[0].GetTitulo(), 0);
        comboBox.insertItemAt(libros[1].GetTitulo(), 1);
        comboBox.setEditable(false);
        comboBox.setBounds(21, 89, 209, 22);
        
        JButton b1 = new JButton("Solicitar");
        b1.setBounds(21, 229, 110, 39);
        panel.add(b1);
        
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setVisible(false);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN,22));
        lblNewLabel.setDisplayedMnemonic('0');
        lblNewLabel.setBounds(153, 176, 119, 26);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(comboBox.getSelectedIndex()==0) {
                    lblNewLabel.setText("No prestable");
                    lblNewLabel.setVisible(true);
                }
                else if(comboBox.getSelectedIndex()==1) {
                    lblNewLabel.setText("Exito");
                    lblNewLabel.setVisible(true);
                }
            }
        });
        panel.add(comboBox);
        panel.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Cerrar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton.setBounds(194, 245, 89, 23);
        panel.add(btnNewButton);
    }
}                   


