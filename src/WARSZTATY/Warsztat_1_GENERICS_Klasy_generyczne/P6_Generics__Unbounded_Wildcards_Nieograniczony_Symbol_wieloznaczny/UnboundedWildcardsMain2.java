package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P6_Generics__Unbounded_Wildcards_Nieograniczony_Symbol_wieloznaczny;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardsMain2 {
    public static void main(String[] args) {

        Tuna<String> tuna1 = new Tuna<>();
        tuna1.eat("trash");
        Tuna<Integer> tuna2 = new Tuna<>();
        tuna2.eat(4);

        Tuna<?> newTuna = new Tuna<>();
        // nic ju nie mona przypisać bo java nie wie co tam ma być
//        newTuna.eat("asdf");
    }
    static class Tuna<U> {

        private U element;

        void eat(U element) {
            this.element = element;
        }
        @Override
        public String toString() {
            return "Tuna{}";
        }
    }
}

