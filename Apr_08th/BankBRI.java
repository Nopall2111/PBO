package Apr_08th;

import java.util.Scanner;

public class BankBRI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
        
        // Input untuk menabung
        System.out.print("Masukkan jumlah uang yang akan ditabung oleh Ramzi: ");
        int tabung1 = scanner.nextInt();
        nasabah1.getTabungan().simpanUang(tabung1);
        System.out.println("Saldo nasabah 1 setelah menabung +Rp" + tabung1 + ": Rp" + nasabah1.getTabungan().getSaldo());
        
        System.out.print("Masukkan jumlah uang yang akan ditabung oleh Farrel: ");
        int tabung2 = scanner.nextInt();
        nasabah2.getTabungan().simpanUang(tabung2);
        System.out.println("Saldo nasabah 2 setelah menabung +Rp" + tabung2 + ": Rp" + nasabah2.getTabungan().getSaldo());
        
        // Input untuk menarik uang
        System.out.print("Masukkan jumlah uang yang akan ditarik oleh Ramzi: ");
        int tarik1 = scanner.nextInt();
        boolean success1 = nasabah1.getTabungan().ambilUang(tarik1);
        if (success1) {
            System.out.println("Saldo nasabah 1 setelah menarik -Rp" + tarik1 + ": Rp" + nasabah1.getTabungan().getSaldo());
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi.");
        }
        
        System.out.print("Masukkan jumlah uang yang akan ditarik oleh Farrel: ");
        int tarik2 = scanner.nextInt();
        boolean success2 = nasabah2.getTabungan().ambilUang(tarik2);
        if (success2) {
            System.out.println("Saldo nasabah 2 setelah menarik -Rp" + tarik2 + ": Rp" + nasabah2.getTabungan().getSaldo());
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi.");
        }
        
        // Input untuk transfer
        System.out.print("Masukkan jumlah uang yang akan ditransfer dari Farrel ke Ramzi: ");
        int transferAmount = scanner.nextInt();
        boolean transferSuccess = nasabah2.getTabungan().transfer(nasabah1.getTabungan(), transferAmount);
        if (transferSuccess) {
            System.out.println("Transfer berhasil!");
        } else {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
        }
        
        // Tampilkan saldo akhir dari masing-masing nasabah
        System.out.println("===================================================");
        System.out.println("Saldo akhir nasabah 1: Rp" + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir nasabah 2: Rp" + nasabah2.getTabungan().getSaldo());
        System.out.println("===================================================");
        
        scanner.close();
    }
}