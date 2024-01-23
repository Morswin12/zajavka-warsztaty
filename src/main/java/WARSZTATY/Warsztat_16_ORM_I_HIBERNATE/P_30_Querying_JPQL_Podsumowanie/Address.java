package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_30_Querying_JPQL_Podsumowanie;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Data
@ToString(exclude = "customer") // musimy to dodać, ponieważ toString z @Data, powoduje wyciąganie z zapętleniem informacji o Customer w Address i odwrotnie, bo oba są od siebie zależne
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address")
    private String address;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "address", cascade = CascadeType.ALL)
    private Customer customer;
}