package GuiFood;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Classi.Controller;

public class Riders extends JDialog{
	private static final long serialVersionUID = 1L;
	
	private Controller ctrl;

	public Riders(Controller ctrl) {
	  {	
		setResizable(false);
		setTitle("Scelta Riders");
		getContentPane().setBackground(new Color(255, 165, 0));
		setBounds(100, 100, 334, 492);
		getContentPane().setLayout(null);
		this.ctrl=ctrl;
	
		JPanel panel1 = new JPanel();
		panel1.setBorder(null);
		panel1.setBackground(new Color(255, 153, 51));
		panel1.setBounds(6, 6, 322, 113);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblIconaRiders1 = new JLabel("");
		lblIconaRiders1.setIcon(new ImageIcon(Riders.class.getResource("/Riders./riders0.png")));
		lblIconaRiders1.setBounds(6, 6, 96, 101);
		panel1.add(lblIconaRiders1);
		
		JLabel lblNome_Cognome1 = new JLabel("Maria Rossi");
		lblNome_Cognome1.setBounds(136, 16, 96, 16);
		panel1.add(lblNome_Cognome1);
		
		JLabel lblBiografia1 = new JLabel("Biografia");
		lblBiografia1.setBounds(136, 34, 193, 49);
		panel1.add(lblBiografia1);
	
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(255, 153, 51));
		panel_2.setBounds(6, 123, 322, 113);
		getContentPane().add(panel_2);
		
		JLabel lblIconaRiders2 = new JLabel("");
		lblIconaRiders2.setIcon(new ImageIcon(Riders.class.getResource("/Riders./riders3.png")));
		lblIconaRiders2.setBounds(6, 6, 96, 101);
		panel_2.add(lblIconaRiders2);
		
		JLabel lblNome_Cognome2 = new JLabel("Sara Verdi");
		lblNome_Cognome2.setBounds(136, 16, 96, 16);
		panel_2.add(lblNome_Cognome2);
		
		JLabel lblBiografia2 = new JLabel("Biografia");
		lblBiografia2.setBounds(136, 42, 193, 49);
		panel_2.add(lblBiografia2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(255, 153, 51));
		panel_3.setBounds(6, 241, 322, 120);
		getContentPane().add(panel_3);
		
		JLabel lblIconaRiders3 = new JLabel("");
		lblIconaRiders3.setIcon(new ImageIcon(Riders.class.getResource("/Riders./riders4.png")));
		lblIconaRiders3.setBounds(18, 6, 79, 101);
		panel_3.add(lblIconaRiders3);
		
		JLabel lblNome_Cognome3 = new JLabel("Marco Car");
		lblNome_Cognome3.setBounds(136, 16, 79, 16);
		panel_3.add(lblNome_Cognome3);
		
		JLabel lblBiografia3 = new JLabel("Biografia");
		lblBiografia3.setBounds(136, 44, 193, 49);
		panel_3.add(lblBiografia3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(255, 153, 51));
		panel_4.setBounds(6, 366, 322, 98);
		getContentPane().add(panel_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(6, 6, 0, 101);
		panel_4.add(lblNewLabel_3_1_1);
		
		JLabel lblNome_Cognome4 = new JLabel("Marco Car");
		lblNome_Cognome4.setBounds(136, 23, 79, 16);
		panel_4.add(lblNome_Cognome4);
		
		JLabel lblBiografia4 = new JLabel("Biografia");
		lblBiografia4.setBounds(136, 44, 193, 49);
		panel_4.add(lblBiografia4);
		
		JLabel lblIconaRiders4 = new JLabel("");
		lblIconaRiders4.setIcon(new ImageIcon(Riders.class.getResource("/Riders./riders0.png")));
		lblIconaRiders4.setBounds(6, 6, 96, 101);
		panel_4.add(lblIconaRiders4);

	   }
	}
}
