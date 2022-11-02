package com.intern;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practice12 {
    public static Map<String, Integer> topHashtags(List<String> list) {
        Map<String, Integer> map = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = null;
        Set<String> set = null;
        for (String s:
                list) {
            matcher = pattern.matcher(s);
            set = new HashSet<>();
            while(matcher.find()) {
                set.add(matcher.group());
            }
            for (String str:
                    set) {
                if (map.containsKey(str)) {
                    int local = map.get(str) + 1;
                    map.put(str, local);
                    continue;
                }
                map.put(str, 1);
            }
        }
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
    }
        public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asd gds asdw #asd #asd #qwe #asd");
        list.add("asd gds asww #asw #asd #asd");
        list.add("asd gds asgw #asd  #qwe #asd");
        System.out.println(topHashtags(list));
    }
}
