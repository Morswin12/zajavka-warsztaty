package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P20_List_ArrayList_LinkedList__Zaawansowane_kolekcje;

import java.util.*;

public class Main {

    /*
    void add(E element) - dodoaj element na koncu listy
    void add(int index, E element) - dodaj eleent na miejscu index, a reszte przesuń do przodu
    E get(int index) - zwróć element na indexie
    int indexOf(Object o) zwróć pierwszy pasujący index, albo -1 jak nie ma takiego
    int lastIndexOf(Object o) zwróć ostatni pasujący index, albo -1 jak nie ma takiego
    E remove(int index) - usuń element na podanym indexie i przesuń pozostałe do przodu
    E set(int index, E e) - zamień element na podanym indexie i zwróć poprzedni elament
     */

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = List.of("a", "b", "c");
        List<String> list3 = Collections.singletonList("a");
        List<String> list4 = Collections.emptyList();
        List<String> list5 = new LinkedList<>();
        List<String> list6 = new ArrayList<>();

        System.out.println(list6);
        list6.add("a");
        list6.add("b");
        list6.add("c");
        list6.add(2,"d");
        list6.add("e");
        list6.add("f");
        list6.add("c");
        System.out.println(list6);
        System.out.println(list6.indexOf("c" ));
        System.out.println(list6.lastIndexOf("c" ));
        list6.remove("c");
        list6.remove(5);
        System.out.println(list6);
        System.out.println(list6.remove("b"));
        System.out.println(list6);
        System.out.println(list6.remove(2));
        System.out.println(list6);
        System.out.println(list6.set(1, "r"));
        System.out.println(list6);
        list6.add("e");


    }
}
