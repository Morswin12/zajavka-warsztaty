package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.*;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad5 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 5

        LinkedHashMap<String, ArrayList<Product>> clientYearMap = produceShopingList.stream()
                .collect(Collectors.toMap(
                        key -> "19" + key.getBuyer().getPesel().toString().substring(0, 2),
                        value -> new ArrayList<>(List.of(value.getProduct())),
                        (l, r) -> margeToList(l, r),
                        HashMap::new
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));


        for (Map.Entry<String, ArrayList<Product>> stringArrayListEntry : clientYearMap.entrySet()) {
            System.out.println(stringArrayListEntry.getKey() + " : " + stringArrayListEntry.getValue());
        }

        System.out.println("\n   Exe.txt 5 \nLiczba klientów którzy kupowali w \"EUR\" to: " + clientYearMap + "  ");

    }

    private static ArrayList<Product> margeToList(ArrayList<Product> l, ArrayList<Product> r) {
        ArrayList<Product> result = new ArrayList<>();
        result.addAll(l);
        result.addAll(r);
        return result;
    }
}
