package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P38_P40_PROJEKT;

import java.util.Deque;

public class CustomQueue<T> {

    private final Deque<T> queue;

    public CustomQueue(Deque<T> queue) {
        this.queue = queue;
    }

    /*
                "ADD PERSON(Zbigniew_Ratownik)",
                "PROCESS",
                "LEAVE PERSON(Tomasz_Romański_2)",

     */
    public void processCommand(String s) {
        if (s.contains("ADD PERSON")) {
            handleAddPerson(s);
        } else if (s.contains("LEAVE PERSON")) {
            handleLeavePerson(s);
        } else if (s.contains("PROCESS")) {
            handleProcess();
        } else {
            throw new RuntimeException("O co ci chodzi z tą komendą? : " + s);
        }
    }

    private void handleProcess() {

    }

    private void handleLeavePerson(String s) {

    }

    private void handleAddPerson(String s) {
        String[] split = s
                .replace("ADD PERSON(", "")
                .replace(")", "")
                .split("_");
        if (split.length == 2) {
            String name = split[0];
            String surname = split[1];
            System.out.println(name + " " + surname);
        }
    }
}
