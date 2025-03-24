package Mar_18th;

public class PersegiPanjangTest {
    public static void main(String[] args) {
        System.out.println("Banyak objek Awal: "+PersegiPanjang.getJumlahObjek());

        // Buat objek pertama
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        
        System.out.println("Banyak objek setelah PP1: "+PersegiPanjang.getJumlahObjek());
        System.out.println("Luas -> "+PP1.panjang+" * "+PP1.lebar+" = "+PP1.getLuas());
        
        // Buat objek kedua
        PersegiPanjang PP2 = new PersegiPanjang(15, 4);
        System.out.println("Banyak objek setelah PP1: "+PersegiPanjang.getJumlahObjek());
        System.out.println("Kelilng -> 2 * ("+PP2.panjang+" + "+PP2.lebar+") = "+PP2.getKeliling());
        

    }
}
