package Feb_20th;

import java.util.Scanner;

public class TicketBus {
    public static void main(String[] args){
        int menu, jumlah = 0;
        long harga, total;
        float diskon = 0, akhir;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("+---------------+-----------------+");
        System.out.println("|     KELAS     |    HARGA/TIKET  |");
        System.out.println("+---------------+-----------------+");
        System.out.println("|   1. EKONOMI  |   Rp350.000,00  |");
        System.out.println("|   2. EKSE     |   Rp500.000,00  |");
        System.out.println("|   3. SUPER    |   Rp650.000,00  |");
        System.out.println("+---------------------------------+");
        System.out.print("\nPilih Tiker (1/2/3) : ");
        menu = in.nextInt();
        System.out.print("Jumlah Tiket : ");
        jumlah = in.nextInt();
        
        switch(menu) {
            case 1: {
                harga = 350000;
            }break;
            case 2: {
                harga = 500000;
            }break;
            case 3: {
                harga = 650000;
            }break;
            default: {
                harga = 0;
                System.out.println("Kelas tidak tesedia");
            }break;
        }
        
        total = harga * jumlah;
        
        if (jumlah > 4){
            System.out.println("DISKON!!!");
            diskon = (float) (0.1 * total);
        } else {
            diskon = 0;
        }
        
        akhir = total - diskon;
        System.out.println("Biaya Awal : "+total);
        System.out.println("Diskon     : "+diskon);
        System.out.println("Bayaran    : "+akhir);
    }
}
