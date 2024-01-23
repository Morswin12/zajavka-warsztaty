package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Pet> pets;

    public void removePet(final Pet petToRemove) {
        pets.remove(petToRemove);
    }

}
