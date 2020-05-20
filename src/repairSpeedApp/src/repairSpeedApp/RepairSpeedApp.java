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
public class RepairSpeedApp {
    
    private Agenda                         _agenda;
    private ArrayList<RichiestaIntervento> _richiesteIntervento;
    private ArrayList<Cliente>             _clienti;
    private ArrayList<Artigiano>           _artigiani;
    
    /**
     * Crea una Nuova Richiesta, in una data scelta e di un certo tipo.
     * Ritorna un oggetto RichiestaIntervento se esiste un artigiano 
     * di tipo tA libero in quella data(d)/time (t)
     * @param nome      del cliente
     * @param indirizzo del cliente
     * @param tel       del cliente
     * @param mail      del cliente
     * @param tA        tipo di artigiano necessario per l'intervento 
     * @param d         giorno scelto per l'intervento
     * @param t         orario scelto per l'intervento
     * @return          un oggetto RichiestaIntervento oppure null
     */
    public RichiestaIntervento creaRichiestaIntervento(String nome, String indirizzo, 
            String tel, String mail, TipoArtigiano tA, LocalDate d, LocalTime t){
        Artigiano a = cercaArtigiano(d,t,tA);
        if (a == null) {
            return null;
        }
        Cliente c = cercaCliente(nome);
        if (c == null) {
            c = new Cliente(nome,indirizzo,tel,mail);
            this.addCliente(c);
        }
        
        RichiestaIntervento ri = new RichiestaIntervento(tA,a,c);
        addRichiestaIntervento(ri);
        _agenda.updateAgenda(ri);
        this.sendmail(c);
        return ri;
    }
     
    private Artigiano cercaArtigiano(LocalDate d, LocalTime t, TipoArtigiano tA) {
        for (Artigiano a: _artigiani){
            if(_agenda.checkAppuntamento(d, t, a) == false) {
                return a;
            }
        }
        return null;
    }
    
    /**
     *
     * @param nome
     * @return
     */
    public Cliente cercaCliente(String nome) {
        return null;
    }
    
    /**
     *
     * @param cl
     */
    public void sendmail(Cliente cl) {
    }

    /**
     * @return the _agenda
     */
    public Agenda getAgenda() {
        return _agenda;
    }

    /**
     * @param _agenda the _agenda to set
     */
    public void setAgenda(Agenda _agenda) {
        this._agenda = _agenda;
    }
    
    public void addCliente(Cliente c) {
       _clienti.add(c); 
    }
    
    public void addRichiestaIntervento(RichiestaIntervento ri){
        _richiesteIntervento.add(ri);
    }
}
