package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main2_Zad4 {
    public static void main(String[] args) {
        List<Purchase> produceShopingList = produce();

        //      Zad 4

        long count = produceShopingList.stream()
                .filter(a -> Money.Currency.EUR.equals(a.getProduct().getPrice().getCurrency()))
                .map(p -> p.getBuyer().getId())
                .distinct()
                .count();

        HashMap<String, ArrayList<Product>> productListInEUR = produceShopingList.stream()
                .filter(a -> Money.Currency.EUR.equals(a.getProduct().getPrice().getCurrency()))
                .collect(Collectors.toMap(
                        key -> key.getBuyer().getId(),
                        value -> new ArrayList<>(List.of(value.getProduct())),
                        (l, r) -> margeToList(l, r),
                        HashMap::new
                ));


        System.out.println("\n Exe 4 \n Liczba klientów którzy kupowali w \"EUR\" to: " + count + "  ");

        System.out.println(productListInEUR);

    }

    private static ArrayList<Product> margeToList(ArrayList<Product> l, ArrayList<Product> r) {
        ArrayList<Product> result = new ArrayList<>();
        result.addAll(l);
        result.addAll(r);
        return result;
    }
}
