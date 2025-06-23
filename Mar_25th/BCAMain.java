// Nama : Nauval Hilmi Hakim
// NO BP: 2401082011
// Desk : BANK part 1 

package Mar_25th;

public class BCAMain {
    public static void main(String[] args) {
        // Buat objek dari class Nasabah dengan konstruktor (String, String) dan Tabungan(int)
        System.out.println();
        System.out.println("---------------------------------------------------");
        Nasabah nasabah1 = new Nasabah("Ramzi", "Yusderindra");
        Tabungan tabungan1 = new Tabungan(5000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Farrel", "Aurellio");
        Tabungan tabungan2 = new Tabungan(6000);
        nasabah2.setTabungan(tabungan2);

        // Tampilkan setiap objek dengan fungsi toString()
        System.out.println(nasabah1.toString());
        System.out.println(nasabah2.toString());

        System.out.println("---------------------------------------------------");
        
        // Objek menabung atau mengambil
        nasabah1.getTabungan().simpanUang(4000); // menabung 4000
        System.out.println("Saldo nacabah 1 setelah menabung +Rp4.000: Rp" + nasabah1.getTabungan().getSaldo());
        
        nasabah2.getTabungan().simpanUang(7000); // menabung 7000
        System.out.println("Saldo nasabah 2 setelah menabung +Rp7.000: Rp" + nasabah2.getTabungan().getSaldo());
        
        nasabah1.getTabungan().ambilUang(5000); // mengambil 5000
        System.out.println("Saldo nacabah 1 setelah mengambil -Rp5.000: Rp" + nasabah1.getTabungan().getSaldo());
        
        nasabah2.getTabungan().ambilUang(6000); // mengambil 6000
        System.out.println("Saldo nasabah 2 setelah mengambil -Rp6.000: Rp" + nasabah2.getTabungan().getSaldo());
        
        nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000); // Transfer ke nasabah 1 sebesar 1000
        
        // Tampilkan saldo akhir dari masing-masing nasabah
        System.out.println("===================================================");
        System.out.println("Saldo akhir nacabah 1: Rp" + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir nasabah 2: Rp" + nasabah2.getTabungan().getSaldo());
        System.out.println("===================================================");
        System.out.println();
    }
}
