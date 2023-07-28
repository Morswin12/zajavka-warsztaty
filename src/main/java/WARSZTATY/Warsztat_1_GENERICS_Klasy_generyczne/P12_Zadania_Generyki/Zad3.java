package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Zad3 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        int method = method(integerList, s -> s % 2 != 0);
        System.out.println("W liscie: " + integerList + " jest " + method + " nieparzystych liczb");

        int method2 = method(integerList, s -> s % 2 == 0);
        System.out.println("W liscie: " + integerList + " jest " + method2 + " parzystych liczb");

        List<String> stringList = new ArrayList<>();
        stringList.add("KOBYLAMAMALYBOK");
        stringList.add("kot");
        stringList.add("anna");
        stringList.add("ania");
        stringList.add("PoP");
        stringList.add("aaaaa");


        int method1 = method(stringList, s -> {
            int length = s.length();
            boolean result = true;
            for (int i = 0, j = length - 1; i < length; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    result = false;
                    break;
                }

            }
            return result;
        });

        System.out.println(method1);
    }

    public static <E extends Collection<T>, T> int method(E list, Predicate<T> predicate) {
        int counter = 0;
        for (Object o : list) {
            if (predicate.test((T) o)) {
                counter++;
            }
        }
        return counter;
    }
}
