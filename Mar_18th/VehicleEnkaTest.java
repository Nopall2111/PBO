package Mar_18th;

import java.util.Scanner;

public class VehicleEnkaTest {
    public static void main(String[] args) {
        System.out.println("Kendaraan 1. Beban Maks 10.000kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);

        System.out.println("Menambahkan beban 1 (500kg)"+ kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250kg)"+ kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000kg)"+ kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000kg)"+ kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350kg)"+ kendaraan1.addLoad(350));

        System.out.println("Beban kendaraan 1 saat ini = "+kendaraan1.getLoad()+"kg");

        System.out.println("-------------------------------------------------------");
        // ----------------------------------------------------------------------------------//
        Scanner inn = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban maks belum ada.");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();

        System.out.print("Masukkan beban maksimal kendaraan: ");
        double bebanmax = inn.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        System.out.println();

        System.out.print("Masukkan berat beban yang akan diletakkan di kendaraan 2: ");
        double beban = inn.nextDouble();

        while (kendaraan2.addLoad(beban)) {
            System.out.println("Beban ditambahkan "+beban+"kg");
            System.out.print("Masukkan berat beban yang akan ditambahkan di kendaraan 2: ");
            beban = inn.nextDouble();
        }

        if (!kendaraan2.addLoad(beban)) {
            System.out.println("Beban kendaraan saat ini = "+kendaraan2.getLoad()+"kg");
            System.out.println("Penambahan melebihi batas");
        } else 
            System.out.print("Beban kendaraan saaat ini = "+kendaraan2.getLoad()+"kg");
    }
}
