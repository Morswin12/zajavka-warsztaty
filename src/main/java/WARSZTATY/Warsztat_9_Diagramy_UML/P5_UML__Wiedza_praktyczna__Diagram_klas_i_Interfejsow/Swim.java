package WARSZTATY.Warsztat_9_Diagramy_UML.P5_UML__Wiedza_praktyczna__Diagram_klas_i_Interfejsow;

public interface Swim {

    String SWIMMING_SPEED = "50";

    static void someStaticMethod() {
        // ciało metody
    }

    default void cantSwim() {
        // ciało metody
    }

    String getName();
}
