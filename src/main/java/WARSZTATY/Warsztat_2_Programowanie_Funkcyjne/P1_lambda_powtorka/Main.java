package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P1_lambda_powtorka;

public class Main {
    public static void main(String[] args) {
        Checkable checkable = new CheskableImp();
        System.out.println(checkable.myTester("zajavka"));

        Checkable checkable1 = new Checkable() {
            @Override
            public boolean myTester(String value) {
                System.out.println("Calling abstract class");
                return value.contains("dupa");
            }
        };
        System.out.println(checkable1.myTester("dupa"));

        Checkable checkable2 = a -> {
            System.out.println("Calling lambda");
            return a.contains("krowa");
        };

        System.out.println(checkable2.myTester("krowa"));

    }


}
