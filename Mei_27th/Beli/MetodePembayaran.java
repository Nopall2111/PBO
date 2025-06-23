package Mei_27th.Beli;

public abstract class MetodePembayaran implements Pembayaran {
    protected String nama;

    public MetodePembayaran(String nama) {
        this.nama = nama;
    }

    public abstract void prosesPembayaran();
}
