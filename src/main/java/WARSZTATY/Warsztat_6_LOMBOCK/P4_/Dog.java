package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import lombok.*;

@Data
@AllArgsConstructor
public class Dog {
    private final String name;
    private @NonNull int age;
    private Owner owner;

    public void consume(@NonNull String whatToConsume) {
        System.out.println("Consuming: " + whatToConsume);
    }
}
