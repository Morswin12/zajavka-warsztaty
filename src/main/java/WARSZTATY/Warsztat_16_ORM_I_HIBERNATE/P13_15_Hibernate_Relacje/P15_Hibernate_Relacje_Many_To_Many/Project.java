package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P15_Hibernate_Relacje_Many_To_Many;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
//@ToString(exclude = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "project")
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "deadline")
    private OffsetDateTime deadline;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees;
}
