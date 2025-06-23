package Mei_20th;

public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone() {
        super(); 
    }
    
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }

    @Override
    public void display(){
        System.out.println("Kelas Smartphone");
        System.out.println("Merek: "+super.getMerek());
        System.out.println("Tahun Produksi: "+super.getTahunProduksi());
        System.out.println("Garansi: "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai: "+this.kapasitasBaterai+" mAh");
        System.out.println("Jumlah Kamera: "+this.jumlahKamera);
    } 
}
