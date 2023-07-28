package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P3_Generyczne_Metody;

import java.util.Map;

public class GenericMethodMain<T> {
    public static Map<String, Vehicle> vehicleMap = Map.of(
            "Vehicle1", new Bike()
    );
    public static void main(String[] args) {
        String s = "ASDF";
        Bike bike = new Bike();
        call1(bike);
        call1(s);

        call2(new Vehicle());
        call2(new Bike());

        Bike bike1 = call3(bike);
        System.out.println(bike1);

        Bike b = call4();
        System.out.println(b.getName());
        String name1 = GenericMethodMain.<Bike>call4().getName();
        System.out.println(name1);
    }

    public static <T> void call1(T element) {
        System.out.println(element);
    }

    public static <T extends Vehicle> void call2(T element) {
        System.out.println(element);
    }

    public static <T extends Vehicle> T call3(T element) {
        T t = element;
        return t;
    }

    public static <T> T call4() {
        return (T) vehicleMap.get("Vehicle1");
    }

    static class Vehicle {
    }

    static class Bike extends Vehicle{
        String name = "asdf";
        String getName() {
            return "bikeName";
        }

    }

    static class Apple {
    }


}
