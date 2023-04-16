package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        List[] arraysList = new List[]{List.of(
                new String[]{"asdf", "qwer", "zxcv"},
                new String[]{"asdf", "qwer", "zxcv"},
                new String[]{"asdf", "qwer", "zxcv"}
        )};
        List asdf = List.of("asdf", "zxcv");
        int method = method(arraysList, asdf);
        System.out.println(method);
    }

    public static <T extends List<T>> int method(T[] arg1, T arg2) {
        return 0;
    }

    public static int method2(List[] arg1, List arg2) {
        return 0;
    }
}
