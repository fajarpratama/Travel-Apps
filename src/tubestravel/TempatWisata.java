/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestravel;

/**
 *
 * @author AlfajriAkbar
 */
public class TempatWisata {

    private String namaTempat, info;

    public TempatWisata(String namaTempat, String info) {
        this.namaTempat = namaTempat;
        this.info = info;
    }
    public TempatWisata(){}

    /**
     * @return the namaTempat
     */
    public String getNamaTempat() {
        return namaTempat;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "TempatWisata: " + "\n" + "NamaTempat=" + "\n" + namaTempat + "\n" + "Info=" + getInfo();
    }

    /**
     * @param namaTempat the namaTempat to set
     */
    public void setNamaTempat(String namaTempat) {
        this.namaTempat = namaTempat;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

}
        