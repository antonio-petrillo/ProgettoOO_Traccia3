package Classi;


import java.awt.Image;
import java.sql.SQLException;

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

    private DaoUtente daoUtente = new DaoUtenteDatabase();

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
   
	   public void visualizzazioneMenu()
   {
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
	

	public void creaUtente(Utente utente) 
	{
		if(inputVuoto(utente)==false){
			{
				try {
					if(daoUtente.creaUtente(utente))
					{
						VisualizzazioneAvvisi("Iscrizione Effettuata con successo");
					}
					else
					{
						VisualizzazioneAvvisi("Utente già presente");
					}
				} catch (SQLException e) {
					VisualizzazioneAvvisi(e.getMessage());
				}
				catch(Exception e)
				{
					VisualizzazioneAvvisi(e.getMessage());
				}
			}
		}
		else
		{
			VisualizzazioneAvvisi("alcuni campi sono vuoti");
		}
	}
	
	public void resetPassword(Utente utente,char[] nPassword ) {
		String nuovaPassword=new String(nPassword);
			try {
				if(daoUtente.cambiaPWD(utente,nuovaPassword))
				{
					VisualizzazioneAvvisi("Password Aggiornata");
				}
				else
				{
					VisualizzazioneAvvisi("Password non aggiornata utente non presente o password\n precedente errata");
				}
			}catch(SQLException e)
			{
				VisualizzazioneAvvisi("Errore del database riprova piu tardi");
			}
			catch(Exception e)
			{
			    VisualizzazioneAvvisi(e.getMessage());
			}
		}
	
    public boolean inputVuoto(Utente utente)
	{
		if(utente.getNome().isEmpty()==true || (utente.getCognome().isEmpty())==true || (utente.getEmail().isEmpty())==true || (utente.getNumeroTelefonico().isEmpty()==true) || (utente.getDataDiNascita().isEmpty())==true || (utente.getPassword().isEmpty()==true))
		{
			return true;
		}
		return false;
	}
    
    public void effettuaAccesso(Utente utente)
    {
    	try
    	{
    		if(daoUtente.effettua_accesso(utente.getEmail(),utente.getPassword()))
    		{
    			
    			visualizzazioneMenu();
    		}
    		else
    		{
    			VisualizzazioneAvvisi("utente o password errati");
    		}
    	}
    	catch(SQLException e)
    	{
    		VisualizzazioneAvvisi(e.getMessage());
    	}
    	catch(Exception e)
    	{
    		VisualizzazioneAvvisi("errore");
    	}
    }

	  public  ImageIcon scaleImageIcon(ImageIcon image, int width, int height) {
			Image tmp = image.getImage();
			Image scaledImage = tmp.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
			ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
			return scaledImageIcon;
		}

}