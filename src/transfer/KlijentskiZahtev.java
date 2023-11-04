/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author frado
 */
public class KlijentskiZahtev implements Serializable{
    
    private int operacije;
    private Object parametar;

    public KlijentskiZahtev() {
    }

    public KlijentskiZahtev(int operacije, Object parametar) {
        this.operacije = operacije;
        this.parametar = parametar;
    }

    public Object getParametar() {
        return parametar;
    }

    public void setParametar(Object parametar) {
        this.parametar = parametar;
    }

    public int getOperacije() {
        return operacije;
    }

    public void setOperacije(int operacije) {
        this.operacije = operacije;
    }
    
    
    
    
}
