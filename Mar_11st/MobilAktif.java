package Mar_11st;

public class MobilAktif {
    public static void main(String[] args) {

        // Buat Objek Baru
        Mobil mobilmu = new Mobil();
        mobilmu.merk = "Toyota";
        mobilmu.plat = "BA 1234 LI";
        mobilmu.tahun = 2004;
        mobilmu.warna = "Hitam";
        
        Mobil mobilku = new Mobil();
        mobilku.merk = "GT-R";
        mobilku.plat = "BA 9699 SH";
        mobilku.tahun = 2015;
        mobilku.warna = "Putih";

        System.out.println("+---------------------------+");
        System.out.println("Data Mobil 1");
        System.out.println("Merk Mobil\t: "+mobilku.merk);
        System.out.println("Plat Mobil\t: "+mobilku.plat);
        System.out.println("Tahun Keluaran\t: "+mobilku.tahun);
        System.out.println("Warna Mobil\t: "+mobilku.warna);
        
        System.out.println("+----------------------------+");
        System.out.println("Data Mobil 2");
        System.out.println("Merk Mobil\t: "+mobilmu.merk);
        System.out.println("Plat Mobil\t: "+mobilmu.plat);
        System.out.println("Tahun Keluaran\t: "+mobilmu.tahun);
        System.out.println("Warna Mobil\t: "+mobilmu.warna);
        System.out.println("+----------------------------+");

        mobilku.MobilAktif();
        System.out.println(mobilku.SuaraMobil()); // Pemanggilan Method
        System.out.println();
    }
}
