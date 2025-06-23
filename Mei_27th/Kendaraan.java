package Mei_27th;

public abstract class Kendaraan {
    protected String merk;
    protected int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void nyalakan() {
    }

    public void matikan() {
    }

    public abstract void info();
    public abstract void periksaKondisi();
    public abstract void servis();
}
