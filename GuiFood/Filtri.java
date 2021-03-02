package GuiFood;


import javax.swing.JDialog;


import Classi.Controller;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Cursor;

public class Filtri extends JDialog implements ActionListener {

	
	private static final long serialVersionUID = 1L;
    Controller ctrl;
	private String Applica_cmd = "Applica";


	public Filtri(Controller ctrl, String cibo) {
	    setResizable(false);
		setTitle("Filtri");
		getContentPane().setBackground(new Color(255, 165, 0));
		getContentPane().setLayout(null);
		this.ctrl=ctrl;
			
		JLabel lblFasciaDiPrezzo = new JLabel("Fascia di prezzo");
		lblFasciaDiPrezzo.setForeground(Color.WHITE);
		lblFasciaDiPrezzo.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblFasciaDiPrezzo.setBounds(6, 6, 213, 39);
		getContentPane().add(lblFasciaDiPrezzo);
		
		JSeparator separator_FasciaPrezzo = new JSeparator();
		separator_FasciaPrezzo.setForeground(Color.WHITE);
		separator_FasciaPrezzo.setBounds(6, 33, 191, 12);
		getContentPane().add(separator_FasciaPrezzo);
	
		JCheckBox chckb_0_5_euro = new JCheckBox("0-5 €");
		chckb_0_5_euro.setForeground(new Color(255, 255, 255));
		chckb_0_5_euro.setBounds(6, 47, 128, 23);
		getContentPane().add(chckb_0_5_euro);
		
		JCheckBox chckb_5_10_euro = new JCheckBox("5-10 €");
		chckb_5_10_euro.setForeground(new Color(255, 255, 255));
		chckb_5_10_euro.setBounds(6, 82, 128, 23);
		getContentPane().add(chckb_5_10_euro);
		
		JCheckBox chckb_10_20_euro = new JCheckBox("10-20€");
		chckb_10_20_euro.setForeground(new Color(255, 255, 255));
		chckb_10_20_euro.setBounds(147, 47, 128, 23);
		getContentPane().add(chckb_10_20_euro);
		
		JCheckBox chckb_20_50_euro = new JCheckBox("20-50 €");
		chckb_20_50_euro.setForeground(new Color(255, 255, 255));
		chckb_20_50_euro.setBounds(146, 82, 128, 23);
		getContentPane().add(chckb_20_50_euro);
		
		JCheckBox chckb_piu_50_euro = new JCheckBox("Più di 50 €");
		chckb_piu_50_euro.setForeground(new Color(255, 255, 255));
		chckb_piu_50_euro.setBounds(287, 47, 128, 23);
		getContentPane().add(chckb_piu_50_euro);
		
		
		JLabel Label_Cucina = new JLabel("Cucina");
		Label_Cucina.setForeground(Color.WHITE);
		Label_Cucina.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		Label_Cucina.setBounds(6, 117, 102, 39);
		getContentPane().add(Label_Cucina);
	
		JSeparator separator_Cucina = new JSeparator();
		separator_Cucina.setForeground(Color.WHITE);
		separator_Cucina.setBounds(6, 144, 85, 12);
		getContentPane().add(separator_Cucina);
		
		JCheckBox chckbxAmericana = new JCheckBox("Americana");
		chckbxAmericana.setForeground(Color.WHITE);
		chckbxAmericana.setBounds(6, 168, 128, 23);
		getContentPane().add(chckbxAmericana);
		
		JCheckBox chckbxCinese = new JCheckBox("Cinese");
		chckbxCinese.setForeground(Color.WHITE);
		chckbxCinese.setBounds(6, 201, 128, 23);
		getContentPane().add(chckbxCinese);
		
		JCheckBox chckbxInternazionale = new JCheckBox("Internazionale");
		chckbxInternazionale.setForeground(Color.WHITE);
		chckbxInternazionale.setBounds(108, 168, 128, 23);
		getContentPane().add(chckbxInternazionale);
		
		JCheckBox chckbxFastFood = new JCheckBox("Fast Food");
		chckbxFastFood.setForeground(Color.WHITE);
		chckbxFastFood.setBounds(108, 201, 128, 23);
		getContentPane().add(chckbxFastFood);
		
		JCheckBox chckbxGiapponese = new JCheckBox("Giapponese");
		chckbxGiapponese.setForeground(Color.WHITE);
		chckbxGiapponese.setBounds(237, 168, 128, 23);
		getContentPane().add(chckbxGiapponese);
		
		JCheckBox chckbxGreca = new JCheckBox("Greca");
		chckbxGreca.setForeground(Color.WHITE);
		chckbxGreca.setBounds(237, 201, 128, 23);
		getContentPane().add(chckbxGreca);
		
		JCheckBox chckbxVegetariana = new JCheckBox("Vegetariana");
		chckbxVegetariana.setForeground(Color.WHITE);
		chckbxVegetariana.setBounds(364, 201, 128, 23);
		getContentPane().add(chckbxVegetariana);
		
		JCheckBox chckbxPizza = new JCheckBox("Pizza");
		chckbxPizza.setForeground(Color.WHITE);
		chckbxPizza.setBounds(364, 168, 128, 23);
		getContentPane().add(chckbxPizza);
		
		JCheckBox chckbxSushi = new JCheckBox("Sushi");
		chckbxSushi.setForeground(Color.WHITE);
		chckbxSushi.setBounds(6, 236, 128, 23);
		getContentPane().add(chckbxSushi);
		
		JCheckBox chckbxItaliana = new JCheckBox("Italiana");
		chckbxItaliana.setForeground(Color.WHITE);
		chckbxItaliana.setBounds(108, 236, 128, 23);
		getContentPane().add(chckbxItaliana);
		
		JCheckBox chckbxThai = new JCheckBox("thai");
		chckbxThai.setForeground(Color.WHITE);
		chckbxThai.setBounds(237, 236, 128, 23);
		getContentPane().add(chckbxThai);
		
		JCheckBox chckbxColazione = new JCheckBox("colazione");
		chckbxColazione.setForeground(Color.WHITE);
		chckbxColazione.setBounds(364, 236, 128, 23);
		getContentPane().add(chckbxColazione);
		
		
		JLabel Label_Categoria = new JLabel("Categoria");
		Label_Categoria.setForeground(Color.WHITE);
		Label_Categoria.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		Label_Categoria.setBounds(6, 271, 141, 39);
		getContentPane().add(Label_Categoria);
		
		JSeparator separator_Categoria = new JSeparator();
		separator_Categoria.setForeground(Color.WHITE);
		separator_Categoria.setBounds(6, 302, 138, 12);
		getContentPane().add(separator_Categoria);
		
		
		JCheckBox chckbxRistoranti = new JCheckBox("Ristoranti");
		chckbxRistoranti.setForeground(Color.WHITE);
		chckbxRistoranti.setBounds(6, 322, 102, 23);
		getContentPane().add(chckbxRistoranti);
		
		
		JCheckBox chckbxPasticceria = new JCheckBox("Pasticceria");
		chckbxPasticceria.setForeground(Color.WHITE);
		chckbxPasticceria.setBounds(108, 322, 113, 23);
		getContentPane().add(chckbxPasticceria);
		
		JCheckBox chckbxGelateria = new JCheckBox("Gelateria");
		chckbxGelateria.setForeground(Color.WHITE);
		chckbxGelateria.setBounds(237, 322, 102, 23);
		getContentPane().add(chckbxGelateria);
		
		JCheckBox chckbxPub = new JCheckBox("Pub");
		chckbxPub.setForeground(Color.WHITE);
		chckbxPub.setBounds(6, 357, 102, 23);
		getContentPane().add(chckbxPub);
		
		JCheckBox chckbxGastronomia = new JCheckBox("Gastronomia");
		chckbxGastronomia.setForeground(Color.WHITE);
		chckbxGastronomia.setBounds(108, 357, 113, 23);
		getContentPane().add(chckbxGastronomia);
		
		JCheckBox chckbxBar = new JCheckBox("Bar");
		chckbxBar.setForeground(Color.WHITE);
		chckbxBar.setBounds(359, 322, 67, 23);
		getContentPane().add(chckbxBar);
		
		JCheckBox chckbxPizzeria = new JCheckBox("Pizzeria");
		chckbxPizzeria.setForeground(Color.WHITE);
		chckbxPizzeria.setBounds(237, 357, 113, 23);
		getContentPane().add(chckbxPizzeria);
		
		
		JLabel Label_MezziDiTrasporto = new JLabel("Mezzi di trasporto");
		Label_MezziDiTrasporto.setForeground(Color.WHITE);
		Label_MezziDiTrasporto.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		Label_MezziDiTrasporto.setBounds(6, 391, 250, 39);
		getContentPane().add(Label_MezziDiTrasporto);
		
		JSeparator separator_MezziDiTrasporto = new JSeparator();
		separator_MezziDiTrasporto.setForeground(Color.WHITE);
		separator_MezziDiTrasporto.setBounds(6, 418, 236, 12);
		getContentPane().add(separator_MezziDiTrasporto);
		
		JCheckBox chckbxMoto = new JCheckBox("Moto");
		chckbxMoto.setForeground(Color.WHITE);
		chckbxMoto.setBounds(6, 442, 102, 23);
		getContentPane().add(chckbxMoto);
		
		JCheckBox chckbxBicicletta = new JCheckBox("Bicicletta");
		chckbxBicicletta.setForeground(Color.WHITE);
		chckbxBicicletta.setBounds(120, 442, 113, 23);
		getContentPane().add(chckbxBicicletta);	
		
		JButton btnApplica = new JButton("Applica");
		btnApplica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnApplica.setForeground(Color.WHITE);
		btnApplica.setBounds(352, 441, 117, 29);
		getContentPane().add(btnApplica);
		btnApplica.addActionListener(this);
		btnApplica.setActionCommand(Applica_cmd);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
