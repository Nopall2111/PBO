package Mei_20th;

public class MainElek {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===========================");
        Elektronik b1 = new Elektronik();
        b1.setMerek("Samsung");
        b1.setTahunProduksi(2025);
        b1.setGaransi(3);
        b1.display();
        System.out.println();
        
        Smartwatch b2 = new Smartwatch();
        b2.setMerek("Xiaomi");
        b2.setTahunProduksi(2023);
        b2.setGaransi(1);
        b2.setKapasitasBaterai(1000);
        b2.setJumlahKamera(1);
        b2.setUkuranLayar(2);
        b2.isTahanAir(true);
        b2.display();
        System.out.println();
        
        // Polymorphysm
        Elektronik b3 = new Laptop("HP", 2025, 2, 14, 32);
        b3.display();
        System.out.println();
        
        Smartphone b4 = new Smartwatch("Apple", 2025, 3, 150, 1, 2, true);
        b4.display();
        System.out.println("===========================");
        System.out.println();
    }
}
