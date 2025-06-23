package Mei_20th;

public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;

    public Gaming() {
        super();
    }

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public void display(){
        System.out.println("Kelas Gaming");
        System.out.println("Merek: "+super.getMerek());
        System.out.println("Tahun Produksi: "+super.getTahunProduksi());
        System.out.println("Garansi: "+super.getGaransi()+" tahun");
        System.out.println("Ukuran Layar: "+super.getUkuranLayar()+" inch");
        System.out.println("Kapasitas RAM: "+super.getKapasitasRAM()+" GB");
        System.out.println("Kartu Grafis: "+this.kartuGrafis);
        System.out.println("Refresh Rate: "+this.refreshRate+" Hz");
    }
}
