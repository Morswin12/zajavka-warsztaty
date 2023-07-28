package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P1_Generyczne_Klasy;

import java.util.function.Predicate;

public class CallingBag {
    public static void main(String[] args) {
//        Bag<String> bag = new Bag<>();
//        System.out.println(bag);
//        bag.pack("asdas");
//        bag.pack("sdsdfdsf");
//        System.out.println(bag);
////        bag.getElement();
//        bag.empty();
//        System.out.println(bag);
//
//        Bag<Car> car = new Bag<>();
//        System.out.println(car);
//        car.pack(new Car());
//        System.out.println(car);
////        car.getElement();
//        car.empty();
//        System.out.println(car);
//
//        Bag<Car> carBag = new Bag<>();
//        carBag.pack(new Car());
//        carBag.pack(new SUV());
//        System.out.println(carBag);

        callFilteringBag();
    }

    private static void callFilteringBag() {
        Car car1 = new Car("red", 2010);
        Car car2 = new Car("red2", 2010);
        FilteringBag<Car, Predicate<Car>, Predicate<Car>> filteringBag = new FilteringBag<>(
                c -> c.color.equals("red"),
                c -> c.year > 2000
        );
        filteringBag.pack(car1);
//        filteringBag.pack(car2);
    }

    static class Car {
        String name = "Car";
        private String color;
        private int year;

        public Car(String color, int year) {
            this.color = color;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return name ;
        }
    }
}
