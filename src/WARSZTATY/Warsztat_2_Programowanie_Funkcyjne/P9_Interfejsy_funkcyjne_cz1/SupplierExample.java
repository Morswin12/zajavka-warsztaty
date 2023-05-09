package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P9_Interfejsy_funkcyjne_cz1;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = SupplierExample::supplySomething;
        System.out.println(supplier.get());
    }

    public static Integer supplySomething() {
        System.out.println("Calling suplyer ");
        return 123;
    }
}
