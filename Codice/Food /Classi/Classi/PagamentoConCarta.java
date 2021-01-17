package Classi;

import java.util.Date;

public class PagamentoConCarta implements MetodoDiPagamento {

	private String NumeroCarta;
	private Date DataScadenza;
	private String CodiceCarta;
	
	

	public PagamentoConCarta(String numeroCarta, Date dataScadenza, String codiceCarta) {
		super();
		NumeroCarta = numeroCarta;
		DataScadenza = dataScadenza;
		CodiceCarta = codiceCarta;
	}


	public String getNumeroCarta() {
		return NumeroCarta;
	}

	
	public void setNumeroCarta(String numeroCarta) {
		NumeroCarta = numeroCarta;
	}

	
	public Date getDataScadenza() {
		return DataScadenza;
	}

	
	public void setDataScadenza(Date dataScadenza) {
		DataScadenza = dataScadenza;
	}

	
	public String getCodiceCarta() {
		return CodiceCarta;
	}

	
	public void setCodiceCarta(String codiceCarta) {
		CodiceCarta = codiceCarta;
	}
	
}
