package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad1_Zad2 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //    Zad 1
        BigDecimal sumOfShopingPLN = produceShopingList.stream()
                .filter(l -> Money.Currency.PLN.equals(l.getProduct().getPrice().getCurrency()))
                .map(p -> p.getProduct().getPrice().getValue())
                .reduce((l, r) -> l.add(r))
                .orElse(BigDecimal.ZERO);
        System.out.println("\n Exe1 \n Suma wszystkich zakupów w PLN to: " + sumOfShopingPLN + " PLN ");


        //      Zad 2

        Map<String , Long> asdf = someMethodMap(Product.Category.HOBBY, produceShopingList);

        System.out.println("\n Exe2 \n Mapa klientów i ilości ich zakupów: " + asdf + " PLN ");



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
