package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarHashMap {
    public static void main(String[] args) {
        Map<Integer, Car> carMap = new HashMap<>();

        carMap.put(1, new Car(123, "Volvo", "XC60"));
        carMap.put(2, new Car(562, "AOD", "TT"));
        carMap.put(3, new Car(783, "Ford", "Focus"));
        carMap.put(4, new Car(497, "Jeep", "Compass"));
        carMap.put(5, new Car(55, "BMW", "X3"));

        System.out.println("Car Brands:");
        for (Car car : carMap.values()) {
            System.out.println(car.getBrand());
        }
    }
}
