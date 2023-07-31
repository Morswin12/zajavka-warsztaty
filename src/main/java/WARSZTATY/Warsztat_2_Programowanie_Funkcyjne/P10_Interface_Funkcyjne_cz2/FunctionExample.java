package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P10_Interface_Funkcyjne_cz2;

import java.util.Optional;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
//        Function<String, Integer> function = s -> s.length();
        Function<String, Integer> function = String::length;
        Integer dlugiString = function.apply("długi string ");
        System.out.println(dlugiString);

        Function<Car, String> carStringFunction = Car::toString;
        Optional<String> carOptional = Optional.of(new MiniCar("MiniSamochod"))
                .map(carStringFunction);

        Function<Car, String> someFunction = FunctionExample::getString;
        System.out.println(someFunction.apply(new Car("Fiat")));
    }

    private static String getString(Car c) {
        System.out.println(c);
        return c.getClass().descriptorString();
    }

    public static class Car {
        private final String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Car { " + name + " }";
        }
    }
    public static class MiniCar extends Car {

        public MiniCar(String name) {
            super(name);
        }
    }



}
