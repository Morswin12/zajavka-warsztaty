package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P5_Podsumowanie_od_1_do_4.PartB;

import java.util.Collection;

public class Cyclist<T> implements Bikable<T> {
    @Override
    public void ride(T vehicle) {
        System.out.println("I am riding a bike from company  " + vehicle);
    }

     static <T> void method1(T t) {
         System.out.println(t);
    }
      <V extends Collection<V>> void method2(V t) {
         System.out.println(t);
    }

    @Override
    public String toString() {
        return "Cyclist{}";
    }
}
