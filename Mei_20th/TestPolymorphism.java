package Mei_20th;

public class TestPolymorphism {
    public static void main(String[] args) {
        // Objek biasa
        Elektronik b1 = new Elektronik();
        b1.setMerek("realme");
        b1.setTahunProduksi(2022);
        b1.setGaransi(3);
        b1.display();

        System.out.println();

        Smartwatch b2 = new Smartwatch();
        b2.setMerek("Xiaomi");
        b2.setTahunProduksi(2024);
        b2.setGaransi(2);
        b2.setKapasitasBaterai(1000);
        b2.setJumlahKamera(1);
        b2.setUkuranLayar(400);
        b2.isTahanAir(true);
        b2.display();

        System.out.println();

        // Polymorphism
        Elektronik b3 = new Laptop();
        b3.setMerek("Asus ROG");
        b3.setTahunProduksi(2023);
        b3.setGaransi(1);
        ((Laptop)b3).setUkuranLayar(14);
        ((Laptop)b3).setKapasitasRAM(32);
        ((Laptop)b3).display();
    }
}
