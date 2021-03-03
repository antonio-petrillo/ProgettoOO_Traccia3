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
import Classi.Utente;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;

public  class Login extends JFrame implements ActionListener,MouseListener{
	private static final long serialVersionUID = 1L;
	private JPasswordField textField_Password;
	private JTextField textFild_Email;
    private  String PasswordDimenticata_cmd = "Hai dimenticato la password?";
    private  String Registrati_cmd = "Registrati!";
    private Controller ctrl;
 
	public Login(Controller ctrl) {
		setTitle("Login");
		this.getContentPane().setBackground(new Color(255, 165, 0));
		this.setResizable(false);
		this.setBounds(100, 100, 747, 504);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		setSize(new Dimension(744, 503));
		this.ctrl=ctrl;
			
		JLabel Label_Food = new JLabel("Food");
		Label_Food.setForeground(new Color(255, 255, 255));
		Label_Food.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		Label_Food.setBounds(621, 64, 92, 63);
		this.getContentPane().add(Label_Food);
		
		JLabel Label_Email = new JLabel("E-mail");
		Label_Email.setForeground(new Color(255, 255, 255));
		Label_Email.setBounds(593, 162, 61, 16);
		this.getContentPane().add(Label_Email);
		
		JLabel lblIconaEmail = new JLabel("");
		lblIconaEmail.setBounds(593, 181, 21, 20);
		getContentPane().add(lblIconaEmail);
		lblIconaEmail.setIcon(ctrl.scaleImageIcon(new ImageIcon(Login.class.getResource("/Accesso./email.png")), 15, 15));
		
		JSeparator separator_email = new JSeparator();
		separator_email.setForeground(Color.WHITE);
		separator_email.setBounds(593, 196, 138, 12);
		this.getContentPane().add(separator_email);
			
		textFild_Email = new JTextField();		
    	textFild_Email.setSelectionColor(null);
		textFild_Email.setDisabledTextColor(new Color(255, 140, 0));
		textFild_Email.setForeground(Color.BLACK);
		textFild_Email.setText("Inserisci l'email");
		textFild_Email.setBackground(new Color(255, 165, 0));
		textFild_Email.setBorder(null);
		textFild_Email.setBounds(613, 179, 118, 22);
	    textFild_Email.addMouseListener((MouseListener) this);
		this.getContentPane().add(textFild_Email);
			
		JLabel Label_Password = new JLabel("Password");
		Label_Password.setForeground(new Color(255, 255, 255));
		Label_Password.setBounds(593, 220, 61, 16);
		this.getContentPane().add(Label_Password);
		
		textField_Password = new JPasswordField();
		textField_Password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_Password.setText("");
			}
		});
		textField_Password.setForeground(Color.BLACK);
		textField_Password.setText("123456789");
		textField_Password.setBackground(new Color(255, 165, 0));
		textField_Password.setBorder(null);
		textField_Password.setBounds(613, 237, 118, 22);
		textField_Password.addMouseListener((MouseListener) this);

		this.getContentPane().add(textField_Password);
		
		JLabel lblIconaPassword = new JLabel("");
		lblIconaPassword.setBounds(593, 240, 21, 20);
		getContentPane().add(lblIconaPassword);
		lblIconaPassword.setIcon(ctrl.scaleImageIcon(new ImageIcon(Login.class.getResource("/Accesso./Password.png")), 15, 15));
		
		JSeparator separator_password = new JSeparator();
		separator_password.setForeground(Color.WHITE);
		separator_password.setBounds(593, 254, 138, 12);
		this.getContentPane().add(separator_password);
		
		JButton Button_Accedi = new JButton("Accedi!");
		Button_Accedi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button_Accedi.setFocusable(false);
		Button_Accedi.setForeground(new  Color(255, 165, 0));
		Button_Accedi.setBounds(583, 291, 158, 29);
		this.getContentPane().add(Button_Accedi);
		Button_Accedi.addActionListener(this);

		JButton Button_HaiDimenticatoLaPassword = new JButton("Hai dimenticato la password?");
		Button_HaiDimenticatoLaPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		Button_HaiDimenticatoLaPassword.setBorder(null);
		Button_HaiDimenticatoLaPassword.setForeground(Color.WHITE);
		Button_HaiDimenticatoLaPassword.setBounds(583, 313, 158, 29);
		this.getContentPane().add(Button_HaiDimenticatoLaPassword);
		Button_HaiDimenticatoLaPassword.addActionListener(this);
		Button_HaiDimenticatoLaPassword.setActionCommand(PasswordDimenticata_cmd);

		JSeparator separator_HaiDimenticatoLaPassword = new JSeparator();
		separator_HaiDimenticatoLaPassword.setForeground(new Color(255, 255, 255));
		separator_HaiDimenticatoLaPassword.setBounds(583, 330, 158, 12);
		this.getContentPane().add(separator_HaiDimenticatoLaPassword);
		
		JButton Button_Registrazione = new JButton("Registrati!");
		Button_Registrazione.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button_Registrazione.setFocusable(false);
        Button_Registrazione.setForeground(new  Color(255, 165, 0));
		Button_Registrazione.setBounds(583, 354, 158, 29);
		this.getContentPane().add(Button_Registrazione);
		Button_Registrazione.addActionListener(this);
		Button_Registrazione.setActionCommand(Registrati_cmd);
	
	    JPanel panel = new JPanel();
		panel.setBounds(0, 0, 581, 482);
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIconaLogin = new JLabel("");
		lblIconaLogin.setIcon(new ImageIcon(Login.class.getResource("/Accesso./Accesso.png")));
		lblIconaLogin.setBounds(0, -19, 581, 529);
		panel.add(lblIconaLogin);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals(PasswordDimenticata_cmd))
			{
				ctrl.visualizzazionePwdDimenticata();
			}
			else if(e.getActionCommand().equals(Registrati_cmd))
			{
				ctrl.visualizzazioneRegistrazione();
			}
				else
			{
				String password=new String(textField_Password.getPassword());
				ctrl.effettuaAccesso(new Utente(textFild_Email.getText(),password));
				ctrl.visualizzazioneMenu();
			}

     }
      
		public void mouseClicked(MouseEvent e) {
			textFild_Email.setText(""); 
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
     
}
