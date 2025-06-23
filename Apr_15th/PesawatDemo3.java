package Apr_15th;

import java.util.Scanner;

public class PesawatDemo3 {

    public static int max(int a, int b){
        if (a>b)
            return b;
        else
            return a;
    }

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);

        int i, jumlah, tahunProduksi, muatan;
        String nama;
        Boolean mesin;
        int besar;
        String namaMax;

        System.out.println();
        System.out.print("Masukkan banyak pesawat: ");
        jumlah = inn.nextInt();
        inn.nextLine();
        System.out.println("--------------------------");
        
        inn.close();
        
        Pesawat[] dafPesawats = new Pesawat[jumlah];
        
        for (i=0; i<jumlah; i++){
            System.out.println("Masukkan nama pesawat ke-" + (i+1));
            System.out.print("Nama Pesawat: ");
            nama = inn.nextLine();
            System.out.print("Tahun Produksi: ");
            tahunProduksi = inn.nextInt();
            System.out.print("Menggunakan Mesin(T/F): ");
            mesin = inn.nextBoolean();
            System.out.print("Muatan penumpang: ");
            muatan = inn.nextInt();
            
            inn.nextLine();
            
            dafPesawats[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
            System.out.println("--------------------------");
        }

        System.out.println();
        System.out.println("Data Pesawat");
        System.out.println("------------");

        dafPesawats[0].cetak();
        System.out.println();
        besar = dafPesawats[0].getMuatan();
        namaMax = dafPesawats[0].getNama();

        for(i=1; i<jumlah; i++){
            System.out.println();
            System.out.println("Data Pesawat ke " + (i+1) + ":");
            dafPesawats[i].cetak();
            if (dafPesawats[i].getMuatan()>besar){
                besar = dafPesawats[i].getMuatan();
                namaMax = dafPesawats[i].getNama();
            }
            System.out.println();
        }

        System.out.println("Pesawat dengan muatan terbanyak adalah " + namaMax);
        System.out.println("Dengan kapasitas maksimum: " + besar + " penumpang");

    }
}
