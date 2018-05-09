/*
 * Artigiano
 * 
 * versione 1.0
 * 
 * Licence <a href="http://www.wtfpl.net"> WTFPL</a>
 */

import java.util.Date;

/**
 * La classe Artigiano, memorizza le informazioni sull'Artigiano e il tipo di Artigiano
 * 
 * @author se-17-user
 *
 */
/**
 * @author se-17-user
 *
 */
public class Artigiano {
    /** Attributes */
	private int           id;            // numero identificativo univoco 
	private String        datiArtigiano; // "Nome Cognome"
    private TipoArtigiano tipoArtigiano; // {@see TipoArtigiano}
    private double        costoH;        // Costo Orario dell'Artigiano 
    private static int    numeroArtigiani = 0; // Memorizza il numero di artigiani creati
    
    
   /**
    * Costruisce un Artigiano con i parametri assegnati e ritorna un oggetto Artigiano.
    * Non esegue riciclo di id di Artigiani Cancellati. 
    * 
    * @param datiArtigiano Nome e Cognome dell'Artigiano
    * @param tipoArtigiano Tipo di Artigiano {@see TipoArtigiano}
    * @param costoH  Costo orario è un numero intero che deve essere sempre maggiore di 0.
    * @throws NumeroArtigianiMassimoException quando il numero degli artigiani 
    * raggiunge il massimo valore Integer.MAX_VALUE.
    * 
    */
    public Artigiano(String datiArtigiano, TipoArtigiano tipoArtigiano, double costoH) throws NumeroArtigianiMassimoException {
		super();
		this.datiArtigiano = datiArtigiano;
		this.tipoArtigiano = tipoArtigiano;
		if (costoH <= 0) {
			throw new RuntimeException("INVALID Costo Orario, numero < o = a 0!");
		}
		this.costoH = costoH;
		if(this.numeroArtigiani == Integer.MAX_VALUE){
			throw new NumeroArtigianiMassimoException("Numero Artigiani massimo raggiunto!");
		}
		this.numeroArtigiani++;
		this.id = this.numeroArtigiani;   
    }
    /**
     * Id è un numero univoco maggiore di 0, e minore di Integer.MAX_VALUE, che viene 
     * assegnato all'artigiano in fase di costruzione. Non può essere mai modificato
     * durante il ciclo di vita dell'oggetto. 
     * 
     * @return id un intero univoco assegnato all'artigiano.
     */
    public int getId() {
    	return id;	
	}	

    /**
     * DatiArtigiano è una stringa che contiene il Nome e il Cognome dell'artigiano, separati da spazio.
     * Al momento non viene fatto alcun controllo sulla formattazione di questo attributi.
     * 
     * @return Nome e Cognome dell'artigiano.
     */
	public String getDatiArtigiano() {
		return datiArtigiano;
	}
	
	/**
     * DatiArtigiano è una stringa che contiene il Nome e il Cognome dell'artigiano, separati da spazio.
     * Al momento non viene fatto alcun controllo sulla formattazione di questo attributi.
     * 
     * @param datiArtigiano contiene Nome e Cognoome dell'artigiano.
     */
	public void setDatiArtigiano(String datiArtigiano) {
		this.datiArtigiano = datiArtigiano;
	}
	
	/**
	 * Il TipoArtigiano rappresenta la specializzazione dell'artigiano. Ad esempio un artigiano idraulico è specializzato
     * in interventi di idraulica. 
     * 
     * @return tipoArtigiano il tipo di artigiano definito nella classe <a href="./src/TipoArtigiano.java">TipoArtigiano</a>.
	 */
	public TipoArtigiano getTipoArtigiano() {
		return tipoArtigiano;
	}

	/**
     * Il TipoArtigiano rappresenta la specializzazione dell'artigiano. Ad esempio un artigiano idraulico è specializzato
     * in interventi di idraulica. 
     * 
     * @param tipoArtigiano il tipo di artigiano definito nella classe <a href="./src/TipoArtigiano.java">TipoArtigiano</a>.
     */
	public void setTipoArtigiano(TipoArtigiano tipoArtigiano) {
		this.tipoArtigiano = tipoArtigiano;
	}
	
	/**
     * Il CostoH rappresenta il costo per ogni ora di lavoro dell'artigiano, in euro.
     * 
     * @return un numero con la virgola, rappresentante il costo orario dell'artigiano in euro.
     */
	public double getCostoH() {
		return costoH;
	}
	

	/**
     * Il CostoH rappresenta il costo per ogni ora di lavoro dell'artigiano, in euro.
     * 
     * @param costoH un numero con la virgola maggiore di zero.
     */
	public void setCostoH(double costoH) {
		this.costoH = costoH;
	}
	
	/**
     * 
     * CalcolaCosto ritorna il costo del lavoro dell'artigiano dato il numero dei 
     * minuti lavorati.
     *
     * @param h è un intero maggiore o uguale a 0 che rappresenta 
     * il numero di minuti lavorati 
     * @return il costo del lavoro dell'artigiano. Ritorna 0 se il numero dei minuti
     * è minore di 0.
     */
    public double calcolaCosto ( int h ) {
    	if (h < 0) { return 0.0; }
    	return ((double) (h / 60) * costoH);
    }
    
}

