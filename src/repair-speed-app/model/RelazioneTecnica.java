package model;

public class RelazioneTecnica {
    /** Attributes */
    private int ID;
    private String relazione;
    private String materiale;

    private static int numRelazioni = 0;
    
    
    public RelazioneTecnica(String relazione, String materiale){
    	this.numRelazioni++;
    	ID = numRelazioni;
    	this.setMateriale(materiale);
    	this.setRelazione(relazione);
    }

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getRelazione() {
		return relazione;
	}

	public void setRelazione(String relazione) {
		this.relazione = relazione;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	/**
     * Operation
     *
     * @return double
     */
    public double calcolaCosto (  ) {
    	return 0.0;
    }
}
