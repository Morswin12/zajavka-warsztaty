package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

public class Main {
    public static void main(String[] args) {

        SomeInterface someInterface = arg1 -> System.out.println(arg1);
    }

    public static void myMethod(String arg1) {

    }

    @FunctionalInterface
    interface SomeInterface {
        void somemethod(String arg1);
    }
}
