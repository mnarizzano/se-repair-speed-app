package model;
/*
 * Sistema
 * 
 * versione 1.0
 * 
 * Licence <a href="http://www.wtfpl.net"> WTFPL</a>
 */

import java.util.ArrayList;
import java.util.Date;

public class Sistema {

    private String datiAzienda;
    private String piva;

    /** Associations */
    private ArrayList< Artigiano >           artigiani;
    private ArrayList< RichiestaIntervento > richieste;
     
    
    /**
     * Default constructor. Creo due liste, una di artigiani, e un altra di richieste
     */
   	public Sistema(String dati, String piva){
   		
   		this.datiAzienda = dati;
   		this.piva = piva;
   		this.artigiani = new ArrayList< Artigiano >();
   		this.richieste = new ArrayList< RichiestaIntervento >();
   	}
    
    /**
     * Operation Add Richiesta, aggiunge una richiesta di intervento alla lista di richieste.
     *
     * @param richiesta
     */
    public void addRichiesta( RichiestaIntervento richiesta ) {
    	this.richieste.add(richiesta);
    }
    
    /**
     * Operation Get Lista di richieste
     * 
     * @return Richiesta di Intervento
     */
    public ArrayList< RichiestaIntervento >getRichieste(  ) {
    	return richieste;
    }
  
    /**
     * Operation Ritorna un artigiano
     * @param id dell'artigiano
     * @return un Artigiano se trova un artigiano con lo stesso id, null altrimenti
     *      */
    public Artigiano getArtigiano(int id ) {
    	for(Artigiano a : this.artigiani) 
    	    if(a.getId() == id) return a;
    	return null;
    }
    
    /**
     * Controlla la disponibilità di tutti gli Artigiani di un determinato tipo
     * e ritorna il primo artigiano libero in quella data.
     *
     * @param data giorno di cui si deve effettuare l'intervento.
     * @param tipoArtigiano tipo di artigiano di cui si vuol vedere la disponibilità
     * {@see TipoArtigiano}
     * @return il primo artigiano libero che può effettuare l'intervento.
     * null se non ci sono artigiani disponibili in quella data.
     */
    public Artigiano disponibilità ( Date data, TipoArtigiano tipoArtigiano ) {
        
    	for(Artigiano a:artigiani){
    		if (a.getTipoArtigiano()==tipoArtigiano){
    			/*Costruisco un array di date in cui l'artigiano non è disponibile.*/
    			ArrayList<Date> indisponibile = getIndisponibilita(a);
    			boolean disponibile = true; // Artigiano disponibile fino a prova contraria.
    			/*Per ogni data in cui l'artigiano è indisponibile controllo se coincide con la 
    			 * data in cui vorrei schedulare l'intervento.
    			 */
    			for(Date d:indisponibile){
    				if (data.compareTo(d) == 0) {
    					disponibile=false;
    					break;
    				}
    			}
    			if (disponibile) {
    				return a;
    			}
    		}
    	}	
    	return null;
    }

    private ArrayList<Date> getIndisponibilita(Artigiano a) {
    	ArrayList<Date> indisponibile = new ArrayList<Date>();
    	for (RichiestaIntervento r:richieste){
    		if(r.getIntervento().getArtigiano().getId() == a.getId()){
    			indisponibile.add(r.getIntervento().getDataInizio());
    		}
    	}
    	return indisponibile;
    }
    
    
    public Artigiano creaArtigiano(String datiArtigiano, TipoArtigiano tipoArtigiano, double costoH) {
    	try{	
    		Artigiano a = new Artigiano(datiArtigiano,tipoArtigiano,costoH);
    		this.artigiani.add(a);
    		return a	;
    	} catch (Exception exp){
    	}
    	return null;
    }
    

    public RichiestaIntervento creaRichiesta(String datiArtigiano, TipoArtigiano tipo, Date data) {
    	RichiestaIntervento r = new RichiestaIntervento("Mario Rossi",tipo,data);
    	this.richieste.add(r);
    	return r	;
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
