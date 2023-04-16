package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P5_Podsumowanie_od_1_do_4.PartA;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sock<List<String>, String> stringSock = new Sock<>(List.of("asdf", "zxcv"));
        System.out.println(stringSock.getItem());
        boolean krowa = stringSock.put(List.of("qwer", "poiu"));
        System.out.println(krowa);
        System.out.println(stringSock.getItem());
        boolean krowa1 = stringSock.put(null);
        System.out.println(krowa1);


    }
}
