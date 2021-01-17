package GuiFood;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;

import Classi.Controller;
import Classi.Utente;




public  class Registrazioni extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	Controller ctrl;
	private JTextField textField_Nome;
	private JTextField textField_Cognome;
	private JTextField textField_Email;
	private JTextField textField_NumTelefonico;
	private JTextField textField_DataNascita;
	private JTextField textField_Password;
	
	public Registrazioni(final Controller ctrl) {
		setResizable(false);
		setBounds(100, 100, 556, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
        this.ctrl=ctrl;
		

		
		JLabel Label_Food1 = new JLabel("Food");
		Label_Food1.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Food1.setForeground(Color.WHITE);
		Label_Food1.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 35));
		Label_Food1.setBounds(216, 6, 109, 63);
		contentPanel.add(Label_Food1);
		
		JLabel Label_Nome = new JLabel("Nome");
		Label_Nome.setForeground(Color.WHITE);
		Label_Nome.setBounds(82, 85, 45, 21);
		contentPanel.add(Label_Nome);
		
		JSeparator separator_Nome = new JSeparator();
		separator_Nome.setForeground(Color.WHITE);
		separator_Nome.setBounds(139, 99, 348, 12);
		contentPanel.add(separator_Nome);
		
		JLabel Label_Cognome = new JLabel("Cognome");
		Label_Cognome.setForeground(Color.WHITE);
		Label_Cognome.setBounds(66, 124, 61, 21);
		contentPanel.add(Label_Cognome);
		
		JSeparator separator_Cognome = new JSeparator();
		separator_Cognome.setForeground(Color.WHITE);
		separator_Cognome.setBounds(139, 138, 348, 12);
		contentPanel.add(separator_Cognome);
		
		JLabel Label_Email_Registrazione = new JLabel("Email");
		Label_Email_Registrazione.setForeground(Color.WHITE);
		Label_Email_Registrazione.setBounds(93, 157, 34, 29);
		contentPanel.add(Label_Email_Registrazione);
		
		JSeparator separator_Email = new JSeparator();
		separator_Email.setForeground(Color.WHITE);
		separator_Email.setBounds(139, 174, 348, 12);
		contentPanel.add(separator_Email);
		
		JLabel Label_NumTelefonico = new JLabel("Numero Telefonico");
		Label_NumTelefonico.setForeground(Color.WHITE);
		Label_NumTelefonico.setBounds(6, 198, 128, 21);
		contentPanel.add(Label_NumTelefonico);
		
		JSeparator separator_NumeroTelefonico = new JSeparator();
		separator_NumeroTelefonico.setForeground(Color.WHITE);
		separator_NumeroTelefonico.setBounds(139, 216, 348, 12);
		contentPanel.add(separator_NumeroTelefonico);
		
		JLabel Label_DataNascita = new JLabel("Data Nascita");
		Label_DataNascita.setForeground(Color.WHITE);
		Label_DataNascita.setBounds(48, 233, 85, 16);
		contentPanel.add(Label_DataNascita);
		
		JSeparator separator_DataNascita = new JSeparator();
		separator_DataNascita.setForeground(Color.WHITE);
		separator_DataNascita.setBounds(139, 251, 348, 12);
		contentPanel.add(separator_DataNascita);
		
		JLabel Label_PwdRegistrazione = new JLabel("Password");
		Label_PwdRegistrazione.setForeground(Color.WHITE);
		Label_PwdRegistrazione.setBounds(73, 275, 61, 16);
		contentPanel.add(Label_PwdRegistrazione);
		
		JSeparator separator_Password = new JSeparator();
		separator_Password.setForeground(Color.WHITE);
		separator_Password.setBounds(139, 287, 348, 12);
		contentPanel.add(separator_Password);
		
		JButton Button_Iscriviti = new JButton("Iscriviti");
