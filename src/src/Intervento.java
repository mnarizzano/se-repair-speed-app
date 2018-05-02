import java.util.Date;

public class Intervento {
    /** Attributes */
    private int ID;
    private StatoIntervento stato;
    private Date dataInizio;
    private Date dataFine;

    /** Associations */
    private RelazioneTecnica relazioneTecnica;
    private Artigiano artigiano;
    
    public Intervento(int iD, Date dataInizio, Artigiano artigiano) {
		super();
		ID = iD;
		this.dataInizio = dataInizio;
		this.artigiano = artigiano;
		stato = StatoIntervento.Open;
	}
        
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public StatoIntervento getStato() {
		return stato;
	}
	public void setStato(StatoIntervento stato) {
		this.stato = stato;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	public RelazioneTecnica getRelazioneTecnica() {
		return relazioneTecnica;
	}
	public void setRelazioneTecnica(RelazioneTecnica relazioneTecnica) {
		this.relazioneTecnica = relazioneTecnica;
	}
	public Artigiano getArtigiano() {
		return artigiano;
	}
	public void setArtigiano(Artigiano artigiano) {
		this.artigiano = artigiano;
	}

    /**
     * Operation
     *
     * @return double
     */
    public double durata(  ) {
       return (double) (dataFine.getTime() - dataInizio.getTime())/(3600000);
    }
    /**
     * Operation
     *
     * @return 
     */
    public double calcolaCosto (  ) {
        return 0.0;
    }
}
