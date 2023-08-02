// AbstractionActivity.java
package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        // Creating a Square
        Square square = new Square(5);
        square.setColor("Blue");
        System.out.println("Square color: " + square.getColor());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());

        // Creating a Rectangle
        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.setColor("Red");
        System.out.println("\nRectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}
