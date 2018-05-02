/*
 * Fattura
 * 
 * versione 1.0
 * 
 * Licence <a href="http://www.wtfpl.net"> WTFPL</a>
 */

import java.util.Date;

/**
* La classe Fattura, memorizza le informazioni sulla Fattura.
* 
* @author mnarizzano
*
* @todo Non si parla delle tasse applicate (Ad esempio non si parla di iva?)
*  
*/
public class Fattura {
    /** Attributes */
	private static int    numeroFatture = 0; // Memorizza il numero di fatture create
    private int           numero;            // numero progressivo Fattura
    private int           piva;              // Partita Iva 
    private Date          data;              // Data di Emissione della Fattura
    private double        importo;           // Importo della fattura
    
    /**
    * Costruisce una Fattura con tutti i parametri assegnati e ritorna un oggetto Fattura.
    * Il numero di fattura è un numero progressivo che viene assegnato in base al numero di fatture già create.
    * In teoria ci potrebbero essere due fatture con lo stesso numero, l'importante è che si riferiscano a anni diversi.
    * Con questo meccanismo di assegnamento progressivo questo non è possibile, in quanto le fatture non vengono mai resettate.
    * Per ottenere ciò basterebbe aggiungere un metodo reset alle fatture.
    * Non si esegue riciclo di id delle Fatture cancellate.
    * 
    * @param piva memorizza la partita iva di colui che emette la fattura.
    * @param data memorizza la data di emissione della fattura.
    * @param importo memorizza l'importo della fattura. 
   */
    public Fattura(int piva, Date data, double importo) {
		super();
		Fattura.numeroFatture++;
		this.numero = Fattura.numeroFatture;
		this.piva = piva;
		this.data = data;
		this.importo = importo;
	}

    /**
    * Costruisce una Fattura con tutti i parametri assegnati tranne l'importo che può essere inserito in seguito.
    * Il numero di fattura è un numero progressivo che viene assegnato in base al numero di fatture già create.
    * In teoria ci potrebbero essere due fatture con lo stesso numero, l'importante è che si riferiscano a anni diversi.
    * Con questo meccanismo di assegnamento progressivo questo non è possibile, in quanto le fatture non vengono mai resettate.
    * Per ottenere ciò basterebbe aggiungere un metodo reset alle fatture.
    *
    * Non si esegue riciclo di id delle Fatture cancellate. 
    * 
    * @param piva memorizza la partita iva di colui che emette la fattura.
    * @param data memorizza la data di emissione della fattura.
   */
	public Fattura(int numero, int piva, Date data) {
		super();
		this.numero = numero;
		this.piva = piva;
		this.data = data;
	}

	/**
	 * Il numero di fattura è un numero progressivo che viene assegnato in base al numero di fatture già create.
	 * Ci possono essere due fatture con lo stesso numero, l'importante è che si riferiscano ad anni diversi.
	 * @return il numero della fattura
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * L'identificativo di partita IVA, in Italia, si compone di 11 cifre, raggruppate secondo lo schema seguente
	 * - le prime sette cifre rappresentano il numero di matricola del soggetto assegnato dal relativo ufficio provinciale, 
	 * - le cifre dalla ottava alla decima indicano il codice dell'ufficio provinciale del fisco che ha rilasciato la matricola
	 * - l'undicesima cifra, infine, rappresenta un codice di controllo, introdotto al fine di verificare la correttezza 
	 *   delle prime dieci cifre.
	 * @return la partita iva assegnata alla fattura.
	 */
	public int getPiva() {
		return piva;
	}
	
	/**
	 * L'identificativo di partita IVA, in Italia, si compone di 11 cifre, raggruppate secondo lo schema seguente
	 * - le prime sette cifre rappresentano il numero di matricola del soggetto assegnato dal relativo ufficio provinciale, 
	 * - le cifre dalla ottava alla decima indicano il codice dell'ufficio provinciale del fisco che ha rilasciato la matricola
	 * - l'undicesima cifra, infine, rappresenta un codice di controllo, introdotto al fine di verificare la correttezza 
	 *   delle prime dieci cifre.
	 * @return la partita iva assegnata alla fattura.
	 */
	public void setPiva(int piva) {
		this.piva = piva;
	}

	/**
	 * Rappresenta la data di emissione della fattura.
	 * @return data di emissione fattura
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Rappresenta la data di emissione della fattura.
	 * @param data di emissione fattura
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * Importo totale della fattura, già comprensivo delle tasse calcolate.
	 * @return importo totale della fattura.
	 */
	public double getImporto() {
		return importo;
	}

	/**
	 * Importo totale della fattura, già comprensivo delle tasse calcolate.
	 * @param importo totale della fattura.
	 */
	public void setImporto(double importo) {
		this.importo = importo;
	}    
}

