package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.*;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad6 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 6

        TreeMap<String, TreeSet<String>> clientYearMapUnique = produceShopingList.stream()
                .collect(Collectors.toMap(
                        key -> "19" + key.getBuyer().getPesel().toString().substring(0, 2),
                        value -> new TreeSet<>(List.of(value.getProduct().getId())),
                        Main2_Zad6::margeToList,
                        TreeMap::new
                ));

        for (Map.Entry<String, TreeSet<String>> stringHashSetEntry : clientYearMapUnique.entrySet()) {
            System.out.println(stringHashSetEntry.getKey() + " : " + stringHashSetEntry.getValue());
        }


        System.out.println("\n   Exe.txt 6 \nLiczba klientów którzy kupowali w \"EUR\" to: " + clientYearMapUnique + "  ");

    }
    private static TreeSet<String> margeToList(TreeSet<String> l, TreeSet<String> r) {
        TreeSet<String> result = new TreeSet<>();
        result.addAll(l);
        result.addAll(r);
        return result;
    }
}
