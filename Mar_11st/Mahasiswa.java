package Mar_11st;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan Nama: ");
        String nama = inn.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = inn.nextLine();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = inn.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = inn.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = inn.nextDouble();
        System.out.print("Masukkan Nilai Quiz: ");
        double quiz = inn.nextDouble();

        Mahasigmaa mhs = new Mahasigmaa(nama, nim, tugas, uts, uas, quiz);
        System.out.println("\n== Data Mahasiswa ==");
        mhs.dataMahs();
        System.out.println();
    }
}
