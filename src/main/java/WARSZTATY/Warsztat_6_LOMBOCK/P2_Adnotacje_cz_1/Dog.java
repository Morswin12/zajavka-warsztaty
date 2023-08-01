package WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(staticName = "init")
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@With
//@EqualsAndHashCode
//@ToString(onlyExplicitlyIncluded = true)
public class Dog {
//    @ToString.Include
    private @NonNull String name;
    private int age;
//    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Owner owner;

    public void consume(@NonNull String whatToConsume) {
        System.out.println("Consuming: " + whatToConsume);
    }
}
