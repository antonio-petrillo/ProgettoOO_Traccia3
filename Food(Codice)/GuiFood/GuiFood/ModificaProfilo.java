package GuiFood;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import Classi.Controller;
import java.awt.Cursor;

public  class ModificaProfilo extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel = new JPanel();
	private JTextField textField_Nome;
	private JTextField textField_Cognome;
	private JTextField textField_NumTelefonico;
	private JTextField textField_DataNascita;
	private JTextField textField_PasswordAttuale;
	private JTextField textField_Provincia;
	private JTextField textField_CAP;
	private JTextField textField_Città;
	private JTextField textField_Via;
	private JTextField textField_N_Civico;
	private JTextField textField_NuovaPassword;
    private  String ApplicaModifiche_cmd = "Applica Modifiche";
	private JTextField textField_Email;
	
	private Controller ctrl;
	
	public ModificaProfilo(Controller ctrl) {
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setTitle("Modifica profilo");
		setResizable(false);
		setBounds(100, 100, 556, 476);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
        this.ctrl=ctrl;
		
		JLabel Label_Nome = new JLabel("Nome");
		Label_Nome.setForeground(Color.WHITE);
		Label_Nome.setBounds(71, 69, 45, 21);
		contentPanel.add(Label_Nome);
		
		JLabel lblIconaNome = new JLabel("");
		lblIconaNome.setBounds(128, 70, 21, 20);
		lblIconaNome.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./utente.png")), 15, 15));
		contentPanel.add(lblIconaNome);
		
		JSeparator separator_Nome_ = new JSeparator();
		separator_Nome_.setForeground(Color.WHITE);
		separator_Nome_.setBounds(128, 86, 348, 12);
		contentPanel.add(separator_Nome_);
		
		textField_Nome = new JTextField();
		textField_Nome.setText("");
		textField_Nome.setSelectionColor(Color.LIGHT_GRAY);
		textField_Nome.setForeground(Color.BLACK);
		textField_Nome.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Nome.setDisabledTextColor(Color.BLACK);
		textField_Nome.setColumns(10);
		textField_Nome.setBorder(null);
		textField_Nome.setBackground(new Color(255, 165, 0));
		textField_Nome.setBounds(147, 69, 329, 21);
		contentPanel.add(textField_Nome);
		
		JLabel Label_Cognome = new JLabel("Cognome");
		Label_Cognome.setForeground(Color.WHITE);
		Label_Cognome.setBounds(55, 92, 72, 29);
		contentPanel.add(Label_Cognome);
		
		JLabel lblIconaCognome = new JLabel("");
		lblIconaCognome.setBounds(128, 92, 21, 20);
		lblIconaCognome.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./utente.png")), 15, 15));
		contentPanel.add(lblIconaCognome);
		
		JSeparator separator_Cognome1 = new JSeparator();
		separator_Cognome1.setForeground(Color.WHITE);
		separator_Cognome1.setBounds(128, 110, 348, 12);
		contentPanel.add(separator_Cognome1);
		
		textField_Cognome = new JTextField();
		textField_Cognome.setText("");
		textField_Cognome.setSelectionColor(Color.LIGHT_GRAY);
		textField_Cognome.setForeground(Color.BLACK);
		textField_Cognome.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Cognome.setDisabledTextColor(Color.BLACK);
		textField_Cognome.setColumns(10);
		textField_Cognome.setBorder(null);
		textField_Cognome.setBackground(new Color(255, 165, 0));
		textField_Cognome.setBounds(149, 92, 327, 22);
		contentPanel.add(textField_Cognome);
		
		JLabel Label_Email = new JLabel("Email");
		Label_Email.setForeground(Color.WHITE);
		Label_Email.setBounds(82, 125, 34, 21);
		contentPanel.add(Label_Email);
		
		JLabel lblIconaEmail = new JLabel("");
		lblIconaEmail.setBounds(128, 127, 21, 20);
		lblIconaEmail.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./email.png")), 15, 15));
		contentPanel.add(lblIconaEmail);
		
		JSeparator separator_Email1 = new JSeparator();
		separator_Email1.setForeground(Color.WHITE);
		separator_Email1.setBounds(128, 142, 348, 12);
		contentPanel.add(separator_Email1);
		
		textField_Email = new JTextField();
		textField_Email.setText("");
		textField_Email.setSelectionColor(Color.LIGHT_GRAY);
		textField_Email.setForeground(Color.BLACK);
		textField_Email.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Email.setDisabledTextColor(Color.BLACK);
		textField_Email.setColumns(10);
		textField_Email.setBorder(null);
		textField_Email.setBackground(new Color(255, 165, 0));
		textField_Email.setBounds(149, 122, 327, 22);
		contentPanel.add(textField_Email);
		
		JLabel Label_NumTelefonico = new JLabel("Numero Telefonico");
		Label_NumTelefonico.setForeground(Color.WHITE);
		Label_NumTelefonico.setBounds(7, 152, 120, 21);
		contentPanel.add(Label_NumTelefonico);
		
		JLabel lblIconaNumTelefonico = new JLabel("");
		lblIconaNumTelefonico.setBounds(128, 153, 21, 20);
		lblIconaNumTelefonico.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./cellulare.png")), 20, 20));
		contentPanel.add(lblIconaNumTelefonico);
		
		JSeparator separator_NumeroTelefonico = new JSeparator();
		separator_NumeroTelefonico.setForeground(Color.WHITE);
		separator_NumeroTelefonico.setBounds(128, 173, 348, 12);
		contentPanel.add(separator_NumeroTelefonico);
		
		textField_NumTelefonico = new JTextField();
		textField_NumTelefonico.setText("");
		textField_NumTelefonico.setSelectionColor(Color.LIGHT_GRAY);
		textField_NumTelefonico.setForeground(Color.BLACK);
		textField_NumTelefonico.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_NumTelefonico.setDisabledTextColor(Color.BLACK);
		textField_NumTelefonico.setColumns(10);
		textField_NumTelefonico.setBorder(null);
		textField_NumTelefonico.setBackground(new Color(255, 165, 0));
		textField_NumTelefonico.setBounds(158, 160, 318, 21);
		contentPanel.add(textField_NumTelefonico);
		
		JLabel Label_DataNascita = new JLabel("Data Nascita");
		Label_DataNascita.setForeground(Color.WHITE);
		Label_DataNascita.setBounds(42, 185, 85, 29);
		contentPanel.add(Label_DataNascita);
		
		JSeparator separator_DataNascita1 = new JSeparator();
		separator_DataNascita1.setForeground(Color.WHITE);
		separator_DataNascita1.setBounds(128, 203, 348, 12);
		contentPanel.add(separator_DataNascita1);
		
		JLabel lblIconaDataNascita = new JLabel("");
		lblIconaDataNascita.setBounds(128, 185, 21, 20);
		lblIconaDataNascita.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./compleanno.png")), 20, 20));
		contentPanel.add(lblIconaDataNascita);
		
		textField_DataNascita = new JTextField();
		textField_DataNascita.setText("");
		textField_DataNascita.setSelectionColor(Color.LIGHT_GRAY);
		textField_DataNascita.setForeground(Color.BLACK);
		textField_DataNascita.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_DataNascita.setDisabledTextColor(Color.BLACK);
		textField_DataNascita.setColumns(10);
		textField_DataNascita.setBorder(null);
		textField_DataNascita.setBackground(new Color(255, 165, 0));
		textField_DataNascita.setBounds(158, 185, 318, 21);
		contentPanel.add(textField_DataNascita);
		
		JLabel lblPasswordAttuale = new JLabel("Password attuale");
		lblPasswordAttuale.setForeground(Color.WHITE);
		lblPasswordAttuale.setBounds(18, 218, 109, 29);
		contentPanel.add(lblPasswordAttuale);
		
		JLabel lblIconaPasswordAttuale = new JLabel("");
		lblIconaPasswordAttuale.setBounds(128, 218, 21, 20);
		lblIconaPasswordAttuale.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./Password.png")), 20, 20));
		contentPanel.add(lblIconaPasswordAttuale);
		
		JSeparator separator_PasswordAttuale = new JSeparator();
		separator_PasswordAttuale.setForeground(Color.WHITE);
		separator_PasswordAttuale.setBounds(128, 235, 348, 12);
		contentPanel.add(separator_PasswordAttuale);

		textField_PasswordAttuale = new JTextField();
		textField_PasswordAttuale.setText("");
		textField_PasswordAttuale.setSelectionColor(Color.LIGHT_GRAY);
		textField_PasswordAttuale.setForeground(Color.BLACK);
		textField_PasswordAttuale.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_PasswordAttuale.setDisabledTextColor(Color.BLACK);
		textField_PasswordAttuale.setColumns(10);
		textField_PasswordAttuale.setBorder(null);
		textField_PasswordAttuale.setBackground(new Color(255, 165, 0));
		textField_PasswordAttuale.setBounds(158, 218, 329, 17);
		contentPanel.add(textField_PasswordAttuale);
		
		JLabel Label_NuovaPassword = new JLabel("Nuova password");
		Label_NuovaPassword.setForeground(Color.WHITE);
		Label_NuovaPassword.setBounds(18, 254, 109, 29);
		contentPanel.add(Label_NuovaPassword);
		
		JLabel lblIconaNuovaPassword = new JLabel("");
		lblIconaNuovaPassword.setBounds(128, 250, 21, 20);
		lblIconaNuovaPassword.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./Password.png")), 20, 20));
        contentPanel.add(lblIconaNuovaPassword);
		
		JSeparator separator_NuovaPassword = new JSeparator();
		separator_NuovaPassword.setForeground(Color.WHITE);
		separator_NuovaPassword.setBounds(128, 271, 348, 12);
		contentPanel.add(separator_NuovaPassword);
		
		textField_NuovaPassword = new JTextField();
		textField_NuovaPassword.setText("");
		textField_NuovaPassword.setSelectionColor(Color.LIGHT_GRAY);
		textField_NuovaPassword.setForeground(Color.BLACK);
		textField_NuovaPassword.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_NuovaPassword.setDisabledTextColor(Color.BLACK);
		textField_NuovaPassword.setColumns(10);
		textField_NuovaPassword.setBorder(null);
		textField_NuovaPassword.setBackground(new Color(255, 165, 0));
		textField_NuovaPassword.setBounds(158, 256, 318, 17);
		contentPanel.add(textField_NuovaPassword);
		
		JLabel Label_Provincia = new JLabel("Provincia");
		Label_Provincia.setForeground(Color.WHITE);
		Label_Provincia.setBounds(66, 303, 61, 16);
		contentPanel.add(Label_Provincia);
		
		JLabel lblIconaProvincia = new JLabel("");
		lblIconaProvincia.setBounds(128, 295, 21, 20);
		lblIconaProvincia.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./strada.png")), 25, 25));
		contentPanel.add(lblIconaProvincia);
		
		JSeparator separator_Provincia = new JSeparator();
		separator_Provincia.setForeground(Color.WHITE);
		separator_Provincia.setBounds(128, 311, 348, 12);
		contentPanel.add(separator_Provincia);
		
		textField_Provincia = new JTextField();
		textField_Provincia.setText("");
		textField_Provincia.setSelectionColor(Color.LIGHT_GRAY);
		textField_Provincia.setForeground(Color.BLACK);
		textField_Provincia.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Provincia.setDisabledTextColor(Color.BLACK);
		textField_Provincia.setColumns(10);
		textField_Provincia.setBorder(null);
		textField_Provincia.setBackground(new Color(255, 165, 0));
		textField_Provincia.setBounds(158, 295, 318, 21);
		contentPanel.add(textField_Provincia);
		
		JLabel Label_Citta = new JLabel("Città");
		Label_Citta.setForeground(Color.WHITE);
		Label_Citta.setBounds(93, 331, 34, 32);
		contentPanel.add(Label_Citta);
		
		JLabel lblIconaCittà = new JLabel("");
		lblIconaCittà.setBounds(128, 335, 21, 20);
		lblIconaCittà.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./strada.png")), 25, 25));
		contentPanel.add(lblIconaCittà);
		
		JSeparator separator_Città = new JSeparator();
		separator_Città.setForeground(Color.WHITE);
		separator_Città.setBounds(128, 351, 146, 12);
		contentPanel.add(separator_Città);
		
		textField_Città = new JTextField();
		textField_Città.setText("");
		textField_Città.setSelectionColor(Color.LIGHT_GRAY);
		textField_Città.setForeground(Color.BLACK);
		textField_Città.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Città.setDisabledTextColor(Color.BLACK);
		textField_Città.setColumns(10);
		textField_Città.setBorder(null);
		textField_Città.setBackground(new Color(255, 165, 0));
		textField_Città.setBounds(157, 335, 117, 16);
		contentPanel.add(textField_Città);
		
		JLabel Label_CAP = new JLabel("CAP");
		Label_CAP.setForeground(Color.WHITE);
		Label_CAP.setBounds(332, 339, 39, 16);
		contentPanel.add(Label_CAP);
		
		JLabel lblIconaCap = new JLabel("");
		lblIconaCap.setBounds(377, 335, 21, 20);
		lblIconaCap.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./strada.png")), 25, 25));
		contentPanel.add(lblIconaCap);		
		
		JSeparator separator_Cap = new JSeparator();
		separator_Cap.setForeground(Color.WHITE);
		separator_Cap.setBounds(377, 351, 99, 12);
		contentPanel.add(separator_Cap);
		
		textField_CAP = new JTextField();
		textField_CAP.setText("");
		textField_CAP.setSelectionColor(Color.LIGHT_GRAY);
		textField_CAP.setForeground(Color.BLACK);
		textField_CAP.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_CAP.setDisabledTextColor(Color.BLACK);
		textField_CAP.setColumns(10);
		textField_CAP.setBorder(null);
		textField_CAP.setBackground(new Color(255, 165, 0));
		textField_CAP.setBounds(398, 339, 78, 16);
		contentPanel.add(textField_CAP);
		
		JLabel lblVia = new JLabel("Via");
		lblVia.setForeground(Color.WHITE);
		lblVia.setBounds(82, 375, 34, 21);
		contentPanel.add(lblVia);
		
		JLabel lblIconaVia = new JLabel("");
		lblIconaVia.setBounds(128, 375, 21, 20);
		lblIconaVia.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./strada.png")), 25, 25));
		contentPanel.add(lblIconaVia);
		
		JSeparator separator_Via = new JSeparator();
		separator_Via.setForeground(Color.WHITE);
		separator_Via.setBounds(128, 395, 146, 12);
		contentPanel.add(separator_Via);
		
		textField_Via = new JTextField();
		textField_Via.setText("");
		textField_Via.setSelectionColor(Color.LIGHT_GRAY);
		textField_Via.setForeground(Color.BLACK);
		textField_Via.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Via.setDisabledTextColor(Color.BLACK);
		textField_Via.setColumns(10);
		textField_Via.setBorder(null);
		textField_Via.setBackground(new Color(255, 165, 0));
		textField_Via.setBounds(152, 375, 120, 21);
		contentPanel.add(textField_Via);
		
		JLabel Label_NumCivico = new JLabel("N° Civico");
		Label_NumCivico.setForeground(Color.WHITE);
		Label_NumCivico.setBounds(311, 383, 61, 16);
		contentPanel.add(Label_NumCivico);
		
		JLabel lblIconaN_Civico = new JLabel("");
		lblIconaN_Civico.setBounds(377, 379, 21, 20);
		lblIconaN_Civico.setIcon(ctrl.scaleImageIcon(new ImageIcon(ModificaProfilo.class.getResource("/ModificaProfilo./strada.png")), 25, 25));
		contentPanel.add(lblIconaN_Civico);
		
		JSeparator separator_N_Civico = new JSeparator();
		separator_N_Civico.setForeground(Color.WHITE);
		separator_N_Civico.setBounds(377, 395, 99, 12);
		contentPanel.add(separator_N_Civico);

		textField_N_Civico = new JTextField();
		textField_N_Civico.setText("");
		textField_N_Civico.setSelectionColor(Color.LIGHT_GRAY);
		textField_N_Civico.setForeground(Color.BLACK);
		textField_N_Civico.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_N_Civico.setDisabledTextColor(Color.BLACK);
		textField_N_Civico.setColumns(10);
		textField_N_Civico.setBorder(null);
		textField_N_Civico.setBackground(new Color(255, 165, 0));
		textField_N_Civico.setBounds(398, 383, 78, 16);
		contentPanel.add(textField_N_Civico);
		
		JButton btnApplicaModifiche = new JButton("Applica Modifiche");
		btnApplicaModifiche.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApplicaModifiche.setBounds(195, 419, 187, 29);
		btnApplicaModifiche.setForeground(new  Color(255, 165, 0));
		contentPanel.add(btnApplicaModifiche);
		btnApplicaModifiche.addActionListener(this);
		btnApplicaModifiche.setActionCommand(ApplicaModifiche_cmd);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(ApplicaModifiche_cmd))
        	{
				ctrl.visualizzazioneMenu();
			}		
	}
}
