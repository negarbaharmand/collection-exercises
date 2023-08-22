package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Challenges {
    public static void main(String[] args) {
        challenge1();
        challenge2();
    }

    public static void challenge1() {
        Set<String> allDays = new HashSet<>();
        allDays.add("Monday");
        allDays.add("Tuesday");
        allDays.add("Wednesday");
        allDays.add("Thursday");
        allDays.add("Friday");
        allDays.add("Saturday");
        allDays.add("Sunday");

        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        allDays.retainAll(weekendDays);

        System.out.println("Common days in both sets: " + allDays);
    }
    public static void challenge2(){
        Map<String, String> infoHashMap = new HashMap<>();
        infoHashMap.put("2e3", "Negar");
        infoHashMap.put("we4", "Ali");
        infoHashMap.put("1s2", "Momo");
        infoHashMap.put("df4", "Sara");

        Set<String> keySet = new HashSet<>(infoHashMap.keySet());
        System.out.println("The kys are: " + keySet);
    }
}