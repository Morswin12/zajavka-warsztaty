package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P11_Transakcje__Zarzadzanie_deklaratywne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Long id;
    private String name;
    private Integer age;
}
