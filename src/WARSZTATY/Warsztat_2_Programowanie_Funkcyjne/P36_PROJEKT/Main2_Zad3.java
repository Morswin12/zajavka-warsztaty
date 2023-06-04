package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad3 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 3

        long doneStatusPurchases = produceShopingList.stream()
                .map(Purchase::getStatus)
//                .peek(System.out::println)
                .filter(Purchase.Status.DONE::equals)
                .count();

        System.out.println("\n Exe 3 \n Liczba zakópów ze statusem \"DONE\" to: " + doneStatusPurchases + "  ");


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
