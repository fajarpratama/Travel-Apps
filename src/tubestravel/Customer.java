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
public class Customer  {

    private String nama;
    private String id;
    private String userName;
    private String password;
    private boolean Bayar=false;


    /**
     * method untuk menggenerate nama customer
     * @param id
     * @param nama 
     */
    public Customer(String nama, String id, String userName, String password) {
        this.nama = nama;
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
    public Customer(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    public Customer(){}
    
    /**
     * 
     * @return 
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " Nama Customer: " + getNama() + "\n" + "Id Customer: " + getId();
    }

    /**
     * @return the Bayar
     */
    public boolean isBayar() {
        return Bayar;
    }

    /**
     * @param Bayar the Bayar to set
     */
    public void setBayar(boolean Bayar) {
        this.Bayar = Bayar;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


}
