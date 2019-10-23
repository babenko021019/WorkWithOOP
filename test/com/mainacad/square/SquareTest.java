package com.mainacad.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testGetArea() {
        Square square = new Square(15);
        double result = square.getArea();
        assertEquals(225, result);
    }
}