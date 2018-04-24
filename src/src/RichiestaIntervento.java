import java.util.Date;

public class RichiestaIntervento {
    /** Attributes */
    private int ID;
    private String datiCliente;
    private String tipoIntervento;
    private Date data;
    private StatoRichiesta stato;
    /** Associations */
    private ProceduraPagamento proceduraPagamento;
    private Intervento intervento;
  
    public RichiestaIntervento(int iD, String datiCliente, String tipoIntervento, Date data) {
		super();
		ID = iD;
		this.datiCliente = datiCliente;
		this.tipoIntervento = tipoIntervento;
		this.data = data;
		stato = StatoRichiesta.Open;
    }

  
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getDatiCliente() {
		return datiCliente;
	}


	public void setDatiCliente(String datiCliente) {
		this.datiCliente = datiCliente;
	}


	public String getTipoIntervento() {
		return tipoIntervento;
	}


	public void setTipoIntervento(String tipoIntervento) {
		this.tipoIntervento = tipoIntervento;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public StatoRichiesta getStato() {
		return stato;
	}


	public void setStato(StatoRichiesta stato) {
		this.stato = stato;
	}


	public ProceduraPagamento getProceduraPagamento() {
		return proceduraPagamento;
	}


	public void setProceduraPagamento(ProceduraPagamento proceduraPagamento) {
		this.proceduraPagamento = proceduraPagamento;
	}


	public Intervento getIntervento() {
		return intervento;
	}


	public void setIntervento(Intervento intervento) {
		this.intervento = intervento;
	}


	/**
     * Operation
     *
     * @return Fattura
     */
    public Fattura emettiFattura (  ) {
    	return null;
    }
    
}
