package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString(exclude = "pets")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "toy")
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toy_id")
    private Integer toyID;

    @Column(name = "what")
    private String what;

    @Column(name = "color")
    private String color;

    @ManyToMany(mappedBy = "toys")
    private Set<Pet> pets;
}
