package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main3_Zad1 {

    public static final Integer CURRENT_YEAR = 2020;

    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        TreeMap<Integer, TreeMap<Product.Category, Long>> result1 = produceShopingList.stream()
                .filter(p -> (1900 + p.getBuyer().getYearOfBirth()) < (CURRENT_YEAR - 50))
                .collect(Collectors.groupingBy(
                                p -> p.getBuyer().getYearOfBirth(),
                                TreeMap::new,
                                Collectors.groupingBy(
                                        p -> p.getProduct().getCategory(),
                                        TreeMap::new,
                                        Collectors.mapping(Purchase::getQuantity,
                                                Collectors.reducing(0L, Long::sum)))
                        )
                );

        var result2 = result1.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> Arrays.stream(Product.Category.values())
                                .collect(Collectors.toMap(
                                        categoryKey -> e.getValue().getOrDefault(categoryKey, 0L),
                                        List::of,
                                        (l, r) -> Stream.concat(l.stream(), r.stream()).collect(Collectors.toList()),
                                        TreeMap::new
                                )).entrySet().stream().limit(1).collect(Collectors.toList()),
                        (l,e)-> l,
                        TreeMap::new
                ));

//                        e -> {
//                            TreeMap<Product.Category, Long> result = new TreeMap<>();
//                            for (Product.Category categoryKey : Product.Category.values()) {
//                                result.put(categoryKey, e.getValue().getOrDefault(categoryKey, 0L));
//                            }
//                            return result;
//                        },


        PrintingMap.printingMap(result1);
        System.out.println();
        PrintingMap.printingMap(result2);
        System.out.println();
//        PrintingMap.printingMap(mapTreeMap);

    }


}
