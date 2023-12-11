package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P3_JPA_cz2;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // identyfikacja klasy jako Encja
@Table(name = "person") // określa, do jakiej tabeli odnosi się klasa encji
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu zaznaczamy, że klucze główne są generowane aromatycznie
                                                        // tak jak w pliku person.sql gdzie przy "person_id" jest: "SERIAL"
    @Column(name = "person_id")
    private Integer personID;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
