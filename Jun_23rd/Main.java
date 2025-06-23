package Jun_23rd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        String nama, email, isbn, nameBook;
        double price;
        int qty;
        
        System.out.print("Masukkan nama author :" );
        nama=get.nextLine();
        System.out.print("Masukkan nama email :" );
        email=get.nextLine();
        System.out.print("Masukkan nama book :" );
        nameBook=get.nextLine();
        System.out.print("Masukkan isbn : ");
        isbn=get.nextLine();
        System.out.print("Masukkan price : ");
        price=get.nextDouble();
        System.out.print("Masukkan qty : ");
        qty=get.nextInt();
        
        Author author1 = new Author(nama, email);
        Book book1 = new Book(isbn, nameBook, author1, price, qty);
        
        System.out.println(author1.toString());
        System.out.println(book1.toString());
    }

}
