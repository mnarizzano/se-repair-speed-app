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
public class Cliente {
    
    private int _id;
    private String _nome;
    private String _indirizzo;
    private String _telefono;
    private String _email;

    /**
     *
     * @param _nome
     * @param _indirizzo
     * @param _telefono
     * @param _email
     */
    public Cliente(String _nome, String _indirizzo, String _telefono, String _email) {
        this._nome = _nome;
        this._indirizzo = _indirizzo;
        this._telefono = _telefono;
        this._email = _email;
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
     * @return the _nome
     */
    public String getNome() {
        return _nome;
    }

    /**
     * @param _nome the _nome to set
     */
    public void setNome(String _nome) {
        this._nome = _nome;
    }

    /**
     * @return the _indirizzo
     */
    public String getIndirizzo() {
        return _indirizzo;
    }

    /**
     * @param _indirizzo the _indirizzo to set
     */
    public void setIndirizzo(String _indirizzo) {
        this._indirizzo = _indirizzo;
    }

    /**
     * @return the _telefono
     */
    public String getTelefono() {
        return _telefono;
    }

    /**
     * @param _telefono the _telefono to set
     */
    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }
    
    
}
