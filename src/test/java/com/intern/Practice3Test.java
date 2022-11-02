package com.intern;

import com.intern.figure.CylinderImpl;
import com.intern.figure.Shape;
import com.intern.figure.SphereImpl;
import com.intern.figure.SquareImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Practice3Test {

    @Test
    public void testAllDataCorrect() {
        List<Shape> expected = Arrays.asList(new SquareImpl(1), new CylinderImpl(1,2), new SphereImpl(4));
        List<Shape> actual = new ArrayList<>();
        SphereImpl sphere = new SphereImpl(4);
        SquareImpl square = new SquareImpl(1);
        CylinderImpl cylinder = new CylinderImpl(1,2);
        actual.add(sphere);
        actual.add(square);
        actual.add(cylinder);
        Collections.sort(actual, new Practice13());
        Assertions.assertTrue(compareLists(expected, actual));
    }

    @Test
    public void testOutputIsIncorrect() {
        List<Shape> expected = Arrays.asList(new CylinderImpl(1,2), new SquareImpl(1), new SphereImpl(4));
        List<Shape> actual = new ArrayList<>();
        SphereImpl sphere = new SphereImpl(4);
        SquareImpl square = new SquareImpl(1);
        CylinderImpl cylinder = new CylinderImpl(1,2);
        actual.add(sphere);
        actual.add(square);
        actual.add(cylinder);
        Collections.sort(actual, new Practice13());
        Assertions.assertFalse(compareLists(expected, actual));
    }

    private boolean compareLists(List<Shape> list1, List<Shape> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if(!(list1.get(i).area() == (list2.get(i).area()))) {
                return false;
            }
        }
        return true;
    }
}
