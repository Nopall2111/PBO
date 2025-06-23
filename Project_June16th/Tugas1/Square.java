package Project_June16th.Tugas1;

public class Square extends Rectangle {
    private double side = 1.0;

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Persegi:\n  Sisi: " + side + "\n  Color: " + getColor() + ", Filled: " + isFilled();
    }  
}
