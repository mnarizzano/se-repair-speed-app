package model;
import java.util.Date;

public class RichiestaIntervento {
    /** Attributes */
    private int ID;
    private String datiCliente;
    private TipoArtigiano tipoIntervento;
    private Date data;
    private StatoRichiesta stato;
    /** Associations */
    private ProceduraPagamento proceduraPagamento;
    private Intervento intervento;

    private static int numeroIntervento = 0;
    
    public RichiestaIntervento(String datiCliente, TipoArtigiano tipoIntervento, Date data) {
		super();
		numeroIntervento++;
		ID = numeroIntervento;
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


	public TipoArtigiano getTipoIntervento() {
		return tipoIntervento;
	}


	public void setTipoIntervento(TipoArtigiano tipoIntervento) {
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

	public Intervento creaIntervento(Date date, Artigiano a){
		this.intervento = new Intervento(date,a);
		return getIntervento();
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
