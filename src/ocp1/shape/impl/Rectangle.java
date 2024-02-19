package ocp1.shape.impl;

import ocp1.shape.Shape;

public class Rectangle implements Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1,double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }
}
