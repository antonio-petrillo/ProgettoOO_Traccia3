package GuiFood;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Classi.Controller;
import Classi.Utente;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Password_Dimenticata extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txt_Email;
	Controller ctrl;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField;


	public Password_Dimenticata(Controller ctrl) {
		setResizable(false);
		setBounds(100, 100, 549, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.ctrl = ctrl;

		{
			JLabel Label_DimenticaPwd = new JLabel("Hai dimenticato la Password?");
			Label_DimenticaPwd.setFont(new Font("Lucida Grande", Font.BOLD, 23));
			Label_DimenticaPwd.setForeground(new Color(255, 255, 255));
			Label_DimenticaPwd.setBounds(6, 6, 391, 20);
			contentPanel.add(Label_DimenticaPwd);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setBackground(new Color(0, 0, 0));
			separator.setBounds(0, 26, 559, 12);
			contentPanel.add(separator);
		}
		{
			JLabel Label_Email = new JLabel("E-mail");
			Label_Email.setForeground(Color.WHITE);
			Label_Email.setBounds(73, 109, 55, 16);
			contentPanel.add(Label_Email);
		}
		{
			txt_Email = new JTextField();
			txt_Email.setText("");
			txt_Email.setSelectionColor(Color.LIGHT_GRAY);
			txt_Email.setForeground(Color.BLACK);
			txt_Email.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			txt_Email.setDisabledTextColor(Color.BLACK);
			txt_Email.setColumns(10);
			txt_Email.setBorder(null);
			txt_Email.setBackground(new Color(255, 165, 0));
			txt_Email.setBounds(140, 109, 333, 16);
			contentPanel.add(txt_Email);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setForeground(Color.WHITE);
			separator.setBounds(138, 121, 335, 12);
			contentPanel.add(separator);
		}
		
		JTextField textField_Password = new JTextField();
		textField_Password.setText("");
		textField_Password.setSelectionColor(Color.LIGHT_GRAY);
		textField_Password.setForeground(Color.BLACK);
		textField_Password.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		textField_Password.setDisabledTextColor(Color.BLACK);
		textField_Password.setColumns(10);
		textField_Password.setBorder(null);
		textField_Password.setBackground(new Color(255, 165, 0));
		textField_Password.setBounds(140, 156, 333, 16);
		contentPanel.add(textField_Password);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 165, 0));
		passwordField.setBorder(null);
		passwordField.setBounds(140, 146, 324, 25);
		contentPanel.add(passwordField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 165, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			
			{
				JButton ResetButton = new JButton("Reset");
				ResetButton.setForeground(new  Color(255, 165, 0));
				ResetButton.setActionCommand("Reset");
                buttonPane.add(ResetButton);
                ResetButton.addActionListener(this);

								
			}
		}
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean check_nome = ctrl.controllaCaratteriNonAmmessi(txt_Email.getText());
			if(check_nome)
				ctrl.resetPassword(new Utente(txt_Email.getText()),passwordField_1.getPassword());
			else
				ctrl.VisualizzazioneAvvisi("ERRORE : il campo nome contiene uno dei seguenti caratteri : [* , / -] . Ometterli.");
		}
   }



