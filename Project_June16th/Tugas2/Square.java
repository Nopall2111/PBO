/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project_June16th.Tugas2;

/**
 *
 * @author user
 */
public class Square extends Rectangle {
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }  
    public double getSide() {
        return getWidth();
    }  
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
