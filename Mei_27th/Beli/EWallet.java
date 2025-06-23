package Mei_27th.Beli;

public class EWallet extends MetodePembayaran {
    private String namaEWallet;

    public EWallet(String nama, String namaEWallet) {
        super(nama);
        this.namaEWallet = namaEWallet;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran oleh " + nama + " menggunakan e-wallet " + namaEWallet + " berhasil.");
    }
}
