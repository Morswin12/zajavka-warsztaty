package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P6_Generics__Unbounded_Wildcards_Nieograniczony_Symbol_wieloznaczny;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardsMain {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("AJava java learning!");

        List<Tuna> tunas = new ArrayList<>();
        tunas.add(new Tuna());

        print(stringList);
        print(tunas);

        List elements = new ArrayList();
        elements = tunas;
        elements.add(stringList);
        elements.add("asdf");

        List<?> elements2 = new ArrayList();
        elements = tunas;
        elements.add(stringList);
        elements.add("zxcvqwer");

        print(elements);
        print(elements2);
    }

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    static class Tuna {
        @Override
        public String toString() {
            return "Tuna{}";
        }
    }
}

