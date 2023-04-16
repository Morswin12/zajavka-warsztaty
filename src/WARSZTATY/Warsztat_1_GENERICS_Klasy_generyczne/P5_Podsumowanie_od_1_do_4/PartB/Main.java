package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P5_Podsumowanie_od_1_do_4.PartB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bikable<String> bikable = new Cyclist<>();
        bikable.<String>ride("ferrari ");
        Cyclist cyclist = new Cyclist();
        cyclist.ride("porsche");
        cyclist.<Integer>method1(3);
        cyclist.method1("3333");
        cyclist.method1(new Cyclist<>());

        List<String> list = new ArrayList<>();
        list.add("asdasd");
        list.add("asdasd");
        list.add("asdasd");

        cyclist.method2(list);
    }
}
