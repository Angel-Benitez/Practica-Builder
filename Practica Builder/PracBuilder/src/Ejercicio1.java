import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
public class Ejercicio1 {
private JFrame frame;
    ActionListener oyenteDeaccion;
/**
 * Launch the application.
 */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Ejercicio1 window = new Ejercicio1();
                    window.frame.setVisible(true);
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
     }
/**
 * Create the application.
 */
    public Ejercicio1() {
        initialize();
    }

/**
 * Initialize the contents of the frame.
 */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("Imitador");
        frame.getContentPane().setForeground(Color.LIGHT_GRAY);
        frame.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        ButtonGroup Grupo=new ButtonGroup();
        ButtonGroup Grupo2=new ButtonGroup();
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(0, 150, 374, 211);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Espejo");
        lblNewLabel.setBounds(10, 11, 46, 14);
        panel.add(lblNewLabel);
        
        JRadioButton rdbEspejo = new JRadioButton("Opcion 1");
        rdbEspejo.setEnabled(false);
        rdbEspejo.setBackground(SystemColor.inactiveCaption);
        rdbEspejo.setBounds(10, 32, 89, 23);
        panel.add(rdbEspejo);

        JRadioButton rdbEspejo2 = new JRadioButton("Opcion 2");
        rdbEspejo2.setEnabled(false);
        rdbEspejo2.setBackground(SystemColor.inactiveCaption);
        rdbEspejo2.setBounds(10, 58, 89, 23);
        panel.add(rdbEspejo2);
        
        JRadioButton rdbEspejo3 = new JRadioButton("Opcion 3");
        rdbEspejo3.setEnabled(false);
        rdbEspejo3.setBackground(SystemColor.inactiveCaption);
        rdbEspejo3.setBounds(10, 84, 89, 23);
        panel.add(rdbEspejo3);
        
        Grupo.add(rdbEspejo);
        Grupo.add(rdbEspejo2);
        Grupo.add(rdbEspejo3);
        
        JCheckBox chkbEspejo = new JCheckBox("Opcion 4");
        chkbEspejo.setEnabled(false);
        chkbEspejo.setBackground(SystemColor.inactiveCaption);
        chkbEspejo.setBounds(121, 32, 97, 23);
        panel.add(chkbEspejo);
        
        JCheckBox chkbEspejo2 = new JCheckBox("Opcion 5");
        chkbEspejo2.setEnabled(false);
        chkbEspejo2.setBackground(SystemColor.inactiveCaption);
        chkbEspejo2.setBounds(121, 58, 97, 23);
        panel.add(chkbEspejo2);
        
        JCheckBox chkbEspejo3 = new JCheckBox("Opcion 6");
        chkbEspejo3.setEnabled(false);
        chkbEspejo3.setBackground(SystemColor.inactiveCaption);
        chkbEspejo3.setBounds(121, 84, 97, 23);
        panel.add(chkbEspejo3);
        
        JComboBox cbEspejo = new JComboBox();
        cbEspejo.setEnabled(false);
        cbEspejo.setModel(new DefaultComboBoxModel(new String[] {"Elige 1","Elige 2", "Elige 3", "Elige 4"}));
        cbEspejo.setSelectedIndex(0);
        cbEspejo.setBounds(224, 66, 121, 22);
        panel.add(cbEspejo);
        
        JSpinner spEspejo = new JSpinner();
        spEspejo.setEnabled(false);
        spEspejo.setBounds(224, 99, 121, 20);
        panel.add(spEspejo);
        
        JTextArea  txaEspejo = new JTextArea();
        txaEspejo.setEnabled(false);
        txaEspejo.setBounds(224, 31, 121, 22);
        panel.add(txaEspejo);
        
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnCerrar.setBounds(129, 163, 89, 23);
        panel.add(btnCerrar);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(SystemColor.inactiveCaption);
        panel_1.setBounds(0, 0, 374, 152);

        frame.getContentPane().add(panel_1);
        JLabel lblCopia = new JLabel("Original");
        lblCopia.setBounds(10, 11, 46, 14);
        panel_1.add(lblCopia);
        
        JRadioButton rdbOriginal = new JRadioButton("Opcion 1");
        rdbOriginal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	rdbEspejo.setSelected(rdbOriginal.isSelected());
            }
        });
        rdbOriginal.setBackground(SystemColor.inactiveCaption);
        rdbOriginal.setBounds(10, 32, 109, 23);
        panel_1.add(rdbOriginal);
        
        JRadioButton rdbOriginal2 = new JRadioButton("Opcion 2");
        rdbOriginal2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	rdbEspejo2.setSelected(rdbOriginal2.isSelected());
            }
        });
        rdbOriginal2.setBackground(SystemColor.inactiveCaption);
        rdbOriginal2.setBounds(10, 58, 109, 23);
        panel_1.add(rdbOriginal2);

        JRadioButton rdbOriginal3 = new JRadioButton("Opcion 3");
        rdbOriginal3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	rdbEspejo3.setSelected(rdbOriginal3.isSelected());
            }
        });
        rdbOriginal3.setBackground(SystemColor.inactiveCaption);
        rdbOriginal3.setBounds(10, 84, 109, 23);
        panel_1.add(rdbOriginal3);
        Grupo2.add(rdbOriginal);
        Grupo2.add(rdbOriginal2);
        Grupo2.add(rdbOriginal3);
        
        JCheckBox chkbOriginal = new JCheckBox("Opcion 4");
        chkbOriginal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	chkbEspejo.setSelected(chkbOriginal.isSelected());
            }
        });
        chkbOriginal.setBackground(SystemColor.inactiveCaption);
        chkbOriginal.setBounds(121, 32, 97, 23);
        panel_1.add(chkbOriginal);
        
        JCheckBox chkbOrigina2 = new JCheckBox("Opcion 5");
        chkbOrigina2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	chkbEspejo2.setSelected(chkbOrigina2.isSelected());
            }
        });
        chkbOrigina2.setBackground(SystemColor.inactiveCaption);
        chkbOrigina2.setBounds(121, 58, 97, 23);
        panel_1.add(chkbOrigina2);
        
        JCheckBox chkbOrigina3 = new JCheckBox("Opcion 6");
        chkbOrigina3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	chkbEspejo3.setSelected(chkbOrigina3.isSelected());
            }
        });
        chkbOrigina3.setBackground(SystemColor.inactiveCaption);
        chkbOrigina3.setBounds(121, 84, 97, 23);
        panel_1.add(chkbOrigina3);
        
        JComboBox cbOriginal = new JComboBox();
        cbOriginal.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

            	cbEspejo.setSelectedIndex(cbOriginal.getSelectedIndex());
            }
        });
        cbOriginal.setModel(new DefaultComboBoxModel(new String[] {"Elige 1","Elige 2", "Elige 3", "Elige 4"}));
        cbOriginal.setSelectedIndex(0);
        cbOriginal.setBounds(224, 66, 121, 22);
        panel_1.add(cbOriginal);
        
        JSpinner spOriginal = new JSpinner();
        spOriginal.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            	spEspejo.setValue((Integer) spOriginal.getValue());
            }
        });
        spOriginal.setBounds(224, 99, 121, 20);
        panel_1.add(spOriginal);
        
        JTextArea txaOriginal = new JTextArea();
        txaOriginal.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            	txaEspejo.setText(txaOriginal.getText());
            }
        });
        txaOriginal.setBounds(224, 31, 121, 22);
        panel_1.add(txaOriginal);
        
        JSeparator separador = new JSeparator();
        separador.setBounds(0, 147, 392, 5);
        panel_1.add(separador);
        separador.setBackground(SystemColor.activeCaptionBorder);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 383, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}