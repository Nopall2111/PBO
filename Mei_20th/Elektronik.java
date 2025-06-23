package Mei_20th;

public class Elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;
    
    public Elektronik() {
        
    }
    
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    public void display(){
        System.out.println("Kelas Elektronik");
        System.out.println("Merek: "+this.merek);
        System.out.println("Tahun Produksi: "+this.tahunProduksi);
        System.out.println("Garansi: "+this.garansi+" tahun");
    }
}
