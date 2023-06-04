package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;
import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.PrintingMap.printingMap;

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


        var collect = produceShopingList.stream()
                .filter(p -> Money.Currency.PLN.equals(p.getProduct().getPrice().getCurrency()))
                .collect(Collectors.groupingBy(
                        k -> k.getBuyer().getId(),
                        TreeMap::new,
                        Collectors
                                .mapping(
                                        o -> o.getProduct().getPrice().getValue().
                                                multiply(BigDecimal.valueOf(o.getQuantity())),
                                        Collectors.reducing(BigDecimal.ZERO, (l, r) -> l.add(r))
                                )
                ));

        printingMap(collect);
//        System.out.println("\n Exe1 \n Suma wszystkich zakupów w PLN to: " + collect + " PLN ");

        //      Zad 2

        Map<String, Long> asdf = someMethodMap(Product.Category.HOBBY, produceShopingList);

        System.out.println("\n Exe2 \n Mapa klientów i ilości ich zakupów: " + asdf + " PLN ");
        printingMap(asdf);

        System.out.println("\n asdf\n");
        Map<String, Long> categoryStats = getCategoryStats(Product.Category.AUTOMOTIVE , produceShopingList);
        printingMap(categoryStats);


    }

    private static Map<String, Long> someMethodMap(Product.Category category, List<Purchase> produceShopingList) {
        Map<String, Long> result = produceShopingList.stream()
                .filter(p -> p.getQuantity() > 1)
                .filter(p -> category.equals(p.getProduct().getCategory()))
                .collect(Collectors.toMap(
                        key -> key.getBuyer().getId(),
                        Purchase::getQuantity,
                        Long::sum,
                        TreeMap::new
                ));

        return result;
    }

    private static Map<String, Long> getCategoryStats(Product.Category category, List<Purchase> produceShopingList) {
        if (Objects.isNull(category)) {
            throw new RuntimeException("co to sie dzieje sie? : " + category + " is empty");
        }
            Map<String, Long> result = produceShopingList.stream()
                    .filter(p -> p.getQuantity() > 1)
                    .filter(p -> category.equals(p.getProduct().getCategory()))
                    .collect(Collectors.groupingBy(
                            k->k.getBuyer().getId(),
                            TreeMap::new,
                            Collectors
                                    .mapping(Purchase::getQuantity,
                                            Collectors.reducing(0l, Long::sum)
                            )
                    ));


        return result;
    }

}
