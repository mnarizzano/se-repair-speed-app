/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repairSpeedApp;

/**
 *
 * @author mox
 */
public class Artigiano {
    
    private int _id;
    private TipoArtigiano _tipoArtigiano;   

    /**
     *
     * @return
     */
    public int getId() {
        return _id;
    }

    /**
     *
     * @param _id
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     *
     * @return
     */
    public TipoArtigiano getTipoArtigiano() {
        return _tipoArtigiano;
    }

    /**
     *
     * @param _tipoArtigiano
     */
    public void setTipoArtigiano(TipoArtigiano _tipoArtigiano) {
        this._tipoArtigiano = _tipoArtigiano;
    }
    
    
}
