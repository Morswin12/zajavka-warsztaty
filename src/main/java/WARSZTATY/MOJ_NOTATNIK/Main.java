package WARSZTATY.MOJ_NOTATNIK;

//import WARSZTATY.Warsztat_6_LOMBOCK.P7_PROJEKT.mortgage.services.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    static class Vegetable {}

    static class Tomato extends Vegetable {}

    static class Cucumber extends Vegetable {}

    static class Soup {}

    static class VegeSoup extends Soup {}

    void metoda(Function<? super Tomato, ? extends Soup> f) {

    }

    void metoda5(Function<? extends Vegetable, ? extends Soup> f) {
//        f.apply(new Cucumber());
    }

    void metoda2(Function<Tomato, Soup> f) {

    }

    void metoda3(List<? extends Vegetable> l) {

        l.stream().forEach(System.out::println);
//        l.add(new Cucumber());
//        l.add
    }

    void metoda4(List<? super Vegetable> l) {
        l.add(new Tomato());
        l.add(new Cucumber());
        l.add(new Vegetable());

        l.stream().forEach(System.out::println);
    }


    void test() {
        Function<Vegetable, VegeSoup> f = (v) -> null;
        metoda(f);
//        metoda2(f);


        Function<Tomato, VegeSoup> f2 = (v) -> new VegeSoup();

        metoda5(f2);

        metoda3(new ArrayList<Cucumber>());

        metoda4(new ArrayList<Object>());
        metoda4(new ArrayList<Vegetable>());
//        metoda4(new ArrayList<Tomato>());
    }

}
