package Feb_20th;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String nama;
        int umur;
        char gen;
        float nilai;
        boolean asal;
        Scanner inn = new Scanner(System.in);

        System.out.println("== Input Data ==");
        System.out.print("Nama Anda : ");
        nama = inn.nextLine();
        System.out.print("Umur Anda : ");
        umur = inn.nextInt();
        System.out.print("Gender (L/P) : ");
        gen = inn.next().charAt(0);
        System.out.print("Rata2 Rapor  : ");
        nilai = inn.nextFloat();
        System.out.print("Asal Padang? (T/F) : ");
        asal = inn.nextBoolean();

        System.out.println("\n== Data Anda ==");
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur+" Tahun");
        System.out.println("Gender (L/P) : "+gen);
        System.out.println("Rata2 : "+nilai);
        if (asal)
            System.out.println("Anda berasal dari Padang.");
        else
            System.out.println("Anda tidak berasal dari Padang.");
    }
}
