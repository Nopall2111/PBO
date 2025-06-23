package Mei_27th;

public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("AE86", 1990, 4, "Manual");
        Motor motor = new Motor("Yamaha NMAX", 2023, "Fullface", 300);
    
        System.out.println();

        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();

        System.out.println();

        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
        
        System.out.println();
    }
}
