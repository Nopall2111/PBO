package Mar_11st;

public class Kendaraan {
    String jenis;
    String merk;
    String warna;
    int tahun;

    public Kendaraan(String j, String m, String w, int t){
        this.jenis = j;
        this.merk = m;
        this.warna = w;
        this.tahun = t;
    }

    public void InfoKendaraan(){
        System.out.println("Jenis Kendaraan: "+jenis);
        System.out.println("Merk Kendaraan: "+merk);
        System.out.println("Warna Kendaraan: "+warna);
        System.out.println("Tahun Keluaran: "+tahun);
    }

    public void CekHarga(int harga){
        System.out.println("Harga Sewa: "+harga);
    }

    public void CekKecepatan(int speed){
        if (speed >= 20 && speed <= 40) {
            System.out.println("Slow");
        } else if (speed < 60) {
            System.out.println("Normal");
        } else if (speed < 85) {
            System.out.println("Fast");
        } else if (speed <= 85) {
            System.out.println("Super");            
        } else {
            System.out.println("Lamban");
        }
    }
}
