package WARSZTATY.Warsztat_9_Diagramy_UML.P5_UML__Wiedza_praktyczna__Diagram_klas_i_Interfejsow;

public class Main {
    public static void main(String[] args) {

        // Liczebności na diagramie UML (Zapisy przy strzałkach odnośnie do zależności):
        // 1        - jeden element;
        // 0..*     - 0 elementów lub dużo (od 0 do nieskończoności);
        // 0..1     - może być 0 lub 1 element
        // 1..*     - 1 lub więcej
        /*
        W związku z powyższymi zależnościami rozróżniamy 3 typy relacji:
        1. relacja jeden do jednego (one-to-one)    - jeden człowiek ma jedno serce;
        2. relacja jeden do wielu   (one-to-many)   - jeden człowiek może mieć kilka psów;
        3. relacja wielu do wielu   (many-to-many)  - jeden człowiek może mieć wiele aut, ale auto może mieć wielu właścicieli;

        Trzecią relację w kodzie możemy przedstawić poprzez np. dodatkową klasę pośrednią (Ownership {Właścicielstwo}), która będzie przechowywać zależności
         */
    }

}
