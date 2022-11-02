package com.intern.figure;

public class SphereImpl implements Shape {
    private int r;

    public SphereImpl() { }

    public SphereImpl(int r) {
        setR(r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r <= 0) {
            throw new UnsupportedOperationException();
        }
        this.r = r;
    }

    @Override
    public double area() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getR(), 3);
    }
    @Override
    public String toString() {
        return "SphereImpl{" +
                "volume=" + Math.round(area() * 100) / 100.0 +
                '}';
    }
}
