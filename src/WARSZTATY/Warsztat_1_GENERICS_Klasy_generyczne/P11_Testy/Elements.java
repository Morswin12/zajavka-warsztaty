package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P11_Testy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Elements {
    public void printFirstElement(List<?> list) {
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        Elements elements = new Elements();
        List<?> list = new ArrayList<>();
        elements.printFirstElement(list);
    }
}
