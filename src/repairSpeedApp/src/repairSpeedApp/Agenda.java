/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairSpeedApp;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author mox
 */
public class Agenda {
    
    private ArrayList<Appuntamento> _appuntamenti;

    /**
     *
     * @param ri
     */
    public void updateAgenda(RichiestaIntervento ri) {
        
    }

    /**
     *
     * @param data
     * @param time
     * @param a
     * @return
     */
    public boolean checkAppuntamento(LocalDate data, LocalTime time, Artigiano a) {
        for(Appuntamento app: _appuntamenti) {
            if(app.is(a,data,time)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param app
     */
    public void addAppuntamento(Appuntamento app) {
        _appuntamenti.add(app);
    }
}
