package com.intern.figure;

public class CylinderImpl implements Shape {
    private int r;
    private int h;

    public CylinderImpl() {
    }

    public CylinderImpl(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return Math.PI * getR() * getR() * getH();
    }

    @Override
    public String toString() {
        return "CylinderImpl{" +
                "volume=" + Math.round(area() * 100) / 100.0 +
                '}';
    }
}
