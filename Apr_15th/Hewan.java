package Apr_15th;

public class Hewan {
    protected String nama;

    public Hewan(String nama){
        this.nama = nama;
    }

    public void Suara(){
        System.out.println("Suara Hewan...");
    }

    public void tampilkanNama(){
        System.out.println("Nama Hewan: "+ nama);
    }
}
