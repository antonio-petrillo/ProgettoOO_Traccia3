package Classi;


import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;

import Dao.*;
import GuiFood.*;

public class Controller {
	
	private Login login;
	private Login loginApp;
    private Registrazioni registrazione;
	private Password_Dimenticata passwordDimenticata;
	private VisualizzazioneAvvisi dialogErrore;
	private ModificaProfilo modificaProfilo;
	private Filtri filtri;
	private Riders sceltaRider;
	private Fattura fattura;
    private Menu menu;
    private Utente utente;

    private ArrayList<Ristorante> ristoranti;
    private ArrayList<Prodotto> prodotti;
    private ArrayList<Rider> riders;
    
	public Controller() {
		login = new Login(this);
		login.setVisible(true);
		login.setLocationRelativeTo(null);
	   
	}

	 public void visualizzazioneLogin() {
		 loginApp = new Login(this);
		 loginApp.setVisible(true);
		 loginApp.setLocationRelativeTo(login);
	   }
	 
	 public void visualizzazioneRegistrazione() {
		    registrazione = new Registrazioni(this);
		    registrazione.setVisible(true);
		    registrazione.setLocationRelativeTo(login);
	 }
   
	 public void visualizzazioneMenu() {
   	 if(menu==null)
   		{
   			menu = new Menu(this);
   			menu.setLocationRelativeTo(null);
   			login.dispose();
   			login.setVisible(false);
   		}
    	menu.setVisible(true);	
    }
	  
    public void VisualizzazioneAvvisi(String stringErroreCommesso) 
    {
    	dialogErrore = new VisualizzazioneAvvisi(this,stringErroreCommesso);
    	dialogErrore.setVisible(true);
    	dialogErrore.setBounds(0, 0,360, 150);
		dialogErrore.setLocationRelativeTo(menu);
    }

	public void visualizzazionePwdDimenticata() {
		passwordDimenticata = new Password_Dimenticata(this);
		passwordDimenticata.setVisible(true);
		passwordDimenticata.setLocationRelativeTo(login);

	}
	
	public void visualizzazioneSceltaRider() {
		sceltaRider = new Riders(this);
		sceltaRider.setVisible(true);
		sceltaRider.setLocationRelativeTo(fattura);
	}
	
	public void visualizzazioneFattura() {
		fattura = new Fattura(this);
		fattura.setVisible(true);
		fattura.setLocationRelativeTo(menu);
	}
	
	public void Filtri(String cibo)
	{
		filtri=new Filtri(this, cibo);
		filtri.setVisible(true);;
		filtri.setLocationRelativeTo(menu);
	}
	
	public void ModificaProfilo() 
	    {
		 modificaProfilo = new ModificaProfilo(this);
		 modificaProfilo.setVisible(true);
		 modificaProfilo.setLocationRelativeTo(menu);
	    }
	
	public boolean controllaCaratteriNonAmmessi(String nome)
	{
		char[] tmp = nome.toCharArray();
		for(char c: tmp)
		{
			if(c == '*' || c == '/' || c == '-' || c == ',')
			{
				return false;
			}
		}
		return true;
	}
	
	  public ImageIcon scaleImageIcon(ImageIcon image, int width, int height) {
			Image tmp = image.getImage();
			Image scaledImage = tmp.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
			ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
			return scaledImageIcon;
		}
	  /////////////////////////////
	  
	  public boolean effettuaRegistrazione(String nome, String cognome, String email, String password,  String numeroTelefono, 
				// TODO : aggiungere le chiamate a visualizza errore
				String nomeVia, int numeroCivico, String cap, String citta, String provincia) {
			DaoUtente daoUtente = new DaoUtenteDatabase();
			DaoIndirizzo daoIndirizzo = new DaoIndirizzoDatabase();
			boolean insertSucced = false;
			int codiceIndirizzo = -1;
			try {
				if(! daoUtente.esisteUtente(email)) {
					if(! daoIndirizzo.esisteIndirizzo(nomeVia, numeroCivico, cap, citta, provincia)) {
						daoIndirizzo.inserisciNuovoIndirizzo(nomeVia, numeroCivico, cap, citta, provincia);
					}
					codiceIndirizzo = daoIndirizzo.ottieniCodiceIndirizzo(nomeVia, numeroCivico, cap, citta, provincia);
					daoUtente.inserisciNuovoUtente(nome, cognome, email, password, numeroTelefono, codiceIndirizzo);
					insertSucced = true;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return insertSucced;
		} 
	  
	  public boolean costruisciDominio() {
		 return false; 
	  }
	  

}