package Classi;


public class PagamentoAllaConsegna implements MetodoDiPagamento {
	
	private String NomeUtente;
	private Indirizzo IndirizzoUtente;
	
	
	
    public PagamentoAllaConsegna(String nomeUtente, Indirizzo indirizzoUtente) {
		super();
		NomeUtente = nomeUtente;
		IndirizzoUtente = indirizzoUtente;
	}


	public String getNomeUtente() {
		return NomeUtente;
	}

	
	public void setNomeUtente(String nomeUtente) {
		NomeUtente = nomeUtente;
	}

	
	public Indirizzo getIndirizzoUtente() {
		return IndirizzoUtente;
	}

	
	public void setIndirizzoUtente(Indirizzo indirizzoUtente) {
		IndirizzoUtente = indirizzoUtente;
	}
	
}
