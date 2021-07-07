import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
public class Ejercicio7 {
    private JFrame frmClub;
    private JTextField NombreField;
    private JTextField ProxNum;
    private Socios socio;
    private ButtonGroup grupo_rdb;
    private int a=0,v=1;
/**
 * Launch the application.
 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Ejercicio7 window = new Ejercicio7();
                    window.frmClub.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
/**
 * Create the application.
 */
    public Ejercicio7() {
        initialize();
    }
/**
 * Initialize the contents of the frame.
 */
    private void initialize() {
        frmClub = new JFrame();
        frmClub.setResizable(false);
        frmClub.setTitle("Club");
        frmClub.setBounds(100, 100, 449, 300);
        frmClub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmClub.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 413, 239);
        frmClub.getContentPane().add(panel);
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nombre");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(10, 11, 109, 19);
        panel.add(lblNewLabel);
        
        NombreField = new JTextField();
        NombreField.setBounds(10, 41, 180, 20);
        panel.add(NombreField);
        NombreField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Sexo");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(10, 84, 46, 14);
        panel.add(lblNewLabel_1);
        
        JRadioButton rdbM = new JRadioButton("M");
        rdbM.setBounds(6, 119, 46, 23);
        rdbM.setActionCommand("Masculino");
        panel.add(rdbM);
        
        JRadioButton rdbF = new JRadioButton("F");
        rdbF.setActionCommand("Femenino");
        rdbF.setBounds(54, 119, 38, 23);
        panel.add(rdbF);
        
        grupo_rdb=new ButtonGroup();
        grupo_rdb.add(rdbM);
        grupo_rdb.add(rdbF);
        
        ProxNum = new JTextField();
        ProxNum.setEditable(false);
        ProxNum.setBounds(10, 187, 46, 20);
        panel.add(ProxNum);
        ProxNum.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Proximo Numero");
        lblNewLabel_2.setBounds(10, 162, 109, 14);
        panel.add(lblNewLabel_2);
        
        JTextPane InfoPane = new JTextPane();
        InfoPane.setBackground(Color.WHITE);
        InfoPane.setEditable(false);
        InfoPane.setFont(new Font("Agency FB", InfoPane.getFont().getStyle(), 
        	    InfoPane.getFont().getSize() + 6));
        InfoPane.setBounds(238, 41, 165, 153);
        panel.add(InfoPane);
        JButton btnNewButton = new JButton("CREAR");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	a++;
            	v++;
            	ProxNum.setText(""+v);
                try {
                    //Setters
                	socio=InsertaDato(NombreField);
                	socio.SetSexo(grupo_rdb.getSelection().getActionCommand());
                	ProxNum.setText(""+v);
                	//Text
                	InfoPane.setText("Nombre: "+"\n"+socio.GetNombre()
                	+"\nSexo: \n"+socio.GetSexo()+"\nNumero: \n"+a);
                	//textPane.
                	if(grupo_rdb.getSelection()!=null && NombreField.equals("")){
                	    socio.SetNum();
                	}
                }catch(Exception e1) {
                	JOptionPane.showMessageDialog(frmClub, "Error,No puedes dejar nada vacio");
                }
            }
        });
        btnNewButton.setBounds(118, 205, 89, 23);
        panel.add(btnNewButton);
        JLabel lblNewLabel_3 = new JLabel("Info Socio");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_3.setBounds(238, 15, 137, 14);
        panel.add(lblNewLabel_3);
        
        JButton btnNewButton_1 = new JButton("Cerrar");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton_1.setBounds(324, 216, 89, 23);
        panel.add(btnNewButton_1);
    }
    Socios InsertaDato(JTextField a) {
        Socios socio=new Socios(a.getText());
        return socio;
    }
}
