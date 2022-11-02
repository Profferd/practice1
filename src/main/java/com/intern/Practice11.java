package com.intern;

import java.util.*;
import java.util.stream.Collectors;

public class Practice11 {
    public static List<Integer> sortArr(List<Integer> arr) {
        return arr.stream().filter(x -> x >=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        list = sortArr(list);
        System.out.println(list);
    }

}
