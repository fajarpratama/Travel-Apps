/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestravel;


import java.util.Scanner;

/**
 *
 * @author AlfajriAkbar
 */
public class TubesTravel {

    Scanner input = new Scanner(System.in);
    Scanner inputA = new Scanner(System.in);
    Scanner inputC = new Scanner(System.in);
    Scanner inputif = new Scanner(System.in);
    Scanner inputsi = new Scanner(System.in);

    DaftarPaket dt = new DaftarPaket();
    DaftarTempatWisata dtw = new DaftarTempatWisata();
    DaftarCustomer dc = new DaftarCustomer();
    DaftarBook db = new DaftarBook();

    public int menuUser() {
        System.out.println("1.Admin");
        System.out.println("2.Customer");
        System.out.println("3.Exit");
        System.out.println("Pilih User : ");
        int pil = input.nextInt();
        return pil;
    }


    public int menuAdmin(){
        System.out.println("1.Set Paket Travel");
        System.out.println("2.Remove Paket Travel");
        System.out.println("3.View Daftar Paket Travel");
        System.out.println("4.Logout");
        int pil = inputA.nextInt();
        return pil;
        
    }

    public int menuCustomer() {
        System.out.println("1.View Daftar Paket Travel");
        System.out.println("2.Buat akun");
        System.out.println("3.Login");
        int pil = inputC.nextInt();
        return pil;
    }

    public void addPaket(Travel t, Customer c, TempatWisata tw) {
        System.out.println("Nama Paket: ");
        String nama = input.nextLine();
        System.out.println("Harga Paket: ");
        int harga = input.nextInt();
        System.out.println("Depature: ");
        String depature = input.nextLine();
        System.out.println("Return: ");
        String back = input.nextLine();
        System.out.println("Jumlah kuota: ");
        int maxP = input.nextInt();
        System.out.println("Fasilitas: ");
        String dFasilitas = input.nextLine();

        t = new Travel(nama, harga, depature, depature, maxP, dFasilitas);
        dt.addPaket(t);

        addTempat(tw);

    }

    public void removePaket(Travel t, Customer c, TempatWisata tw) {
        System.out.println("Nama Paket : ");
        String nama = input.nextLine();
        t = dt.findPaketWithNama(nama);
        if (t != null) {
            dt.removePaket(t);
            System.out.println("Berhasil dihapus.");
        } else {
            System.out.println("Paket tidak ada.");
        }

    }

    public void addTempat(TempatWisata tw) {
        System.out.println("Nama Tempat: ");
        String nama = input.nextLine();
        System.out.println("Info: ");
        String info = input.nextLine();

        tw = new TempatWisata(nama, info);
        dtw.addTempatWisata(tw);

        System.out.println("");
        System.out.println("Ingin menambahkan tempat lagi? (y/n)");
        String y = input.nextLine();
        if (y.equals("y")) {
            addTempat(tw);
        }
    }

    public int menuAfterLogin() {
        System.out.println("1.View Daftar Paket Travel");
        System.out.println("2.Booking Paket Travel");
        System.out.println("3.Logout");
        int pil = inputC.nextInt();
        return pil;
    }
    public void bookPaket(Travel t, Customer c, TempatWisata tw){
        System.out.println("Masukkan jumlah orang: ");
        int n = input.nextInt();
        int i=1;
        while(i!=n){
            System.out.println("Nama peserta ke-"+i+" :");
            String nama = input.nextLine();
            System.out.println("Id :");
            String id =input.nextLine();
            c = new Customer(nama, id);
            db.addCustomer(c);
            i++;
        }
        System.out.println("Jumlah yang harus anda bayar adalah: ");
        int tot = (int) (i*t.getHargaPaket());
        System.out.println("Rp"+tot+",00");
    }

    public void Login(Customer customer, Travel travel, TempatWisata tempatwisata) {
        System.out.print("Username: ");
        String un = inputC.nextLine();
        System.out.println("Password: ");
        String pass = inputC.nextLine();
        Customer c = dc.findCustomer(un, pass);
        if (c != null) {
            int menuAfterLogin = menuAfterLogin();
        } else {
            Login(customer, travel, tempatwisata);
        }
    }

    public void addCustomer(Customer customer, Travel travel, TempatWisata tempatwisata) {
        System.out.println("Masukkan Nama Lengkap : ");
        String name = inputC.nextLine();
        System.out.println("Masukkan No KTP : ");
        String id = inputC.nextLine();
        System.out.println("Masukkan Username Baru : ");
        String un = inputC.nextLine();

        konfirmasiPass(name, id, un);

    }

    public void konfirmasiPass(String name, String id, String un) {
        Customer cus;

        System.out.println("Masukkan Password : ");
        String pass = inputif.nextLine();
        System.out.println("Confirmasi Password : ");
        String conpass = inputsi.nextLine();
        if (pass.equals(conpass)) {
            System.out.println("Nama Customer : " + name);
            System.out.println("Username : " + un);
            System.out.println("Apakah anda yakin ? (y/n)");
            String yakin = inputC.nextLine();
            if (yakin.equals("y")) {
                cus = new Customer(name, id, un, pass);
                System.out.println("Customer Berhasil Ditambahkan");
                dc.addCustomer(cus);
                System.out.println("Customer Bertambah");
            } else {
                menuCustomer();
            }
        } else {
            System.out.println("Password tidak match.");
            konfirmasiPass(name, id, un);
        }
    }
    
    public void mulai(Travel t, Customer c, TempatWisata tw){
        int pil0=0;
        int pil1=0;
        int pil2=0;
        int pil3=0;
        pil0 = menuUser();
        while(pil0<4){
            if(pil0==1){
                System.out.println("Masukkan Password Admin: ");
                String psswrdPetugas = input.nextLine();
                String a = input.nextLine();
                if(!a.equals("admin")){
                    menuUser();
                }else{
                    System.out.println("Selamat datang dimenu admin:");
                    pil1=menuAdmin();
                    switch(pil1){
                        case 1: 
                            addPaket(t, c, tw);
                            System.out.println("Berhasil Menambahkan");
                            break;
                        case 2:
                            removePaket(t, c, tw);
                            System.out.println("Berhasil dihapus");
                            break;
                        case 3:
                            t.toString();
                            break;
                        case 4:
                            menuUser();
                        default:
                            menuAdmin();
                    }
                }
            }else if(pil0==2){
                pil1=menuCustomer();
                if(pil1==1){
                    t.toString();
                }else if(pil1==2){
                    addCustomer(c, t, tw);
                    System.out.println("Selamat anda sekarang telah menjdai member!!!");
                    pil2=menuAfterLogin();
                    if(pil2==1){
                        t.toString();
                    }
                    else if(pil2==2){
                        bookPaket(t, c, tw);
                    }
                    else if(pil2==3){
                        menuUser();
                    }
                    else{
                        menuCustomer();
                    }
                }
            }else if(pil0==3){
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        
        System.out.println("|-----------------Selamat Datang------------------|");
        System.out.println("|====Kenyamanan Perjalanan Anda Kewajiban Kami====|");
        System.out.println("|                  Travel 3703                    |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|                 Fajar Pratama                   |");
        System.out.println("|             Andi Muh. Akbar Alfajri             |");
        System.out.println("|                  Fitra Ilham                    |");
        System.out.println("|                Nurmala Apriliani                |");
        System.out.println("|-------------------------------------------------|");
        Travel t = new Travel();
        Customer c = new Customer();
        TempatWisata tw = new TempatWisata();
        TubesTravel tub = new TubesTravel();
        tub.mulai(t, c, tw);
    }

}
