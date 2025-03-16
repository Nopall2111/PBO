package Mar_11st;

import java.util.Scanner;

public class KendaraanSewa {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        String jenis, merk, warna;
        int tahun, harga, speed;

        System.out.print("Masukkan Jenis Kendaraan: ");
        jenis = inn.nextLine();
        System.out.print("Masukkan Merkk Kendaraan: ");
        merk = inn.nextLine();
        System.out.print("Masukkan Warna Kendaraan: ");
        warna = inn.nextLine();
        System.out.print("Masukkan Tahun Keluarann: ");
        tahun = inn.nextInt();
        System.out.print("Harga Sewa Kendaraan: ");
        harga = inn.nextInt();
        System.out.print("Kecepatannya Berapa: ");
        speed = inn.nextInt();

        Kendaraan kend = new Kendaraan(jenis, merk, warna, tahun);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKecepatan(speed);
    }
}
