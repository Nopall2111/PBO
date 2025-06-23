package Mei_27th.Beli;

public class MainBeli {
    public static void main(String[] args) {
        // Skenario Pembelian
        String namaPembeli = "Andi";
        String[] barang = {"Smartphone", "Headphone"};

        System.out.println();
        
        System.out.println("Pembeli: " + namaPembeli);
        System.out.println("Barang yang dibeli: ");
        for (String item : barang) {
            System.out.println("- " + item);
        }
        
        // Memilih metode pembayaran
        System.out.println("\nPilih metode pembayaran:");
        Pembayaran pembayaran1 = new Transfer(namaPembeli, "Bank Mandiri");
        Pembayaran pembayaran2 = new EWallet(namaPembeli, "GoPay");
        Pembayaran pembayaran3 = new KartuKredit(namaPembeli, "1234-5678-9012-3456");

        // Simulasi pemilihan metode pembayaran
        String metodeDipilih = "E-Wallet"; // Misalnya Andi memilih E-Wallet

        switch (metodeDipilih) {
            case "Transfer":
                pembayaran1.prosesPembayaran();
                break;
            case "E-Wallet":
                pembayaran2.prosesPembayaran();
                break;
            case "Kartu Kredit":
                pembayaran3.prosesPembayaran();
                break;
            default:
                System.out.println("Metode pembayaran tidak valid.");
        }

        System.out.println();
    }
}
