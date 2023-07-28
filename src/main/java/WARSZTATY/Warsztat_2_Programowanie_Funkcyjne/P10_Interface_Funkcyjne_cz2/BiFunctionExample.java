package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P10_Interface_Funkcyjne_cz2;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        Caller caller = new Caller();
        BiFunction<Table, Chair, String> tableChairStringBiFunction = caller ::stringWithTAndC;

        String apply = tableChairStringBiFunction.apply(new Table(), new Chair());
        System.out.println(apply);
    }

    static class Caller {
        String stringWithTAndC(Table t, Chair c) {
            System.out.println(t + "\n" + c);
            return t.getClass().getSimpleName() + " " + c.getClass().getTypeName();
        }
    }

    private static class Table {
        private String name = "Debowy";

        @Override
        public String toString() {
            return "Table{" + name + '}';
        }
    }

    private static class Chair {
        private String name = "Bukowe";

        @Override
        public String toString() {
            return "Chair{" + name + '}';
        }
    }
}
