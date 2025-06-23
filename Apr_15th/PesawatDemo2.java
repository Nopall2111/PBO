package Apr_15th;

public class PesawatDemo2 {
    public static void main(String[] args) {
        Pesawat[] daftarPesawat = new Pesawat[3];

        daftarPesawat[0] = new Pesawat("Lion Air", 2015, true, 80);
        daftarPesawat[1] = new Pesawat("Air Asia", 2018, false, 120);
        daftarPesawat[2] = new Pesawat("Garuda", 2020, true, 180);
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            System.out.println("Data Pesawat ke " + (i+1) + ":");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
}
