package Feb_27th;

import java.util.Scanner;

public class Pengulangan {
    public static void main(String[] args) {
        int n,i;
        Scanner inn = new Scanner(System.in);

        System.out.println("== Program Pengulangan ==");
        System.out.print("Banyak Pengulangan: ");
        n = inn.nextInt();

        System.out.println("-- Pengulangan For --");
        for(i=1;i<=n;i++)
            System.out.print(i+"\t");
        
        System.out.println("\n-- Pengulangan While --");
        i = 1;
        while (i<=n) {
            System.out.print(i+"\t");
            i++;
        }
        
        System.out.println("\n-- Pengulangan DoWhile --");
        i = 1;
        do {
            System.out.print(i+"\t");
            i++;
        } while (i<=n);

    }
}
