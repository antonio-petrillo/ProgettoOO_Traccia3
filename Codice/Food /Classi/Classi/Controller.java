package Classi;

import java.sql.SQLException;

import Dao.*;
import GuiFood.*;



public class Controller {
	
	private Login login;
    private Registrazioni registrazione;
	private Password_Dimenticata password_dimenticata;
	private VisualizzazioneAvvisi dialogErrore;
	private DaoUtente daoUtente = new DaoUtenteDatabase();


	
	public Controller() {
		
		login = new Login(this);
		login.setVisible(true);
		login.setLocationRelativeTo(null);
	   
	}

   public void visualizzazioneRegistrazione() {
	    registrazione = new Registrazioni(this);
	    registrazione.setVisible(true);
	    registrazione.setLocationRelativeTo(login);
   }
    
    public void VisualizzazioneAvvisi(String stringErroreCommesso) 
    {
    	dialogErrore = new VisualizzazioneAvvisi(this,stringErroreCommesso);
    	dialogErrore.setVisible(true);
    	dialogErrore.setBounds(0, 0,360, 150);
		dialogErrore.setLocationRelativeTo(login);
    }
    

	public void visualizzazionePwdDimenticata() {
		password_dimenticata = new Password_Dimenticata(this);
		password_dimenticata.setVisible(true);
		password_dimenticata.setLocationRelativeTo(login);

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
					VisualizzazioneAvvisi(e.getMessage()	);
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

    public void effettuaAccesso(Utente utenteCorrente)
    {
    	try
    	{
    		if(daoUtente.effettua_accesso(utenteCorrente.getEmail(),utenteCorrente.getPassword()))
    		{
    			//visualizzazioneMenu(tipoUtente);
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
    		VisualizzazioneAvvisi("errore ");
    	}
    }
}
