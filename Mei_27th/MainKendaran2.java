package Mei_27th;

import java.util.Scanner;

public class MainKendaran2 {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = inn.nextLine().toLowerCase();

        if (jenisKendaraan.equals("mobil")) {
            // Input untuk Mobil
            System.out.print("Masukkan merk mobil: ");
            String merkMobil = inn.nextLine();

            System.out.print("Masukkan tahun mobil: ");
            int tahunMobil = inn.nextInt();

            System.out.print("Masukkan jumlah pintu: ");
            int jmlPintu = inn.nextInt();

            System.out.print("Masukkan jenis transmisi: ");
            String transmisi = inn.next();

            Mobil mobil = new Mobil(merkMobil, tahunMobil, jmlPintu, transmisi);
            System.out.println();

            mobil.nyalakan();
            mobil.info();
            mobil.periksaKondisi();
            mobil.servis();
            mobil.matikan();

        } else if (jenisKendaraan.equals("motor")) {
            // Input untuk Motor
            System.out.print("Masukkan merk motor: ");
            String merkMotor = inn.nextLine();

            System.out.print("Masukkan tahun motor: ");
            int tahunMotor = inn.nextInt();

            System.out.print("Masukkan jumlah helm: ");
            String jmlHelm = inn.next();

            System.out.print("Masukkan CC: ");
            int CC = inn.nextInt();

            Motor motor = new Motor(merkMotor, tahunMotor, jmlHelm, CC);
            System.out.println();

            motor.nyalakan();
            motor.info();
            motor.periksaKondisi();
            motor.servis();
            motor.matikan();

        } else {
            System.out.println("Jenis kendaraan tidak dikenali.");
        }

        inn.close();
    }
}
