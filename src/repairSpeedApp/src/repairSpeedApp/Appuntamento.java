/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairSpeedApp;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author mox
 */
public class Appuntamento {
    
    private LocalDate           _data;
    private LocalTime           _time;
    private RichiestaIntervento _richiestaIntervento;
   
    /**
     * Controlla che l'appuntamento this è nella data d e ora t
     * Se è così allora controlla che l'artigiano assegnato alla richiesta
     * d'intervento sia a. Se lo è ritorna true.
     * In ogni altro caso torna false
     * @param a  Artigiano
     * @param d  giorno 
     * @param t  ora 
     * @return  true/false
     */
    public boolean is(Artigiano a, LocalDate d, LocalTime t){
        if (d.equals(this.getData()) && t.equals(this.getTime())) {
            Artigiano a1 = _richiestaIntervento.getArtigiano();
            if(a1.equals(a)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the _data
     */
    public LocalDate getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(LocalDate _data) {
        this._data = _data;
    }

    /**
     * @return the _time
     */
    public LocalTime getTime() {
        return _time;
    }

    /**
     * @param _time the _time to set
     */
    public void setTime(LocalTime _time) {
        this._time = _time;
    }

    /**
     * @return the _richiestaIntervento
     */
    public RichiestaIntervento getRichiestaIntervento() {
        return _richiestaIntervento;
    }

    /**
     * @param _richiestaIntervento the _richiestaIntervento to set
     */
    public void setRichiestaIntervento(RichiestaIntervento _richiestaIntervento) {
        this._richiestaIntervento = _richiestaIntervento;
    }
    
    
}
