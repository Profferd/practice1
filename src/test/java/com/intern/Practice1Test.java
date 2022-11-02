package com.intern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1Test {

    @Test
    public void testAllDataCorrect() {
        List<Integer> expected = Arrays.asList(1000, 431, 12, 0);
        List<Integer> actual = Arrays.asList(-32, 0, 12, -43, 1000, -7, 431);
        actual = Practice11.sortArr(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNothingEntered() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        actual = Practice11.sortArr(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllNegative() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = Arrays.asList(-1, -4, -123);
        actual = Practice11.sortArr(actual);
        Assertions.assertEquals(expected, actual);
    }
}
