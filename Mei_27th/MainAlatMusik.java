package Mei_27th;

public class MainAlatMusik {
    public static void main(String[] args) {
        // membuat objek dari class Gitar
        Gitar gitar = new Gitar("Gitar Klasik", "Petik", 6);
        // membuat objek dari class Piano
        Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);

        System.out.println();
        
        System.out.println("--- Info Gitar ---");
        gitar.info();
        gitar.mainkan();
        gitar.stem();

        System.out.println();

        System.out.println("--- Info Keyboard ---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();

    }
}