//		Button_Iscriviti.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String password=new String(textField_Password.getText());
//				boolean check_nome = ctrl.controllaCaratteriNonAmmessi(textField_Nome.getText());
//				boolean check_cognome =  ctrl.controllaCaratteriNonAmmessi(textField_Cognome.getText())  ;
//				boolean check_email =  ctrl.controllaCaratteriNonAmmessi(textField_Email.getText());
//				boolean check_dataNascita =  ctrl.controllaCaratteriNonAmmessi(textField_DataNascita.getText());
//				boolean check_numTelefonico =  ctrl.controllaCaratteriNonAmmessi(textField_NumTelefonico.getText());
//                if(check_nome && check_cognome && check_email && check_dataNascita && check_numTelefonico)
//					ctrl.creaUtente(new Utente(textField_Nome.getText(),textField_Cognome.getText(),textField_Email.getText(), password ,textField_DataNascita.getText(),  textField_NumTelefonico.getText()));
//				else
//					{if(check_cognome && check_nome && check_email && check_dataNascita && !check_numTelefonico)
//					{
//						ctrl.VisualizzazioneErrore("ERRORE : il campo numero di telefono contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
//					}
//					else if(check_cognome && check_nome  && check_email && !check_dataNascita && check_numTelefonico)
//					{
//						ctrl.VisualizzazioneErrore("ERRORE : il campo data di nascita contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
//					}
//					else if(check_cognome && check_nome && !check_email && check_dataNascita && check_numTelefonico)
//					{
//						ctrl.VisualizzazioneErrore("ERRORE : il campo email contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
//					}
//					else if(check_cognome && !check_nome && check_email && check_dataNascita && check_numTelefonico)
//					{
//						ctrl.VisualizzazioneErrore("ERRORE : il campo nome contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
//					}
//					else if(!check_cognome && check_nome && check_email && check_dataNascita && check_numTelefonico)
//					{
//						ctrl.VisualizzazioneErrore("ERRORE : il campo cognome contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
//					}
//					}
//						
//			}
//		});
		Button_Iscriviti.setBounds(216, 336, 153, 29);
		Button_Iscriviti.setForeground(new  Color(255, 165, 0));
		contentPanel.add(Button_Iscriviti);
		
		textField_Nome = new JTextField();
		textField_Nome.setText("");
		textField_Nome.setSelectionColor(Color.LIGHT_GRAY);
		textField_Nome.setForeground(Color.BLACK);
		textField_Nome.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Nome.setDisabledTextColor(Color.BLACK);
		textField_Nome.setColumns(10);
		textField_Nome.setBorder(null);
		textField_Nome.setBackground(new Color(255, 165, 0));
		textField_Nome.setBounds(139, 85, 348, 16);
		contentPanel.add(textField_Nome);
		
		textField_Cognome = new JTextField();
		textField_Cognome.setText("");
		textField_Cognome.setSelectionColor(Color.LIGHT_GRAY);
		textField_Cognome.setForeground(Color.BLACK);
		textField_Cognome.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Cognome.setDisabledTextColor(Color.BLACK);
		textField_Cognome.setColumns(10);
		textField_Cognome.setBorder(null);
		textField_Cognome.setBackground(new Color(255, 165, 0));
		textField_Cognome.setBounds(139, 124, 350, 16);
		contentPanel.add(textField_Cognome);
		
		textField_Email = new JTextField();
		textField_Email.setText("");
		textField_Email.setSelectionColor(Color.LIGHT_GRAY);
		textField_Email.setForeground(Color.BLACK);
		textField_Email.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Email.setDisabledTextColor(Color.BLACK);
		textField_Email.setColumns(10);
		textField_Email.setBorder(null);
		textField_Email.setBackground(new Color(255, 165, 0));
		textField_Email.setBounds(139, 162, 348, 16);
		contentPanel.add(textField_Email);
		
		textField_NumTelefonico = new JTextField();
		textField_NumTelefonico.setText("");
		textField_NumTelefonico.setSelectionColor(Color.LIGHT_GRAY);
		textField_NumTelefonico.setForeground(Color.BLACK);
		textField_NumTelefonico.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_NumTelefonico.setDisabledTextColor(Color.BLACK);
		textField_NumTelefonico.setColumns(10);
		textField_NumTelefonico.setBorder(null);
		textField_NumTelefonico.setBackground(new Color(255, 165, 0));
		textField_NumTelefonico.setBounds(139, 199, 356, 21);
		contentPanel.add(textField_NumTelefonico);
		
		textField_DataNascita = new JTextField();
		textField_DataNascita.setText("");
		textField_DataNascita.setSelectionColor(Color.LIGHT_GRAY);
		textField_DataNascita.setForeground(Color.BLACK);
		textField_DataNascita.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_DataNascita.setDisabledTextColor(Color.BLACK);
		textField_DataNascita.setColumns(10);
		textField_DataNascita.setBorder(null);
		textField_DataNascita.setBackground(new Color(255, 165, 0));
		textField_DataNascita.setBounds(139, 231, 338, 21);
		contentPanel.add(textField_DataNascita);
		
		textField_Password = new JTextField();
		textField_Password.setText("");
		textField_Password.setSelectionColor(Color.LIGHT_GRAY);
		textField_Password.setForeground(Color.BLACK);
		textField_Password.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Password.setDisabledTextColor(Color.BLACK);
		textField_Password.setColumns(10);
		textField_Password.setBorder(null);
		textField_Password.setBackground(new Color(255, 165, 0));
		textField_Password.setBounds(139, 275, 348, 16);
		contentPanel.add(textField_Password);
	

		
	}


}
