package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P38_P40_PROJEKT;

import java.util.ArrayDeque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomQueue<Person> personQueue = new CustomQueue<>(new ArrayDeque<>());

        List<String> inputList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz_Wilczek)",
                "ADD PERSON(Zbigniew_Ratownik)"
//                "PROCESS",
//                "LEAVE PERSON(Tomasz_Romański_2)",
//                "LEAVE PERSON(Mariusz_Wilczek)",
//                "PROCESS",
//                "PROCESS",
//                "PROCESS"
        );

        for (String s : inputList) {
            personQueue.processCommand(s);
        }
    }
}
