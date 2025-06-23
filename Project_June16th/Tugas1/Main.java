package Project_June16th.Tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        boolean ulang = true;
        System.out.println();

        while (ulang) {
            // Menampilkan Menu Pilihan
            System.out.println("-----------------------------");
            System.out.println("Pilih bentuk untuk dihitung:");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pil = in.nextInt();
            System.out.println("============================");

            switch (pil) {
                case 0: // Keluar
                    System.out.println("Terima kasih! Program selesai.");
                    ulang = false;
                    break;

                case 1: // Lingkaran
                    System.out.print("Masukkan jari-jari: ");
                    double radius = in.nextDouble();
                    in.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorCircle = in.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledCircle = in.nextBoolean();
                    Circle circle = new Circle(radius, colorCircle, filledCircle);
                    System.out.println(circle);
                    System.out.println("Luas\t : " + circle.getArea());
                    System.out.println("Keliling : " + circle.getPerimeter());
                    break;

                case 2: // Persegi Panjang
                    System.out.print("Masukkan panjang: ");
                    double length = in.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double width = in.nextDouble();
                    in.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorRectangle = in.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledRectangle = in.nextBoolean();
                    Rectangle rectangle = new Rectangle(length, width, colorRectangle, filledRectangle);
                    System.out.println(rectangle);
                    System.out.println("Luas\t : " + rectangle.getArea());
                    System.out.println("Keliling : " + rectangle.getPerimeter());
                    break;

                case 3: // Persegi
                    System.out.print("Masukkan panjang sisi: ");
                    double side = in.nextDouble();
                    in.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorSquare = in.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledSquare = in.nextBoolean();
                    Square square = new Square(side, colorSquare, filledSquare);
                    System.out.println(square);
                    System.out.println("Luas\t : " + square.getArea());
                    System.out.println("Keliling : " + square.getPerimeter());
                    break;

                default: // Pilihan tidak valid
                    System.out.println("Pilihan tidak valid, silakan pilih opsi yang benar.");
                    break;
            }

            if (ulang && pil != 0) {
                // Tanya pengguna apakah ingin melanjutkan
                System.out.println("-----------------------------");
                System.out.println("Apakah Anda ingin mencoba bentuk lain? (ya/tidak)");
                String jawab = in.next().toLowerCase();
                ulang = jawab.equals("ya") || jawab.equals("y");
                System.out.println();
                in.nextLine();
            }
        }

        in.close();
    }
}

