package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

@Entity
@Builder
@Setter
@ToString(exclude = "owner")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "breed")
    private Breed breed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pet_toy",
            joinColumns = {@JoinColumn(name = "pet_id")},
            inverseJoinColumns = {@JoinColumn(name = "toy_id")}
    )
    @Fetch(value = FetchMode.SELECT)
    private Set<Toy> toys;
}
