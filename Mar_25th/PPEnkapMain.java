// Nama : Nauval Hilmi Hakim
// NO BP: 2401082011
// Desk : Persegi Panjang Enkapsulasi Main

package Mar_25th;

public class PPEnkapMain {
    public static void main(String[] args) {
        // Sebelum membuat objek
        System.out.println("Sebelum membuat objek");
        System.out.println("Jumlah objek = " + PPEnkap.getJumlahObjek());

        // Membuat objek pertama
        PPEnkap persegiPanjang1 = new PPEnkap();
        System.out.println("Luas Persegi Panjang 1 = " + persegiPanjang1.getPanjang() + " * " + persegiPanjang1.getLebar() + " = " + persegiPanjang1.getLuas());
        System.out.println("Jumlah objek = " + PPEnkap.getJumlahObjek());

        // Membuat objek kedua
        PPEnkap persegiPanjang2 = new PPEnkap(6, 7);
        System.out.println("Luas Persegi Panjang 2 = " + persegiPanjang2.getPanjang() + " * " + persegiPanjang2.getLebar() + " = " + persegiPanjang2.getLuas());
        System.out.println("Jumlah objek = " + PPEnkap.getJumlahObjek());

        // Membuat objek ketiga
        PPEnkap persegiPanjang3 = new PPEnkap(8, 5);
        System.out.println("Luas Persegi Panjang 3 = " + persegiPanjang3.getPanjang() + " * " + persegiPanjang3.getLebar() + " = " + persegiPanjang3.getLuas());
        System.out.println("Jumlah objek = " + PPEnkap.getJumlahObjek());
    }
}
