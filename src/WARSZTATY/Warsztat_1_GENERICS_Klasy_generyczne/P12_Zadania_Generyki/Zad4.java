package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        String[] strings = {"asdf", "qwer", "zxcv", "mnbv", "lkjh", "poiu"};
        System.out.println(Arrays.toString(strings));
        method(strings, 2, 4);
        System.out.println(Arrays.toString(strings));

        Integer[] integers = {2, 4, 6, 9, 19, 234, 4,};
        System.out.println(Arrays.toString(integers));
        method(integers, 1, 5);
        System.out.println(Arrays.toString(integers));

    }

    public static <T> void method(T[] array, int position1, int position2) {
        T element1 = array[position1];
        T element2 = array[position2];
        array[position1] = element2;
        array[position2] = element1;
    }
}
