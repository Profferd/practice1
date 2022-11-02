package com.intern.figure;

public class SquareImpl implements Shape {
    private int x;

    public SquareImpl() {}

    public SquareImpl(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public double area() {
        return Math.pow(getX(), 3);
    }

    @Override
    public String toString() {
        return "SquareImpl{" +
                "volume=" + Math.round(area() * 100) / 100.0 +
                '}';
    }
}
