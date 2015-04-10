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
public class DaftarTempatWisata {
    private ArrayList<TempatWisata> daftarTW = new ArrayList<>();
    
    public DaftarTempatWisata(){}
    
    /**
     *
     * @param t
     */
    public void addTempatWisata(TempatWisata t){
        daftarTW.add(t);
    }
    
    public void removeTempatWisata(TempatWisata t){
        daftarTW.remove(t);
    }
    
    public String toString(){
        String spc=" ";
        for (TempatWisata t : daftarTW){
            spc = "\n"+t.toString();
        }return spc;
    }
    
}
