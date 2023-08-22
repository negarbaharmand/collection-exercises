package org.example;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        ex9();
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

    public static void ex7() {
        Set<String> randomNamesSet = new HashSet<>();
        randomNamesSet.add("Negar");
        randomNamesSet.add("Behnam");
        randomNamesSet.add("Sara");
        randomNamesSet.add("Luke");
        randomNamesSet.add("Sofia");
        randomNamesSet.add("Goli");
        randomNamesSet.add("Lily");

        List<String> randomNamesList = new ArrayList<>(randomNamesSet);
        Collections.sort(randomNamesList);
        System.out.println("Sorted names list: " + randomNamesList);

    }

    public static void ex8() {
        Set<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Negar");
        namesTreeSet.add("Behnam");
        namesTreeSet.add("Sara");
        namesTreeSet.add("Alain");
        namesTreeSet.add("Sofia");
        namesTreeSet.add("Goli");
        namesTreeSet.add("Lily");
        System.out.println("Sorted names from TreeSet: " + namesTreeSet);

    }
    public static void ex9(){
        Map<Integer, String> carBrandsMap = new HashMap<>();
        carBrandsMap.put(1, "Volvo");
        carBrandsMap.put(2, "AOD");
        carBrandsMap.put(3, "Ford");
        carBrandsMap.put(4, "Jeep");
        carBrandsMap.put(5, "BMW");

        System.out.println("Car brands are: " + carBrandsMap);
    }
}