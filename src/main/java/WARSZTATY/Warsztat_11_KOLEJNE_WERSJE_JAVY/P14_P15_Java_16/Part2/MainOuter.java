package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part2;

public class MainOuter {

    public static void main(String[] args) {
        // niestatyczna klasa po nowemu od java 16 może używać statycznych pól
        MainOuter outerNew = new MainOuter();
        InnerNonStatic innerStatic = outerNew.new InnerNonStatic();
        innerStatic.call();

        // po staremu klas musi być statyczna, żeby mieć statyczne pola
        MainOuter outerOld = new MainOuter();
        MainOuter.InnerStatic innerNonStatic = new MainOuter.InnerStatic();
        innerNonStatic.call();
    }

    static class InnerStatic {
        public static int b = 4;

        public void call() {
            System.out.println(b);
        }
    }

    class InnerNonStatic {
        public static int a = 2;    // przed Java 16 nie mona byo użyć stycznej zmiennej w klasie wewnętrznej, jeśli
        // nie była ona statyczna

        public void call() {
            System.out.println(a);
        }
    }
}
