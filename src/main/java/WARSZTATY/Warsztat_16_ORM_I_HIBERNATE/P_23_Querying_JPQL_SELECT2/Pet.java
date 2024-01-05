package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_23_Querying_JPQL_SELECT2;

import jakarta.persistence.*;
import lombok.*;

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



}
