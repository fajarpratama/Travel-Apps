/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestravel;

import java.util.*;

/**
 *
 * @author AlfajriAkbar
 */
public class Travel {

    String namaPaket;
    private String dafterFasilitas;
    private int hargaPaket;
    private String Depature;
    private String Return;
    protected int maxP;
    private DaftarCustomer c;
    private DaftarTempatWisata dw;

    public Travel(String namaPaket, int hargaPaket, String Depature, String Return, int maxP, String daftarFasilitas) {
        this.namaPaket = namaPaket;
        this.hargaPaket = hargaPaket;
        this.Depature = Depature;
        this.Return = Return;
        this.maxP = maxP;
        this.dafterFasilitas = daftarFasilitas;

        DaftarBook b = new DaftarBook();
    }

    Travel() {
    }

    public void addTempatWisata(TempatWisata w) {
        dw.addTempatWisata(w);
    }

    /**
     * @return the namaPaket
     */
    public String getNamaPaket() {
        return namaPaket;
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        return hargaPaket;
    }

    /**
     * @return the Depature
     */
    public String getDepature() {
        return Depature;
    }

    /**
     * @return the Return
     */
    public String getReturn() {
        return Return;
    }

    /**
     * @param namaPaket the namaPaket to set
     */
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    /**
     * @param Depature the Depature to set
     */
    public void setDepature(String Depature) {
        this.Depature = Depature;
    }

    /**
     * @param Return the Return to set
     */
    public void setReturn(String Return) {
        this.Return = Return;
    }

    /**
     * @return the dafterFasilitas
     */
    public String getDafterFasilitas() {
        return dafterFasilitas;
    }

    /**
     * @param dafterFasilitas the dafterFasilitas to set
     */
    public void setDafterFasilitas(String dafterFasilitas) {
        this.dafterFasilitas = dafterFasilitas;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(int hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    /**
     * @return the maxP
     */
    public int getMaxP() {
        return maxP;
    }

    /**
     * @param maxP the maxP to set
     */
    public void setMaxP(int maxP) {
        this.maxP = maxP;
    }

    @Override
    public String toString() {
        String a = "Travel" + "\n" + "NamaPaket=" + namaPaket + "\n" + "DafterFasilitas=" + dafterFasilitas + "\n" + "HargaPaket=" + hargaPaket + "\n" + "Depature=" + Depature + "\n" + "Return=" + Return + "\n" + "JumlahKuota=" + maxP;

        String b = dw.toString();

        return a + "\n" + b;
    }

}
