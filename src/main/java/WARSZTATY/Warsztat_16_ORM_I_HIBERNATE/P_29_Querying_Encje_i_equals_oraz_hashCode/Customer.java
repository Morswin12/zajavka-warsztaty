package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_29_Querying_Encje_i_equals_oraz_hashCode;

import jakarta.persistence.*;
import lombok.*;

//@Data // -> musimy zastąpić adnotację @Data ponieważ nadpisuje ona metody equals() i hashCode(). Dlatego zamiast tego
//            dodamy @Getter, @Setter, @ToString
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "email") // dzięki temu hashCode będzie generowany z wartości email, który to jest tu unikalny.
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;

    // Mapowanie, aby w kodzie odzwierciedlić relację one-to-one;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", unique = true)
    private Address address;
}
