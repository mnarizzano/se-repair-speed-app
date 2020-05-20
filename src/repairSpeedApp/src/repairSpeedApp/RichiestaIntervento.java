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
public class RichiestaIntervento {

    private int _id;
    private TipoArtigiano _tipoArtigiano;
    private LocalDate     _data;
    private LocalTime     _time;
    
    private Artigiano     _artigiano;
    private Cliente       _cliente;

    public RichiestaIntervento(TipoArtigiano _tipoArtigiano, Artigiano _artigiano, Cliente _cliente) {
        this._tipoArtigiano = _tipoArtigiano;
        this._artigiano = _artigiano;
        this._cliente = _cliente;
    }

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _tipoArtigiano
     */
    public TipoArtigiano getTipoArtigiano() {
        return _tipoArtigiano;
    }

    /**
     * @param _tipoArtigiano the _tipoArtigiano to set
     */
    public void setTipoArtigiano(TipoArtigiano _tipoArtigiano) {
        this._tipoArtigiano = _tipoArtigiano;
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
     * @return the _artigiano
     */
    public Artigiano getArtigiano() {
        return _artigiano;
    }

    /**
     * @param _artigiano the _artigiano to set
     */
    public void setArtigiano(Artigiano _artigiano) {
        this._artigiano = _artigiano;
    }

    /**
     * @return the _cliente
     */
    public Cliente getCliente() {
        return _cliente;
    }

    /**
     * @param _cliente the _cliente to set
     */
    public void setCliente(Cliente _cliente) {
        this._cliente = _cliente;
    }
    
    
    

}
