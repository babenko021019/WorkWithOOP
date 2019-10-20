package com.mainacad;

import com.mainacad.abc.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.treangle.Treangle;

public class ApplicationRunner {

    public static void main(String[] args) {

        Treangle treangle = new Treangle();
        treangle.setHeight(20);
        treangle.setBase(15);

        Circle circle = new Circle();
        circle.setRadius(10);

        Square square = new Square();
        square.setSide(28);

        Shape minShape;

        if (circle.getArea() < square.getArea()) {
            minShape = circle;
        } else {
            minShape = square;
        }

        if (minShape.getArea() > treangle.getArea()) {
            minShape = treangle;
        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() +
                " and has area " + minShape.getArea());

        System.out.println("Treangle has area " + treangle.getArea());

        System.out.println("Circle has area " + circle.getArea());

        System.out.println("Square has area " + square.getArea());
    }
}
