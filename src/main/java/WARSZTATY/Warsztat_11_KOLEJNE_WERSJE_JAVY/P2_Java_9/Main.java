package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P2_Java_9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Jshell -> konsola, dzięki której możemy przetestować prosty kod bez konieczności uruchamiania main itp.
                    Możemy uruchomić w terminalu .cmd (Windows) wpisując "jshell" lub w Intelij'u (2 razy shift i
                    wpisujemy "Jshell"

        List.of() - powstało w Java 9 - pozwala stworzyć listę w prostszy sposób, jednak jest to lista immutable, czyli
                    niemutowalna i nie możemy do niej dodawać lub edytować nowych pozycji itp.
                    Ale możemy ją dodać do np. Arraylist i nie ma tego problemu:
        */
        List.of("asdasda", "sadsad");
        new ArrayList<>(List.of("abs", "cde"));
        new ArrayList<>(Arrays.asList("abs", "cde"));


        /* podobnie jest w przypadku poniższych konstrukcji:
        Java 1.4
        */
            new ArrayList<>(Collections.emptyList());
//        Java 1.3
            new ArrayList<>(Collections.singletonList("asd"));

        /*
        Set.of()  -> podobnie jak List.of() i też możemy opakować w ArrayList'e
         */
        new ArrayList<>(Set.of(2, 4, 5, 5, 2, 3));
        /*
        Map.of()  -> podobnie jak List.of(). Maksymalnie możemy dodać 10 par kluczy z wartościami. Też jest niemutowalna
                        i nie możemy dodawać nowych pozycji, ale podobnie jak wcześniej możemy:
         */
        new HashMap<>(Map.of(1, "1", 2, "2", 3, "3"));

//        Map.ofEntries() - podobnie jak wyżej, ale można dodać więcej niż 10 pozycji, ale opakowanych w entyr:
        Map.ofEntries(Map.entry(1, "1"), Map.entry(2,"2"));
        //podobnie jak wyżej, aby móc modyfikować trzeba opakować w hashmap:
        new HashMap<>(Map.ofEntries(Map.entry(1, "1"), Map.entry(2, "2")));

    }
}
