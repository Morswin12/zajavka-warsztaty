package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P23_Podsumowanie;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<Integer> priceList = new ArrayList<>();
        priceList.add(2);
        priceList.add(4);
        priceList.add(5);
        priceList.add(8);

        TreeSet<Object> peek = priceList.parallelStream()
                .peek(s -> System.out.println(s))
                .collect(() -> new TreeSet<>(),
                        (currentSet, element)-> currentSet.add(element),
                        (firstSet, secondSet) -> firstSet.addAll(secondSet));
        System.out.println(peek);

        Integer reduce = priceList.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        long count = priceList.stream().count();
        System.out.println(count);

        boolean b = priceList.stream().anyMatch(s -> s == 5);
        System.out.println(b);

        priceList.forEach(s-> System.out.println(s));
    }
}
