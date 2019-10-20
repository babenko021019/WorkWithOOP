package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(10.0);

        System.out.println("Square with side " + square.getSide() +
                " has area " + square.getArea());

        Circle circle = new Circle();
        circle.setRadius(10.0);

        System.out.println("Circle with radius " + circle.getRadius() +
                " has area " + circle.getArea());

        Triangle triangle = new Triangle();
        triangle.setHeight(7.4);
        triangle.setBase(5.5);

        System.out.println("Triangle with height " + triangle.getHeight() +
                " with base " + triangle.getBase() + " has area " + triangle.getArea());
    }
}
