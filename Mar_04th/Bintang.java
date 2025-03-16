package Mar_04th;

import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        int n, i, j;

        Scanner inn = new Scanner(System.in);

        System.out.println("Nomor 1");
        System.out.print("Ukuran: ");
        n = inn.nextInt();
        
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Nomor 2");
        System.out.print("Ukuran: ");
        n = inn.nextInt();
        
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Nomor 3");
        System.out.print("Ukuran: ");
        n = inn.nextInt();
        
        int a = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a++;
                System.out.print(" "+a+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Nomor 4");
        System.out.print("Ukuran: ");
        n = inn.nextInt();
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" "+a+" ");
                a--;
            }
            System.out.println();
        }
    }
}
