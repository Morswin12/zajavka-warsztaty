package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P38_P40_PROJEKT;

import java.util.Map;

public class Person {
    private final String name;
    private final String surname;
    private final String id;
    private Map<String, Integer> counterMap;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Integer counter = 1;
        this.id = generateId();
        String nameSurname = name + " " + surname;
        if (counterMap.containsKey(nameSurname)) {
            Integer value = counterMap.get(nameSurname) + 1;
            counterMap.put(nameSurname, value);
        } else {
            counterMap.put(nameSurname, counter);
        }
    }

    private String generateId() {
        return String.format("%s_%s_%s", this.name, this.surname, this.counterMap.get(name + " " + surname));
    }

    @Override
    public String toString() {
        return id;
    }

}
