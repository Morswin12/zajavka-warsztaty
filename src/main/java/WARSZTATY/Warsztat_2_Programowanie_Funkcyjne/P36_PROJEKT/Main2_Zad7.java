package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.*;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad7 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 7

        TreeMap<String, Long> productAndAmountMap = produceShopingList.stream()
                .collect(Collectors.toMap(
                        key -> key.getProduct().getId(),
                        Purchase::getQuantity,
                        Main2_Zad7::addAmount,
                        TreeMap::new
                ));

        TreeMap<Long, ArrayList<String>> amountAndProductsmap = productAndAmountMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        v -> new ArrayList<>(List.of(v.getKey())),
                        Main2_Zad7::margeToList,
                        TreeMap::new
                ));

        System.out.println(productAndAmountMap);
        System.out.println(amountAndProductsmap);

        Long aLong = amountAndProductsmap.entrySet().stream()
                .map(a -> a.getKey())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .max(Comparator.naturalOrder())
                .orElse(0l);

        ArrayList<String> arrayList = amountAndProductsmap.get(aLong);

        System.out.println(arrayList);
        System.out.println(aLong);
//        System.out.println("\n   Exe.txt 7 \nLiczba klientów którzy kupowali w \"EUR\" to: " + clientYearMapUnique + "  ");

    }

    private static Long addAmount(Long l, Long r) {
        return l + r;
    }

    private static ArrayList<String> margeToList(ArrayList<String> l, ArrayList<String> r) {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(l);
        result.addAll(r);
        return result;
    }

}
