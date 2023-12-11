package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P8_Hibernate_Intro_cz2;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
