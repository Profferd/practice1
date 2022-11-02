package com.intern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Practice2Test {
    @Test
    public void testAllDataCorrectAndSomeRepeats() {
        Map<String, Integer> expected = Map.of("#asd", 3, "#qwe", 2, "#asw", 1);
        List<String> list = new ArrayList<>();
        list.add("asd gds asdw #asd #asd #qwe #asd");
        list.add("asd gds asww #asw #asd #asd");
        list.add("asd gds asgw #asd  #qwe #asd");
        Map<String, Integer> actual = Practice12.topHashtags(list);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllDataCorrectAndWithoutRepeats() {
        Map<String, Integer> expected = Map.of("#asd", 3, "#qwe", 2, "#asw", 1);
        List<String> list = new ArrayList<>();
        list.add("asd gds asdw #asd  #qwe ");
        list.add("asd gds asww #asw #asd");
        list.add("asd gds asgw #asd  #qwe");
        Map<String, Integer> actual = Practice12.topHashtags(list);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllDataCorrectAndViewTop5() {
        Map<String, Integer> expected = Map.of("#sda", 3,"#asd", 3, "#dsb", 2,"#qwe", 2, "#noname", 1);
        List<String> list = new ArrayList<>();
        list.add("asd gds asdw #asd  #qwe #dsb #sda #noname");
        list.add("asd gds asww #asw #asd #sda #dsb");
        list.add("asd gds asgw #asd  #qwe #sda");
        Map<String, Integer> actual = Practice12.topHashtags(list);
        Assertions.assertEquals(expected, actual);
    }
}
