package com.mainacad.treangle;

import com.mainacad.abc.AbstractShape;

public class Treangle extends AbstractShape{

    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Treangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Treangle() {
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }
}
