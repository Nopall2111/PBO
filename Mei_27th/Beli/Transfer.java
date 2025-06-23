package Mei_27th.Beli;

public class Transfer extends MetodePembayaran {
    private String namaBank;

    public Transfer(String nama, String namaBank) {
        super(nama);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran oleh " + nama + " melalui transfer bank " + namaBank + " berhasil.");
    }
}
