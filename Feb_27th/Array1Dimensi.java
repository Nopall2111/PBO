package Feb_27th;

import java.util.Scanner;

public class Array1Dimensi {
    public static void main(String[] args) {
        int A[], i, n;

        Scanner inn = new Scanner(System.in);
        System.out.print("Masukkan banyak data: ");
        n = inn.nextInt(); // input banyak data
        A = new int[n]; // membuat array dengan banyak data n
        
        for(i = 0; i < n; i++){
            System.out.print("A["+i+"] = ");
            A[i] = inn.nextInt(); // input data ke array
        }
        
        // Menghitung jumlah dan rata rata Array
        int jumlah = 0;
        for (i = 0; i < n; i++){
            jumlah += A[i];
        }
        
        float rata = (float) jumlah / n;
        for (i = 0; i < n; i++){
            System.out.println("A["+i+"] = "+A[i]);
        }
        // Menampilkan isi Array dan hasil perhitungan
        System.out.println("Jumlah Array = " + jumlah);
        System.out.println("Rata - rata Array = " + rata);
        
        // Mencari nilai terbesar dan terkecil dalam Array ver 1
        int max = A[0];
        int min = A[0];

        for (i = 1; i < n; i++){
            if (A[i] > max){
                max = A[i];
            } else if (A[i] < min){
                min = A[i];
            }
        }
        
        System.out.println("Nilai terbesar adalah: "+ max);
        System.out.println("Nilai terkecil adalah: "+ min);
        
        // Mencari nilai terbesar dan terkecil dalam Array ver 2
        int max2 = A[0];
        int min2 = A[0];
        
        for (i = 1; i < n; i++){
            if (A[i] > A[max2]){
                max2 = i;
            } else if (A[i] < A[min2]){
                min2 = i;
            }
        }
        
        System.out.println("Nilai terbesar adalah: "+ max2);
        System.out.println("Nilai terkecil adalah: "+ min2);
    }
}
