package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P10_Interface_Funkcyjne_cz2;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator1 = BinaryOperatorExample::laczenieStringow;
        BinaryOperator<String> binaryOperator2 = (s1, s2) -> s1.concat(s2);
        BinaryOperator<String> binaryOperator3 = String::concat;
        System.out.println(binaryOperator1.apply("Goro ", "to przekozak"));
        System.out.println(binaryOperator2.apply("Dobry jest  ", "ziomeczek"));
    }

    private static String laczenieStringow(String s1, String s2) {
        return s1 + s2;
    }
}
