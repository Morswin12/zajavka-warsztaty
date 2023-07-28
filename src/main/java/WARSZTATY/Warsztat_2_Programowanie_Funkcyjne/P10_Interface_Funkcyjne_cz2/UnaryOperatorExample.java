package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P10_Interface_Funkcyjne_cz2;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator1 = UnaryOperatorExample::przeobString;
        UnaryOperator<String> unaryOperator2 = t -> {
            System.out.println("Calling lambda");
            return "dlugość stringa \"" + t + "\" to: <" + t.length() + "> znaków.";
        };

        String eurovision = unaryOperator1.apply("eurovision");

        System.out.println(eurovision);
        System.out.println(unaryOperator2.apply("goro"));

        UnaryOperator<Integer> integerUnaryOperator = i -> i * 234;
        System.out.println(integerUnaryOperator.apply(245));
    }

    private static String przeobString(String t) {
        System.out.println("Calling method reference");
        return "dlugość stringa \"" + t + "\" to: <" + t.length() + "> znaków.";
    }
}
