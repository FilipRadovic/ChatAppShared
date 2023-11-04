/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Date;

/**
 *
 * @author frado
 */
public class Poruka {
    
    private long porukaID;
    private String posiljalac;
    private String primalac;
    private Date datumVreme;
    private String poruka;

    public Poruka() {
    }

    public Poruka(long porukaID, String posiljalac, String primalac, Date datumVreme, String poruka) {
        this.porukaID = porukaID;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.datumVreme = datumVreme;
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public long getPorukaID() {
        return porukaID;
    }

    public void setPorukaID(long porukaID) {
        this.porukaID = porukaID;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public Date getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(Date datumVreme) {
        this.datumVreme = datumVreme;
    }
    
    
}
