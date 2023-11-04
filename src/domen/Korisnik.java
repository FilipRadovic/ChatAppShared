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
public class Korisnik implements Serializable{
    
    private long korisnikID;
    private String username;
    private String password;

    public Korisnik() {
    }

    public Korisnik(long korisnikID, String username, String password) {
        this.korisnikID = korisnikID;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Korisnik other = (Korisnik) obj;
        if (this.korisnikID != other.korisnikID) {
            return false;
        }
        return true;
    }
    
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getKorisnikID() {
        return korisnikID;
    }

    public void setKorisnikID(long korisnikID) {
        this.korisnikID = korisnikID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
