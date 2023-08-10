package WARSZTATY.Warsztat_9_Diagramy_UML.P6_UML_Wiedza_praktyczna__Diagram_klas_i_Interfejsów__Relacje;

import java.util.List;

public class Human {
    private String name;
    private Heart heart;
    private List<Dog> dogs;

    public Human(final String name, final List<Dog> dogs) {
        this.name = name;
        this.heart = new Heart();
        this.dogs = dogs;
    }
}
