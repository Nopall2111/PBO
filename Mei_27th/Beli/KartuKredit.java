package Mei_27th.Beli;

public class KartuKredit extends MetodePembayaran {
    private String noKredit;

    public KartuKredit(String nama, String noKredit) {
        super(nama);
        this.noKredit = noKredit;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran oleh " + nama + " menggunakan kartu kredit dengan nomor " + noKredit + " berhasil.");
    }
}
