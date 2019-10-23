package com.mainacad;

import com.mainacad.abc.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.treangle.Treangle;

import java.util.*;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        Treangle treangle1 = new Treangle(15, 20);
        Treangle treangle2 = new Treangle(20, 15);
        Treangle treangle3 = new Treangle(26, 19);

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Square square1 = new Square(28);
        Square square2 = new Square(68);
        Square square3 = new Square(38);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(treangle1);
        shapes.add(treangle2);
        shapes.add(treangle3);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);

        Shape maxShape = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            if (maxShape.getArea() < shapes.get(i).getArea()) {
                maxShape = shapes.get(i);
            }
        }

        Shape minShape = shapes.get(0);
        for (int i = 1; i < shapes.size(); i++) {
            if (minShape.getArea() > shapes.get(i).getArea()) {
                minShape = shapes.get(i);
            }
        }

        LOGGER.info("Max shape is " + maxShape.getClass().getSimpleName() +
                " and has area " + maxShape.getArea());

        LOGGER.info("Min shape is " + minShape.getClass().getSimpleName() +
                " and has area " + minShape.getArea());
    }
}
