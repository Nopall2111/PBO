package Apr_15th;

import java.util.Scanner;

public class HewanDemo {
    public static void main(String[] args) {

        Scanner inn = new Scanner(System.in);

        // Buat objek
        Hewan hewanumum = new Hewan("Makhluk Hidup");
        Kucing kucingku = new Kucing("Bobby");
        Anjing anjingku = new Anjing("Timmy");

        System.out.println();

        hewanumum.tampilkanNama();
        hewanumum.Suara();

        System.out.println();
        
        kucingku.tampilkanNama();
        kucingku.Suara();

        System.out.println();

        anjingku.tampilkanNama();
        anjingku.Suara();

        System.out.println();
        
        inn.close();
    }
}
