package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.List;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main3_Zad1 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

//        List<Purchase> filteredPurchaseList = produceShopingList.stream()
//                .filter(p -> (p.getBuyer().getPesel().compareTo(BigInteger.valueOf(73999999999L))) < 0)
//                .collect(Collectors.toMap(
//                        key -> key.getBuyer().getPesel().toString().substring(0, 2),
//                        value -> new ArrayList<>(List.of(lessPopularCategories(value), transactionAmount(value) ))))

//                        System.out.println(filteredPurchaseList);

    }

//    private static Map<Long, ArrayList<Object>> resultMap(BigInteger p) {
//        Map<Long, ArrayList> o = null;
//
//        return o;
//    }
}
