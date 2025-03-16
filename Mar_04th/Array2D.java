package Mar_04th;

import java.util.Scanner;
import java.util.Random;

public class Array2D {
    public static void main(String[] args) {
        int M[][], N[][], O[][], b, k, bb, kk;
        int i, j;
        Scanner inn = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.print("Masukkan jumlah Baris M1: ");
        b = inn.nextInt();
        System.out.print("Masukkan jumlah Kolom M1: ");
        k = inn.nextInt();
        System.out.print("Masukkan Baris M2: ");
        bb = inn.nextInt();
        System.out.print("Masukkan Kolom M2: ");
        kk = inn.nextInt();

        if (b == bb & k == kk) {
            M = new int[b][k];
            System.out.println("== Matriks 1 ==");
            for(i=0;i<b;i++){
                for(j=0;j<k;j++){
                    M[i][j] = ran.nextInt(100)+1;
                    System.out.print(M[i][j]+"\t");
                }
                System.out.println();
            }
            
            N = new int[bb][kk];
            System.out.println("== Matriks 2 ==");
            for(i=0;i<bb;i++){
                for(j=0;j<kk;j++){
                N[i][j] = ran.nextInt(100)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println();
        }
        
        O = new int[b][k];
        System.err.println("== Penjumlahan Matriks (+) ==");
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                O[i][j] = M[i][j] + N[i][j];
                System.out.print(O[i][j]+"\t");
            }
            System.out.println();
        }
        } else {
            System.out.println("Blokk");
        }
    }
}
