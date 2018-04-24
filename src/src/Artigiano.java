/*
 * Artigiano
 * 
 * versione 1.0
 * 
 * Licence FCCV
 */

import java.util.Date;

/**
 * La classe Artigiano, memorizza le informazioni sull'Artigiano e il tipo di Artigiano
 * 
 *  * @author se-17-user
 *
 */
public class Artigiano {
    /** Attributes */
    private String datiArtigiano;
    private TipoArtigiano tipoArtigiano;
    private double costoH;
    
   
    public Artigiano(String datiArtigiano, TipoArtigiano tipoArtigiano, double costoH) {
		super();
		this.datiArtigiano = datiArtigiano;
		this.tipoArtigiano = tipoArtigiano;
		this.costoH = costoH;
	}
	public String getDatiArtigiano() {
		return datiArtigiano;
	}
	public void setDatiArtigiano(String datiArtigiano) {
		this.datiArtigiano = datiArtigiano;
	}
	public TipoArtigiano getTipoArtigiano() {
		return tipoArtigiano;
	}
	public void setTipoArtigiano(TipoArtigiano tipoArtigiano) {
		this.tipoArtigiano = tipoArtigiano;
	}
	public double getCostoH() {
		return costoH;
	}
	public void setCostoH(double costoH) {
		this.costoH = costoH;
	}
	
	/**
     * Operation
     *
     * @param h
     * @return double
     */
    public double calcolaCosto ( double h )
    {
    	return h * costoH;
    }
    
    /**
     * Operation
     *
     * @param data
     * @return boolean
     */
    public boolean disponibilità ( Date data )
    {
        return true;
    	
    }

}

