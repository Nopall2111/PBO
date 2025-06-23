package Project_June16th.Tugas3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        GeometriObject circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        System.out.println();
        GeometriObject rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
