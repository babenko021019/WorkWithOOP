package com.mainacad.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testGetArea() {
        Circle circle = new Circle(10);
        double result = circle.getArea();
        assertEquals(314.1592653589793, result);
    }
}