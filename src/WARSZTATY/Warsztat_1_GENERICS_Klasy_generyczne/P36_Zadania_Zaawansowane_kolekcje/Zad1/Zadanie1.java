package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Wyobraź sobie, że idziesz do muzeum motoryzacji i wypisujesz sobie samochody, które chcesz tam
zobaczyć. Wypisujesz informacje takie jak: marka, model oraz rocznik. Idziesz tam z inną osobą i ona też
wypisuje swoje. Przedstaw to co napisaliście w postaci 2 list zawierających obiekty klasy Car. Klasa Car
ma posiadać pola brand, model oraz year. Następnie sklej ze sobą te 2 listy, tak aby wyeliminować
powtarzające się samochody, które dodaliście i przedstaw zawartość na ekranie posortowaną najpierw
po roku rosnąco, potem po marce rosnąco oraz po modelu rosnąco. Załóżmy, że taka byłaby kolejność
oglądania eksponatów w muzeum.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Set<Car> cars1 = new HashSet<>();
        Set<Car> cars2 = new HashSet<>();
        cars1.add(new Car("Peugeot", "307SW", 2007));
        cars1.add(new Car("Peugeot", "308SW", 2009));
        cars1.add(new Car("Peugeot", "207SW", 2001));
        cars1.add(new Car("BMW", "3", 2002));
        cars1.add(new Car("Peugeot", "307SW", 2005));

        cars2.add(new Car("Peugeot", "307SW", 2007));
        cars2.add(new Car("Peugeot", "308SW", 2009));
        cars2.add(new Car("Peugeot", "207SW", 2002));
        cars2.add(new Car("Peugeot", "307", 2002));
        cars2.add(new Car("Skoda", "207SW", 2002));
        cars2.add(new Car("BMW", "4", 2002));
        cars2.add(new Car("Peugeot", "307SW", 2014));


        Set<Car> carsList = new TreeSet<>();
        carsList.addAll(cars1);
        carsList.addAll(cars2);


        System.out.println(cars1);
        System.out.println(cars2);
        System.out.println(carsList);
     }
}
