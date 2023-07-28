package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P21_podsumowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list1 = Arrays.asList("asdf", "zxcv");
//        list1.add("rtyu");                                    // rzuca wyjątek
        List<String> list = new ArrayList<>(Arrays.asList("asdf", "zxcv"));

        list.add("qwer");
        System.out.println(list);
    }
}
