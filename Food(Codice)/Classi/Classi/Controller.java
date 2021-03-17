package Classi;


import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Dao.*;
import GuiFood.*;

public class Controller {
	
	private Login login;
	private Login loginApp;
    private Registrazioni registrazione;
	private Password_Dimenticata passwordDimenticata;
	private VisualizzazioneAvvisi dialogErrore;
	private ModificaProfilo modificaProfilo;
	private Riders sceltaRider;
	private Fattura fattura;
    private Menu menu;
    private SceltaRistorante sceltaRistorante;

    private Utente utenteLoggato;
    private Ristorante ristorante;
    private Rider rider;
    private Carrello carrello;
    
    // TODO : aggiungi i vari '.dispose()'
	public Controller() {
		login = new Login(this);
		login.setVisible(true);
		login.setLocationRelativeTo(null);
	   
	}

	 public void visualizzazioneLogin() {
		 if(loginApp == null) {
			 loginApp = new Login(this);
		 }
		 loginApp.setVisible(true);
		 loginApp.setLocationRelativeTo(login);
	   }
	 
	 public void visualizzazioneRegistrazione() {
		    registrazione = new Registrazioni(this);
		    registrazione.setVisible(true);
		    registrazione.setLocationRelativeTo(login);
	 }
   
	 public void visualizzazioneMenu() {
   		menu = new Menu(this);
   		menu.setLocationRelativeTo(null);
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
	
	public void VisualizzaSceltaRistorante() {
	    sceltaRistorante = new SceltaRistorante(this);
	    sceltaRistorante.setVisible(true);
	    sceltaRistorante.setLocationRelativeTo(menu);
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
	  
	  public boolean effettuaRegistrazione(String nome, String cognome, String email, String password,  String numeroTelefono, 
				String nomeVia, int numeroCivico, String cap, String citta, String provincia) {
			DaoUtente daoUtente = new DaoUtenteDatabase();
			DaoIndirizzo daoIndirizzo = new DaoIndirizzoDatabase();
			boolean insertSucced = false;
			int codiceIndirizzo = -1;
			if(! daoUtente.esisteUtente(email)) {
				if(! daoIndirizzo.esisteIndirizzo(nomeVia, numeroCivico, cap, citta, provincia)) {
					daoIndirizzo.inserisciNuovoIndirizzo(nomeVia, numeroCivico, cap, citta, provincia);
				}
				codiceIndirizzo = daoIndirizzo.ottieniCodiceIndirizzo(nomeVia, numeroCivico, cap, citta, provincia);
				if (codiceIndirizzo != -1) {
					insertSucced = daoUtente.inserisciNuovoUtente(nome, cognome, email, password, numeroTelefono, codiceIndirizzo);
				}
			}
			return insertSucced;
		} 
	  
	  public boolean effettuaAccesso(String email, String password) {
		  boolean loginSucced = false;
		  DaoUtente daoUtente = new DaoUtenteDatabase();
		  if(daoUtente.concediAccesso(email, password)) {
			  this.utenteLoggato = daoUtente.effettuaAccesso(email, password);
			  if(this.utenteLoggato == null) {
				  this.VisualizzazioneAvvisi("Impossibile accedere, problema interno");
			  }
			  loginSucced = true;
		  }else {
			  this.VisualizzazioneAvvisi("Credenziali errate");
			  this.visualizzazioneLogin();
		  }
		  return loginSucced;
	  }
	  
	 public void cambiaPassword(String email, String nuovaPassword) {
		new DaoUtenteDatabase().cambiaPassword(email, nuovaPassword); 
	 }
	 
	public boolean isLoggato() {
		return this.utenteLoggato != null;
	}

	public String getEmail() {
		return this.utenteLoggato.getEmail();
	}

	public Ristorante[] ottieniRistoranti() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Prodotto> ottieniProdotti() {
		// TODO Auto-generated method stub
		return null;
	}

}