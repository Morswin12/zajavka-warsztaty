package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;
import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.PrintingMap.printingMap;

public class Main2_Zad3 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 3

        long count = produceShopingList.stream()
                .map(purchase -> new Purchase(purchase, OrderService.checkOrderStatus(purchase)))
                .filter(p -> Purchase.Status.DONE.equals(p.getStatus()))
                .count();


        System.out.println("\n Exe 3 \n Liczba zakópów ze statusem \"DONE\" to: " + count + "  ");

        TreeMap<Purchase.Status, Integer> collect = produceShopingList.stream()
                .map(purchase -> new Purchase(purchase, OrderService.checkOrderStatus(purchase)))
                .collect(Collectors.toMap(
                        k -> k.getStatus(),
                        v -> 1,
                        Integer::sum,
                        TreeMap::new
                ));

        TreeMap<Purchase.Status, List<Purchase>> collect1 = produceShopingList.stream()
                .map(purchase -> new Purchase(purchase, OrderService.checkOrderStatus(purchase)))
                .collect(Collectors.toMap(
                        k -> k.getStatus(),
                        v -> List.of(v),
                        (l, r) -> Stream.concat(l.stream(), r.stream()).collect(Collectors.toList()),
                        TreeMap::new
                ));

        printingMap(collect);
        printingMap(collect1);
    }

    private static Map<String, Long> someMethodMap(Product.Category hobby, List<Purchase> produceShopingList) {
        Map<String, Long> result = produceShopingList.stream()
                .filter(p -> p.getQuantity() > 1)
                .filter(p -> hobby.equals(p.getProduct().getCategory()))
                .collect(Collectors.toMap(
                        key -> key.getBuyer().getId(),
                        Purchase::getQuantity,
                        Long::sum,
                        HashMap::new
                ));

        return result;
    }

}
