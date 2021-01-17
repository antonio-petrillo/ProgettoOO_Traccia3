package GuiFood;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Classi.Controller;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class Login extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField TextFild_Email;
	private JPasswordField Password;
	protected Object frame1;
    Controller ctrl;
    private JTextField textField;


	public Login(final Controller ctrl) {

		frame = new JFrame();
		this.getContentPane().setBackground(new Color(255, 165, 0));
		this.setResizable(false);
		this.setBounds(100, 100, 747, 504);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.ctrl=ctrl;
		setSize(new Dimension(749, 504));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 581, 482);
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Accesso/iconaAccesso.jpg")));
		lblNewLabel.setBounds(0, 0, 581, 482);
		panel.add(lblNewLabel);
 
		
		JLabel Label_Food = new JLabel("Food");
		Label_Food.setForeground(new Color(255, 255, 255));
		Label_Food.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 35));
		Label_Food.setBounds(621, 64, 92, 63);
		this.getContentPane().add(Label_Food);
		
		JLabel Label_Email = new JLabel("E-mail");
		Label_Email.setForeground(new Color(255, 255, 255));
		Label_Email.setBounds(593, 162, 61, 16);
		this.getContentPane().add(Label_Email);

		
		JLabel Label_Password = new JLabel("Password");
		Label_Password.setForeground(new Color(255, 255, 255));
		Label_Password.setBounds(593, 220, 61, 16);
		this.getContentPane().add(Label_Password);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(593, 196, 138, 12);
		this.getContentPane().add(separator);
		
		TextFild_Email = new JTextField();
		TextFild_Email.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			 	TextFild_Email.setText("");
			}
		});
		TextFild_Email.setText("Inserisci l'e-mail");
		TextFild_Email.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		TextFild_Email.setDisabledTextColor(Color.LIGHT_GRAY);
		TextFild_Email.setForeground(new Color(0, 0, 0));
		TextFild_Email.setSelectionColor(new Color(192, 192, 192));
		TextFild_Email.setBackground(new Color(255, 165, 0));
		TextFild_Email.setBorder(null);
		TextFild_Email.setBounds(593, 183, 148, 16);
		this.getContentPane().add(TextFild_Email);
		TextFild_Email.setColumns(10);
		
		Password = new JPasswordField();
		Password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Password.setText("");
			}
		});
		Password.setForeground(Color.BLACK);
		Password.setText("123456789");
		Password.setBackground(new Color(255, 165, 0));
		Password.setBorder(null);
		Password.setBounds(593, 239, 138, 16);
		this.getContentPane().add(Password);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(593, 254, 138, 12);
		this.getContentPane().add(separator_1);
		
		JButton Button_Accedi = new JButton("Accedi!");
		Button_Accedi.setForeground(new  Color(255, 165, 0));
		Button_Accedi.setBounds(583, 291, 158, 29);
		this.getContentPane().add(Button_Accedi);
		Button_Accedi.addActionListener(this);
		

		
		JButton Button_HaiDimenticatoLa = new JButton("Hai dimenticato la password?");
		Button_HaiDimenticatoLa.setFont(new Font("Kohinoor Gujarati", Font.PLAIN, 11));
		Button_HaiDimenticatoLa.setBorder(null);
		Button_HaiDimenticatoLa.setForeground(Color.WHITE);
		Button_HaiDimenticatoLa.setBounds(583, 313, 158, 29);
		this.getContentPane().add(Button_HaiDimenticatoLa);
		Button_HaiDimenticatoLa.addActionListener(this);
		
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(255, 255, 255));
		separator_1_1.setBounds(583, 330, 158, 12);
		this.getContentPane().add(separator_1_1);
		
		JButton Button_Registrazione = new JButton("Registrati!");
        Button_Registrazione.setForeground(new  Color(255, 165, 0));
		Button_Registrazione.setBounds(583, 354, 158, 29);
		this.getContentPane().add(Button_Registrazione);
		
		textField = new JTextField();
		textField.setText("");
		textField.setSelectionColor(Color.LIGHT_GRAY);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField.setDisabledTextColor(Color.BLACK);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(new Color(255, 165, 0));
		textField.setBounds(513, 171, 289, 16);
		getContentPane().add(textField);
		Button_Registrazione.addActionListener(this);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand().equals("Hai dimenticato la password?"))
			{
				ctrl.visualizzazionePwdDimenticata();
			}
			else if(e.getActionCommand().equals("Registrati!"))
			{
				ctrl.visualizzazioneRegistrazione();
			}
			
    }
}

