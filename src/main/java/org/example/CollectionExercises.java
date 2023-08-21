package org.example;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

    public static void ex1() {
        List<String> daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println("Days of the week: " + daysOfWeek);
    }

    public static void ex2() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        Iterator<String> iterator = daysOfWeek.iterator();

        System.out.println("Days of the week:");
        while (iterator.hasNext()) {
            String day = iterator.next();
            System.out.println(day);
        }
    }

    public static void ex3() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        Iterator<String> iterator = daysOfWeek.iterator();

        System.out.println("Days of the week:");
        while (iterator.hasNext()) {
            String day = iterator.next();
            if (!day.equals("Thursday")) {
                System.out.println(day);
            }
            if (day.equals("Thursday")) {
                iterator.remove();
            }
        }
        daysOfWeek.add(3, "Thursday");
        System.out.println("Updated days of the week: ");
        for (String day : daysOfWeek
        ) {
            System.out.println(day);
        }
    }

    public static void ex4() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        List<String> firstThreeDays = daysOfWeek.subList(0, 3);
        System.out.println("First three days of the week: " + firstThreeDays);

    }

    public static void ex5() {
        Set<String> daysOfWeekSet = new HashSet<>();
        daysOfWeekSet.add("Monday");
        daysOfWeekSet.add("Tuesday");
        daysOfWeekSet.add("Wednesday");
        daysOfWeekSet.add("Thursday");
        daysOfWeekSet.add("Friday");
        daysOfWeekSet.add("Saturday");
        daysOfWeekSet.add("Sunday");
        System.out.println("Days of the week set: " + daysOfWeekSet);
    }

    public static void ex6() {
        Set<String> daysOfWeekSet = new HashSet<>();

        daysOfWeekSet.add("Monday");
        daysOfWeekSet.add("Tuesday");
        daysOfWeekSet.add("Wednesday");
        daysOfWeekSet.add("Thursday");
        daysOfWeekSet.add("Friday");
        daysOfWeekSet.add("Saturday");
        daysOfWeekSet.add("Sunday");

        List<String> daysOfWeekList = new ArrayList<>(daysOfWeekSet);

        System.out.println("ArrayList Days of the week : " + daysOfWeekList);
    }
}
