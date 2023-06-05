package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main3_Zad2 {

    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        TreeMap<Integer, Long> collect = produceShopingList.stream()
                .collect(Collectors.toMap(
                        key -> key.getBuyer().getYearOfBirth(),
                        Purchase::getQuantity,
                        Long::sum,
                        TreeMap::new
                ));


        var collect1 = collect.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        v -> List.of(v.getKey()),
                        (l, r) -> Stream.concat(l.stream(), r.stream()).collect(Collectors.toList()),
                        () -> new TreeMap<>(Comparator.comparing(l -> -l))
                ));

        String reduce = collect1.entrySet().stream()
                .limit(1)
                .peek((l) -> System.out.println("Rocznik: " + l.getKey().toString() + " kupi najwięcej produktów: : " + l.getValue()))
                .map(p -> "Rocznik: " + p.getKey().toString() + " kupi najwięcej produktów: : " + p.getValue())
                .reduce(" ", (l, r) -> l + r);

        PrintingMap.printingMap(collect);
        System.out.println();
        PrintingMap.printingMap(collect1);
        System.out.println();
        System.out.println(reduce);

    }
}
