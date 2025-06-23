package Mei_27th;

public class Mobil extends Kendaraan {
    private int jmlPintu;
    private String transmisi;

    public Mobil(String merk, int tahun, int jmlPintu, String transmisi) {
        super(merk, tahun);
        this.jmlPintu = jmlPintu;
        this.transmisi = transmisi;
    }

    public int getJmlPintu() {
        return jmlPintu;
    }

    public void setJmlPintu(int jmlPintu) {
        this.jmlPintu = jmlPintu;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    @Override
    public void nyalakan(){
        System.out.println("Mobil "+merk+" dinyalakan");
    }

    @Override
    public void matikan(){
        System.out.println("Mobil "+merk+" dimatikan");
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + merk + ", Tahun: " + tahun + ", Jumlah Pintu: " + jmlPintu
                + ", Transmisi: " + transmisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa oli, rem, dan tekanan ban mobil");
    }

    @Override
    public void servis() {
        System.out.println("Servis mobil.");
    }
}
