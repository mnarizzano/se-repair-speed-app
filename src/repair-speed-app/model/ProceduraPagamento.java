import java.util.Date;

public class ProceduraPagamento {

	/** Attributes */
    public TipologiaPagamento tipologia;
    private int ID;
    private StatoPagamento stato;
    static int numFattura = 0;
    
    
    
    public ProceduraPagamento(TipologiaPagamento tipologia, int iD, StatoPagamento stato) {
		super();
		this.tipologia = tipologia;
		ID = iD;
		this.stato = stato;
	}
      
    
	public TipologiaPagamento getTipologia() {
		return tipologia;
	}
	public void setTipologia(TipologiaPagamento tipologia) {
		this.tipologia = tipologia;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public StatoPagamento getStato() {
		return stato;
	}
	public void setStato(StatoPagamento stato) {
		this.stato = stato;
	}
	public static int getNumFattura() {
		return numFattura;
	}
	public static void setNumFattura(int numFattura) {
		ProceduraPagamento.numFattura = numFattura;
	}
	public Fattura getFattura() {
		return fattura;
	}
	public void setFattura(Fattura fattura) {
		this.fattura = fattura;
	}

	/** Associations */
    private Fattura fattura;
    /**
     * Operation
     *
     * @param tot
     * @param datiCliente
     * @return Fattura
     */
    public Fattura creaFattura ( int tot, Date  data,String datiCliente ) {
    	numFattura++;
		fattura = new Fattura(numFattura, Integer.parseInt(datiCliente),data, tot);
		return fattura;
    }
   
}
