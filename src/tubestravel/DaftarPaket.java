/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestravel;

import java.util.ArrayList;

/**
 *
 * @author AlfajriAkbar
 */
public class DaftarPaket {
    private ArrayList<Travel> daftarT = new ArrayList<>();

    public DaftarPaket() {
    }

    /**
     *
     * @param t
     */
    public void addPaket(Travel t) {
        daftarT.add(t);
    }

    public void removePaket(Travel t) {
        daftarT.remove(t);
    }

    public Travel findPaketWithNama(String name) {
        for (Travel t : daftarT) {
            if (t.getNamaPaket().equals(name)) {
                return t;
            }else return null;
        }
        return null;
    }

    @Override
    public String toString() {
        String su = null;
        for (Travel t : daftarT) {
            su += "\n" + t.toString();
        }
        return su;
    }
}
