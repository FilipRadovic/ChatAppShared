/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author frado
 */
public class Administrator implements Serializable{
    
    private long administratorID;
    private String email;
    private String lozinka;
    private String ime;
    private String prezime;

    public Administrator() {
    }

    public Administrator(long administratorID, String email, String lozinka, String ime, String prezime) {
        this.administratorID = administratorID;
        this.email = email;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public long getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(long administratorID) {
        this.administratorID = administratorID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    
    
}
