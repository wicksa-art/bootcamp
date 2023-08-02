package sef.module6.activity;

public class Square extends Shape {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
