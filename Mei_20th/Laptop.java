package Mei_20th;

public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop() {
        super(); 
    }

    public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM) {
        super(); 
        this.setMerek(merek);
        this.setTahunProduksi(tahunProduksi);
        this.setGaransi(garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }
    
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
    
    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }

    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek: "+super.getMerek());
        System.out.println("Tahun Produksi: "+super.getTahunProduksi());
        System.out.println("Garansi: "+super.getGaransi()+" tahun");
        System.out.println("Ukuran Layar: "+this.ukuranLayar+" inch");
        System.out.println("Kapasitas RAM: "+this.kapasitasRAM+" GB");
    }
}
