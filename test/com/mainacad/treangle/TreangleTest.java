package com.mainacad.treangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreangleTest {

    @Test
    void testGetArea() {
        Treangle treangle = new Treangle(15,20);
        double result = treangle.getArea();
        assertEquals(150, result);
    }
}