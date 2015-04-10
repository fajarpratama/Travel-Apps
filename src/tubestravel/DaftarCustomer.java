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
public class DaftarCustomer {

    private ArrayList<Customer> daftarC = new ArrayList<>();

    public DaftarCustomer() {
    }

    public void addCustomer(Customer c) {
        daftarC.add(c);
    }

    public void removeCustomer(Customer c) {
        daftarC.remove(c);
    }

    public Customer findCustomer(String un, String pass) {
        for (Customer c : daftarC) {
            if (c.getNama().equals(un) && c.getId().equals(pass)) {
                return c;
            } else {
                return null;
            }
        }
        return null;
    }

    public String toString() {
        String spc = " ";
        for (Customer c : daftarC) {
            spc = "\n" + c.toString();
        }
        return spc;
    }

}
