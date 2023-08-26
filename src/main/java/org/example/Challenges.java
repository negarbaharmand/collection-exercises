package org.example;

import java.util.*;

public class Challenges {
    public static void main(String[] args) {
        challenge1();
        challenge2();
        challenge3();
        challenge4();
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

    public static void challenge2() {
        Map<String, String> infoHashMap = new HashMap<>();
        infoHashMap.put("negar@gmail.com", "Negar");
        infoHashMap.put("ali@gmail.com", "Ali");
        infoHashMap.put("momo@gmail.com", "Momo");
        infoHashMap.put("sara@gmail.com", "Sara");

        Set<String> keySet = new HashSet<>(infoHashMap.keySet());
        System.out.println("The keys are: " + keySet);
    }

    public static void challenge3() {
        ArrayList<SuperHero> heroes = new ArrayList<>();
        heroes.add(new SuperHero(1, "Superman", 30));
        heroes.add(new SuperHero(2, "Batman", 35));
        heroes.add(new SuperHero(3, "Wonder Woman", 28));
        heroes.add(new SuperHero(4, "Flash", 25));

        Collections.sort(heroes);
        for (SuperHero hero : heroes) {
            System.out.println("Name: " + hero.getName() + ", Age: " + hero.getAge());
        }
    }

    public static void challenge4() {
        int[] numbers = {1, 4, 4, 2, 6, 7};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Numbers without duplicates:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}