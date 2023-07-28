package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT.DataFactory.produce;

public class Main1 {
    public static void main(String[] args) {
        List<Purchase> purchaseList = produce();

        // Zadanie 1

        long counter = purchaseList.stream()
                .map(a -> a.getBuyer().getId())
                .distinct()
                .count();

        System.out.println("   Exe 1 \n We have: : " + counter + " buyers.\n");


        // Zadanie 2a

        AtomicInteger counter2 = new AtomicInteger(0);
        HashMap<Purchase.Payment, HashSet<String>> paymentAndBuyersMap = purchaseList.stream()
                .collect(Collectors.toMap(
                        Purchase::getPayment,
                        value -> new HashSet<>(List.of(value.getBuyer().getId())),
                        Main1::marge,
                        HashMap::new
                ));

        HashSet<String> clientsPayingBLIK = paymentAndBuyersMap.get(Purchase.Payment.BLIK);
        clientsPayingBLIK.stream()
                .peek(client -> counter2.incrementAndGet()).collect(Collectors.toList());

        System.out.println("Exe 2 \n " + counter2 + " clients used BLIK \n");

        // Zadanie 2a

        long count2 = purchaseList.stream()
                .filter(p -> Purchase.Payment.BLIK.equals(p.getPayment()))
                .map(Purchase::getBuyer)
                .distinct()
                .count();

        System.out.println("Exe 2 \n " + count2 + " clients used BLIK \n");


        // Zadanie 3

        long count = paymentAndBuyersMap.get(Purchase.Payment.CREDIT_CARD).stream()
                .map(client -> Integer.parseInt(client.substring(7)))
                .count()    ;

        System.out.println("Exe 3 \n " + count + " clients used Credit Card \n");


        // Zadanie 4

        var currencyTransactionEUR = purchaseList.stream()
                .map(p -> p.getProduct().getPrice().getCurrency())
                .map(Enum::toString)
                .filter("EUR"::equals)
                .count();

        System.out.println("Exe 4 \n " + currencyTransactionEUR + " products was buying in EURO \n");


        // Zadanie 5a

        HashMap<Money.Currency, HashSet<String>> currencyTransactionUniqueInEUR = purchaseList.stream()
                .collect(Collectors.toMap(
                        key -> key.getProduct().getPrice().getCurrency(),
                        value -> new HashSet<>(List.of(value.getProduct().getCategory().toString())),
                        Main1::marge,
                        HashMap::new));

        long count1 = currencyTransactionUniqueInEUR.get(Money.Currency.EUR).size();

        System.out.println("Exe 5 \n " + count1 + " unical products was buying in EURO \n");

        // Zadanie 5b

        long count3 = purchaseList.stream()
                .filter(p -> Money.Currency.EUR.equals(p.getProduct().getPrice().getCurrency()))
                .map(p -> p.getProduct().getCategory())
                .distinct()
                .count();

        System.out.println("Exe 5 \n " + count3 + " unical products was buying in EURO \n");
    }

    private static HashSet<String> marge(HashSet<String> l, HashSet<String> r) {
        HashSet<String> clientList = new HashSet<>();
        clientList.addAll(l);
        clientList.addAll(r);
        return clientList;
    }
}
