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
				this.VisualizzazioneAvvisi("Impossibile registrarsi al momento, problema interno");
				e.printStackTrace();
			}
			return insertSucced;
		} 
	  
	  public void effettuaAccesso(String email, String password) {
		  DaoUtente daoUtente = new DaoUtenteDatabase();
		  if(daoUtente.concediAccesso(email, password)) {
			  try {
				  this.utenteLoggato = daoUtente.effettuaAccesso(email, password);
				  DaoRistorante daoRistoranti = new DaoRistoranteDatabase();
				  Ristorante[] ristoranti = daoRistoranti.ottieniRistoranti();
				  int length = ristoranti.length;
				  String [] nomeRistoranti = new String[length];
				  for (int i = 0; i<length; i++) {
					 nomeRistoranti[i] = ristoranti[i].getNome(); 
				  }
				  //

				  
				  // collega scelta ristoranti
				  this.ristorante = null;
				  this.VisualizzaSceltaRistorante();
			  }catch(SQLException | ClassNotFoundException e) {
				 this.VisualizzazioneAvvisi("Impossibile connettersi, problema interno"); 
				 this.visualizzazioneLogin();
			  }
		  }else {
			  this.VisualizzazioneAvvisi("Credenziali errate");
			  this.visualizzazioneLogin();
		  }
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

	public ArrayList<Prodotto> ottieniProdotti(){
		ArrayList<Prodotto> ret = new ArrayList<Prodotto>();
		HashMap<Prodotto, Integer> map = (HashMap<Prodotto, Integer>) this.ristorante.getQuantitaProdotto().clone();
		for(Prodotto p : map.keySet()) {
			ret.add(p);
		}
		return ret;
	}
	
	public ArrayList<Prodotto> ottieniProdottiFiltro(String categoria) {
		ArrayList<Prodotto> ret = new ArrayList<Prodotto>();
		HashMap<Prodotto, Integer> map = (HashMap<Prodotto, Integer>) this.ristorante.getQuantitaProdotto().clone();
		for(Prodotto p : map.keySet()) {
			if(p.getDescrizione().equals(categoria)) {
				ret.add(p);
			}
		}
		return ret;
	}
	
	public ArrayList<Prodotto> filtraPrezzo(ArrayList<Prodotto> prodotti, String fasciaDiPrezzo){
		double min = -1;
		double max = Double.MAX_VALUE;
		if(!fasciaDiPrezzo.equals("qualunque")) {
			if(fasciaDiPrezzo.equals("0-5 €")) {
				min = 0;
				max = 5;
			}else if(fasciaDiPrezzo.equals("5-10 €")) {
				min = 5;
				max = 10;
			}else if(fasciaDiPrezzo.equals("10-20 €")) {
				min = 10;
				max = 20;
			}else {// 20-75
				min = 20;
				max = 75;
			}
		}
		for(Prodotto p : prodotti) { 
			if(p.getPrezzo() < min || p.getPrezzo() > max) {
				prodotti.remove(p);
			}
		}
		return prodotti;
	}


	public Rider[] getRiders() {
		int size = this.ristorante.getRiders().size();
		Rider [] riders = new Rider[size];
		for(int i = 0; i < size; i++) {
			riders[i] = this.ristorante.getRiders().get(i);
		}
		return riders;
	}

	public void setRider(Rider rider) {
		this.rider = rider;
	}

	public Ristorante[] ottieniRistoranti() {
		return new DaoRistoranteDatabase().ottieniRistoranti();
	}
	
	public void setRistorante(int codiceRistorante) {
		this.ristorante = new DaoRistoranteDatabase().ottieniRistorante(codiceRistorante);
	}

	public void aggiungiAlCarrello(Prodotto prodottoSelezionato) {
		this.carrello.aggiungiProdotto(prodottoSelezionato, 1);
	}
	 
}