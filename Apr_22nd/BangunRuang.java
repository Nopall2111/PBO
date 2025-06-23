package Apr_22nd;

import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        double rLing;
        double rKer, tKer;
        double rSil, tSil;
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        rLing = inn.nextDouble();
        Lingkaran ling = new Lingkaran(rLing);

        System.out.println();

        System.out.print("Masukkan Jari-jari Kerucut: ");
        rKer = inn.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut: ");
        tKer = inn.nextDouble();
        Kerucut ker = new Kerucut(rKer, tKer);

        System.out.println();

        System.out.print("Masukkan Jari-jari Silinder: ");
        rSil = inn.nextDouble();
        System.out.print("Masukkan Tinggi Silinder: ");
        tSil = inn.nextDouble();
        Silinder sil = new Silinder(rSil, tSil);

        inn.close();
        
        System.out.println("==============================");
        System.out.println("Hasil Lingkaran: ");
        System.out.println(ling);

        System.out.println();

        System.out.println("Hasil Kerucut:");
        System.out.println(ker);
        
        System.out.println();
        
        System.out.println("Hasil Silinder:");
        System.out.println(sil);
        System.out.println("==============================\n");
    }
}
