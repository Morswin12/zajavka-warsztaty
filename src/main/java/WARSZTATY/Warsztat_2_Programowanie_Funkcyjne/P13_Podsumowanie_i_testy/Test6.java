package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P13_Podsumowanie_i_testy;

public class Test6 {
    public static void main(String[] args) {
        MyCustomerInterface<Integer, String, Integer, Boolean> lambda1 = (a, b, c) -> true;
        MyCustomerInterface<Integer, Integer, Integer, String> lambda3 = (a, b, c) -> a + b + c + "";
//        MyCustomerInterface<Integer, Integer, Integer, String> lambda4 = (a, b, c) -> a && b && c;

    }
}
