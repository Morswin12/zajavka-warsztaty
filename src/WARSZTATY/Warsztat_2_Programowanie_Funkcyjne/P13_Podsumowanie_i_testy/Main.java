package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P13_Podsumowanie_i_testy;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> integerStringFunction = i -> {
            if (i > 1) {
                throw new MyCustomException(i + " greater than 1");
            } else {
                return i.toString();
            }
        };

        System.out.println(integerStringFunction.apply(0));
        System.out.println(integerStringFunction.apply(654));
    }
}
