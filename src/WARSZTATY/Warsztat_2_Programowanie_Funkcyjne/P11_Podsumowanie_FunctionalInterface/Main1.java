package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P11_Podsumowanie_FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("OptionalStringJakiś długi").filter(d -> filtrujStringi(d));
        Optional<String> optionalS2 = Optional.of("Goro").filter(Main1::filtrujStringi);
        System.out.println(optionalS);
        System.out.println(optionalS2);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(8);
        integerList.add(1);
        System.out.println(integerList);
        integerList.removeIf(d -> d < 4);
        System.out.println(integerList);

//        Optional.of(1).ifPresent(d-> System.out.println(d));
        Optional.of(1).ifPresent(System.out::println);
//        Optional.empty().ifPresent(d-> System.out.println(d));
        Optional.empty().ifPresent(System.out::println);

        String s = Optional.<String>empty().orElseGet(() -> "Super String");
        System.out.println(s);
    }

    private static boolean filtrujStringi(String d) {
        System.out.println(d + ":  ");
        return d.length() > 10;
    }
}
