package Mar_18th;

public class VehicleTest {
    public static void main(String[] args) {
        // Buat vehicle dengan beban maksimal 10000kg
        System.out.println("Kendaraan 1. Beban maksimal 10.000kg");
        Vehicle kendaraan1 = new Vehicle(10000);

        // Menambahkan beberapa beban
        System.out.println("Menaambahkan beban 1 (500kg)");
        kendaraan1.load = kendaraan1.load + 500;
        System.out.println("Menaambahkan beban 2 (250kg)");
        kendaraan1.load = kendaraan1.load + 250;
        System.out.println("Menaambahkan beban 3 (5000kg)");
        kendaraan1.load = kendaraan1.load + 5000;
        System.out.println("Menaambahkan beban 4 (4000kg)");
        kendaraan1.load = kendaraan1.load + 4000;
        System.out.println("Menaambahkan beban 5 (350kg)");
        kendaraan1.load = kendaraan1.load + 350;

        // Menampilkan total beban
        System.out.println("Beban kendaraan saat ini =  "+kendaraan1.getLoad()+"kg");
    }
}
