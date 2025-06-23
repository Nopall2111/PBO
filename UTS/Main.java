package UTS;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Membuat objek Mobil
        Mobil mobil = new Mobil();
        mobil.setJmlRoda(4);
        mobil.setWarna("Merah");
        mobil.setBahanBakar("Bensin");
        mobil.setKapasitasMesin(1500);

        // Membuat objek Sepeda
        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(2);
        sepeda.setWarna("Biru");
        sepeda.setJmlSadel("1");
        sepeda.setJmlGir(21);

        // Membuat objek Sepeda Listrik
        SepedaListrik sepedaListrik = new SepedaListrik();
        sepedaListrik.setJmlRoda(2);
        sepedaListrik.setWarna("Hijau");
        sepedaListrik.setJmlSadel("1");
        sepedaListrik.setJmlGir(7);
        sepedaListrik.setKecepatanMaks(25);
        sepedaListrik.setJarakTempuh(50);

        // Membuat objek Taksi
        Taksi taksi = new Taksi();
        taksi.setJmlRoda(4);
        taksi.setWarna("Kuning");
        taksi.setBahanBakar("Solar");
        taksi.setKapasitasMesin(1800);
        taksi.setTarifAwal(5000);
        taksi.setTarifPerKM(3000);

        // Membuat objek Truk
        Truk truk = new Truk();
        truk.setJmlRoda(6);
        truk.setWarna("Putih");
        truk.setBahanBakar("Bensin");
        truk.setKapasitasMesin(3000);
        truk.setMuatanMaks(10000);

        // Menampilkan informasi kendaraan
        System.out.println("Informasi Kendaraan:");
        System.out.println("---------------------");
        System.out.println("Mobil: ");
        System.out.println("Jumlah Roda: " + mobil.getJmlRoda());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");
        System.out.println();

        System.out.println("Sepeda: ");
        System.out.println("Jumlah Roda: " + sepeda.getJmlRoda());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Jumlah Sadle: " + sepeda.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda.getJmlGir());
        System.out.println();

        System.out.println("Sepeda Listrik: ");
        System.out.println("Jumlah Roda: " + sepedaListrik.getJmlRoda());
        System.out.println("Warna: " + sepedaListrik.getWarna());
        System.out.println("Jumlah Sadle: " + sepedaListrik.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepedaListrik.getJmlGir());
        System.out.println("Kecepatan Maks: " + sepedaListrik.getKecepatanMaks() + " km/h");
        System.out.println("Jarak Tempuh: " + sepedaListrik.getJarakTempuh() + " km");
        System.out.println();

        System.out.println("Taksi: ");
        System.out.println("Jumlah Roda: " + taksi.getJmlRoda());
        System.out.println("Warna: " + taksi.getWarna());
        System.out.println("Bahan Bakar: " + taksi.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + taksi.getKapasitasMesin() + " cc");
        System.out.println("Tarif Awal: " + taksi.getTarifAwal() + " IDR");
        System.out.println("Tarif per KM: " + taksi.getTarifPerKM() + " IDR");
        System.out.println();

        System.out.println("Truk: ");
        System.out.println("Jumlah Roda: " + truk.getJmlRoda());
        System.out.println("Warna: " + truk.getWarna());
        System.out.println("Bahan Bakar: " + truk.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + truk.getKapasitasMesin() + " cc");
        System.out.println("Muatan Maks: " + truk.getMuatanMaks() + " kg");
    }
}
