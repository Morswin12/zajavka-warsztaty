package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Owner;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(staticName = "init")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@With
public class Dog {
    private @NonNull String name;
    private int age;
    //    @ToString.Exclude
    private Owner owner;

    public void consume(@NonNull String whatToConsume) {
        System.out.println("Consuming: " + whatToConsume);
    }
}
