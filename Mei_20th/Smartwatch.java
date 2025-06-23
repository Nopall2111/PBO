package Mei_20th;

public class Smartwatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;

    public Smartwatch() {
        super();
    }

    public Smartwatch(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera, int ukuranLayar, boolean tahanAir) {
        super();
        this.setMerek(merek);
        this.setTahunProduksi(tahunProduksi);
        this.setGaransi(garansi);
        this.setKapasitasBaterai(kapasitasBaterai);
        this.setJumlahKamera(jumlahKamera);
        this.setUkuranLayar(ukuranLayar);
        this.isTahanAir(tahanAir);
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public boolean getTahanAir() {
        return tahanAir;
    }

    public void isTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    @Override
    public void display(){
        System.out.println("Kelas Smartwatch");
        System.out.println("Merek: "+super.getMerek());
        System.out.println("Tahun Produksi: "+super.getTahunProduksi());
        System.out.println("Garansi: "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai: "+super.getKapasitasBaterai()+" mAh");
        System.out.println("Jumlah Kamera: "+super.getJumlahKamera());
        System.out.println("Ukuran Layar: "+this.ukuranLayar+" inch");
        System.out.println("Tahan Air: "+this.tahanAir);
    }
}
