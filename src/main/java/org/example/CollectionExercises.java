package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercises {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    public static void ex1(){
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
    public static void ex2(){
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
    public static void ex3(){
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
            if(day.equals("Thursday")){
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

}
