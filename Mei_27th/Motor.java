package Mei_27th;

public class Motor extends Kendaraan {
    private String jenisHelm;
    private int CC;

    public Motor(String merk, int tahun, String jenisHelm, int CC) {
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.CC = CC;
    }

    public String getJenisHelm() {
        return jenisHelm;
    }

    public void setJenisHelm(String jenisHelm) {
        this.jenisHelm = jenisHelm;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    @Override
    public void nyalakan(){
        System.out.println("Motor "+merk+" dinyalakan");
    }

    @Override
    public void matikan(){
        System.out.println("Motor "+merk+" dimatikan");
    }

    @Override
    public void info() {
        System.out.println(
                "Motor: " + merk + ", Tahun: " + tahun + ", Jenis Helm: " + jenisHelm + ", CC: " + CC);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Memeriksa kondisi motor.");
    }

    @Override
    public void servis() {
        System.out.println("Servis motor.");
    }
}
