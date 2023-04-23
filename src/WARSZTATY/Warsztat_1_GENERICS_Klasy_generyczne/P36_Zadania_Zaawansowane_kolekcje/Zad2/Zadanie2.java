package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad2;

import java.util.*;

/*
Napisz implementację książki telefonicznej, która umożliwi wprowadzenie przez użytkownika osoby
wraz z numerem telefonu, w sposób pokazany poniżej:
• Jan Kowalski +48000192871
• Stefan Nawrocki +48000125847
• Anna Tomaszewska +48000421458
Dodaj te osoby do Mapy w taki sposób, żeby kluczem było nazwisko, a wartością zbiór osób
występujących pod takim nazwiskiem, posortowanych w kolejności nazwisko, a potem imię. Po każdej
dodanej osobie, wyświetl zawartość mapy na ekranie. Spraw, żeby osoby były posortowane w książce po
nazwisku. Dla uproszczenia załóż, że osoby mogą mieć tylko jedno imię i tylko jedno nazwisko.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Snopek", "Paweł", "+123456789"));
        personList.add(new Person("Snopek", "Paweł", "+420392929"));
        personList.add(new Person("Żak", "Anna", "+123456789"));
        personList.add(new Person("Żak", "Paweł", "+123456789"));
        personList.add(new Person("Żak", "Agnieszka", "+123456789"));
        personList.add(new Person("Snopek", "Dariusz", "+123456789"));
        personList.add(new Person("Snopek", "Dariusz", "+123456789"));
        personList.add(new Person("Skiba", "Norbi", "+123456789"));
        personList.add(new Person("Szafran", "Michał", "+123456789"));
        personList.add(new Person("Szafran", "Michał", "+123456789"));
        personList.add(new Person("Adams", "Czarek", "+123456789"));
        personList.add(new Person("Adams", "Michał", "+123456789"));
        personList.add(new Person("Matlak", "Mariusz", "+333356789"));
        personList.add(new Person("Matlak", "Mariusz", "+333356789"));
        personList.add(new Person("Matlak", "Ewa", "+343356789"));

        Map<String, Set<Person>> phoneList = new TreeMap<>();
        System.out.println(phoneList);

        for (Person person : personList) {
            System.out.println();
            System.out.println("Dodaj do ksiki: " +person);
            String surname = person.getSurname();
            if (phoneList.containsKey(surname)) {
                TreeSet<Person> peopleSet = (TreeSet<Person>) phoneList.get(surname);
                peopleSet.add(person);
                phoneList.put(surname, peopleSet);
            } else {
                TreeSet<Person> value = new TreeSet<>();
                value.add(person);
                phoneList.put(surname, value);
            }
            System.out.println(phoneList);
        }

        System.out.println();
        for (Map.Entry<String, Set<Person>> stringSetEntry : phoneList.entrySet()) {
            System.out.println(stringSetEntry.getKey()+": "+ stringSetEntry.getValue());
        }

    }
}

