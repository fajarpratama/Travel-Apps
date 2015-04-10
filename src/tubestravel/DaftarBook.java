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
public class DaftarBook {
    Travel t = new Travel();
    int a;
    public DaftarBook() {
        this.a = t.getMaxP();
    }
    ArrayList<Customer> daftarBook = new ArrayList<>(a);

    public void addCustomer(Customer c) {
        if (getAvailable() == true) {
            daftarBook.add(c);
        }
    }

    public boolean getAvailable() {
        if (daftarBook.size() < a) {
            return true;
        }
        return false;
    }

    public Customer cariCustomer(String nama) {
        for (Customer daftarCustomer1 : daftarBook) {
            if (daftarCustomer1.getNama().equals(nama)) {
                return daftarCustomer1;
            }
        }
        return null;
    }

    public void bayar(Customer c) {
        c.setBayar(true);
    }

    public boolean isBayar(Customer c) {
        return c.isBayar();
    }
    public String toString(){
        String spc=" ";
        for (Customer t : daftarBook){
            spc = "\n"+t.toString();
        }return spc;
    }
    
}
