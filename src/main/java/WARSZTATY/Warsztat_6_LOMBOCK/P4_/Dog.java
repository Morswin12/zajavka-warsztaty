package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import lombok.*;

@Data

public class Dog {
    private final String name;
    private final int age;
    private final Owner owner;

    public void consume(@NonNull String whatToConsume) {
        System.out.println("Consuming: " + whatToConsume);
    }
}
