package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad2;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private String phoneNumber;

    public Person(String surname, String name, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && phoneNumber.equals(person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        int i = this.surname.compareTo(o.surname);
        if (i == 0) {
            i += this.name.compareTo(o.name);
        }
        if (i == 0) {
            i += this.phoneNumber.compareTo(o.phoneNumber);
        }
        return i;
    }

    @Override
    public String toString() {
        return "[" + surname + ' ' + name + ": " + phoneNumber + "] ";
    }
}
