package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

import java.util.Stack;

public class Zad6 {
    public static void main(String[] args) {
        SomeClassStock<Information> someClassStock = new SomeClassStock();
        someClassStock.add(new Book());
//        someClassStock.add("sadf");
        someClassStock.add(new Smartphone());
        someClassStock.put(new Smartphone());

    }

    static class SomeClassStock<T> extends Stack<T> {
        public void put(T smartphone) {
            this.add(smartphone);
        }
    }

    static interface Information {

    }
    static class Book implements Information {
    }

    static class Newspeapers implements Information {
    }

    static class Smartphone implements Information{
    }


}
