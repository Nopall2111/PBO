/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project_June16th.Tugas2;

/**
 *
 * @author user
 */
public class FixedMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {

        System.out.println("--- Bagian 1: Upcast Circle to Shape ---");
        Shape s1 = new Circle(5.5, "RED", false); 
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
       
        System.out.println("\n--- Bagian 2: Downcast back to Circle ---");
        Circle c1 = (Circle)s1;                
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); 

        System.out.println("\n--- Bagian 3: Mencoba Instansiasi Kelas Abstrak (Akan Error jika tidak diubah) ---");
        Shape s2 = new Circle(1.0, "GREEN", true); 
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getColor());

        System.out.println("\n--- Bagian 4: Upcast Rectangle to Shape ---");
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); 
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.isFilled());
       
        System.out.println("\n--- Bagian 5: Downcast back to Rectangle ---");
        Rectangle r1 = (Rectangle)s3;            
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.isFilled()); 
        System.out.println(r1.getLength()); 

        System.out.println("\n--- Bagian 6: Upcast Square to Shape ---");
        Shape s4 = new Square(6.6, "BLUE", true); 
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());
        System.out.println(s4.getColor());
        System.out.println(s4.isFilled()); 
       
        System.out.println("\n--- Bagian 7: Upcast Square (as Shape) to Rectangle ---"); 
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getColor());
        System.out.println(r2.isFilled()); 
        System.out.println(r2.getLength()); 
   
        System.out.println("\n--- Bagian 8: Downcast Rectangle r2 to Square ---");
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter()); 
        System.out.println(sq1.getColor());
        System.out.println(sq1.isFilled()); 
        System.out.println(sq1.getLength());
        System.out.println(sq1.getSide()); 
    }
    
}
