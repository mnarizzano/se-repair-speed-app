import java.util.ArrayList;
import java.util.Date;

public class Sistema {

    private String datiAzienda;

    /** Associations */
    private Artigiano[] artigiani;
    private RichiestaIntervento[] richieste;
    
    /**
     * In input prende una data e un tipo di artigiano e restituisce il primo artigiano
     * di quel tipo libero. Assumiamo che le giornate siano divise in periodi a tempo fissato. 
     * Quindi se la data di inizio di un intervento non è stata ancora  occupata
     * allora si assume l'artigiano libero.
     * 
     * @param d data in cui si vuole cercare una disponibilità
     * @param t tipo di artigiano
     * @return null se non ci sono artigiani disponibili, altrimenti un artigiano-
     */
    public Artigiano getArtigianoDisponibile(Date d, TipoArtigiano t){
    	/* Creiamo una listaArtigiani (scorrendo la lista con tutti gli artigiani) contenente 
    	 * tutti gli artigiani di tipo t.
    	*/
    	ArrayList<Artigiano> listaArtigiani = new ArrayList<Artigiano>();	
    	for (Artigiano a:artigiani){
    		if (a.getTipoArtigiano() == t){
    			listaArtigiani.add(a);
    		}
    	}
    	/* Per ogni Artigiano di tipo t (in listaArtigiani) creiamo la lista delle sue  indisponibilità.
    	 * Poi scorriamo la lista delle indisponibilità per vedere se nella data d in cui vogliamo
    	 * effettuare un intervento l'artigiano è già occupato. Nel caso sia occupato, viene iterato il prossimo artigiano.
    	 * in caso contrario viene ritornato l'artigiano.
    	 */
    	for (Artigiano a:listaArtigiani){
    		ArrayList<Date> indisponibili = getIndisponibilita(a);
    		boolean disponibile = true;
    		for(Date i:indisponibili){
    			if (i.compareTo(d) == 0){
    				disponibile = false;
    				break;
    			}			
    		}
    		if (disponibile) {return a;}
    	}    
    	/*Arrivati a questo punto nessun artigiano è stato trovato.*/
    	return null;
    }	
    /* Dato un artigiano in input, l'algoritmo 
     * scorre la lista delle richieste di intervento 
     * e aggiunge al set la data di ogni intervento che deve
     * essere effettuato dall'artigiano.
     *
     */
    private ArrayList<Date> getIndisponibilita(Artigiano a){	
    	ArrayList<Date> indisponibilita = new ArrayList<Date>();
    	for (RichiestaIntervento r:richieste){
    		if (a.getID() == r.getIntervento().getArtigiano().getID()) {	
    			indisponibilita.add(r.getIntervento().getDataInizio());
    		}
    	}
    	return indisponibilita;
	}
    /**
     * Operation
     *
     * @param richiesta
     */
    public void sottomettiRichiesta ( RichiestaIntervento richiesta ) {

    }
  
    /**
     * Operation
     *
     * @return RichiestaIntervento[]
     */
    public RichiestaIntervento[] visualizzaRichieste (  )
    {
    	return richieste;
    }
    /**
     * Operation
     *
     * @return Intervento[]
    
      public Intervento[] visualizzaInterventi (  ) {
    	return 
    } 
    * Operation
     *
     * @return Intervento
     */
 /*   public Intervento apriIntervento (  )
    {
    	return new Intervento()
    } 
     * Operation
     *
     * @return ProceduraPagamento
     */
   /* public ProceduraPagamento apriProceduraPagamento (  )
    {
    }
  
     * Operation
     *
     * @return Fattura
     *//*
    public Fattura emettiFattura (  )
    {
    }
      * Operation
     *
     *//*
    public void chiudiRichiesta (  )
    {
    }
   
     * Operation
     *
     *//*
    public void chiudiProceduraPagamento (  )
    {
    }
*/
}
