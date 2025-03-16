package Mar_04th;

import java.util.Scanner;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int n, i, banyak=0, jumlah=0;
        int[] A;
        Scanner inn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukkan Banyak Data: ");
        n = inn.nextInt();
        A = new int[n];
        System.out.println("== Data Anda ==");

        for(i = 0; i < n; i++){
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println();

        System.out.print("Genap:  ");
        for(i = 0; i < n; i++){
            if (A[i] % 2 == 0) {
                System.out.print(A[i]+"\t");
                banyak+= 1;
                jumlah+= A[i];
            }
        }
        System.out.println("\nBanyak Genap: "+banyak);
        System.out.println("Jumlah: "+jumlah);
    }
}
