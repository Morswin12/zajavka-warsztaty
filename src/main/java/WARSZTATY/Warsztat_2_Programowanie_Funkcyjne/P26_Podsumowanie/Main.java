package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P26_Podsumowanie;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //map(Function)
        //flatMap(Function)
        //filter(Predicate)
        //peek(Consumer)
        //skip(3)
        //limit(2)
        //sorted(Comparator)
        //distinct()




        Optional<Object> empty = Optional.empty();
        empty.flatMap(a -> Optional.of(a));
        Stream<Object> empty1 = Stream.of("ASAS", "ASASASSA");
        Stream<Object> objectStream = empty1.flatMap(a -> Stream.of(a));
        System.out.println(objectStream);

    }
}
