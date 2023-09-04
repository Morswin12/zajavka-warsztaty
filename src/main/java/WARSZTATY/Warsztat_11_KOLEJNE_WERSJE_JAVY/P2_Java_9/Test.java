package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P2_Java_9;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        BiFunction<Integer, String, Boolean> impl = (var e1, var e2) -> (e1.toString() + e2).length() > 2;
        System.out.println(impl.apply(1, "3"));
    }
}
