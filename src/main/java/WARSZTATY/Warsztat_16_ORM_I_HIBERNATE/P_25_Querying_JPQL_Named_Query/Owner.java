package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

@Entity
@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
@NamedQueries(
        {
                @NamedQuery(
                        name = "Owner.findAll",
                        query = "FROM Owner"

                ),
                @NamedQuery(
                        name = "Owner.findOwnerByEmail",
                        query = "FROM Owner WHERE email = :email"
                )
        }
)
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner", cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.JOIN)
    private Set<Pet> pets;

    public void removePet(final Pet petToRemove) {
        pets.remove(petToRemove);
    }

}
