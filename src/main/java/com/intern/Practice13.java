package com.intern;

import com.intern.figure.CylinderImpl;
import com.intern.figure.Shape;
import com.intern.figure.SphereImpl;
import com.intern.figure.SquareImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice13 implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        double diff = o1.area() - o2.area();
        return diff == 0 ? 0 : (diff < 0 ? -1 : 1);
    }

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        SphereImpl sphere = new SphereImpl(4);
        SquareImpl square = new SquareImpl(1);
        CylinderImpl cylinder = new CylinderImpl(1,2);
        list.add(sphere);
        list.add(square);
        list.add(cylinder);
        list.forEach(System.out::println);
        Collections.sort(list, new Practice13());
        list.forEach(System.out::println);
    }
}
