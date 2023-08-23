package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P17_COMPOSITE;

public class Main {
    public static void main(String[] args) {
        /* Composite — używany, gdy chcemy, aby jakaś grupa obiektów zachowywała się w ten sam sposób, według jakichś
                narzuconych wzorców. Obiekty mają być traktowane jako rodzina. Np. mamy zoo i wszystkie zwierzęta muszą
                zostać nakarmione

        * Base Component -> interface (lub klas abstrakcyjna), który będzie reprezentował każde zwierzę w zoo. Będziemy
                            go używać np., aby nakarmić wszystkie zwierzęta, bo wszystkie zwierzęta muszą
                            zaimplementować jego metody;     (ANIMAL)
        * Leaf (liście) ->  każdy obiekt implementujący Base Component. Konkretne zwierzęta, poszczególne zwierzęta nie
                            wiedzą nic o sobie nawzajem;    (ZWIERZĘTA)
        * Composite     ->  klasa, która będzie w sobie zawierała kolekcje liści (Leafs) i będzie wywoływała metody dla
                            każdego z tych liści;           (ZOO)

         */

        ZOO zoo = new ZOO();
        Animal monkey1 = new Monkey();
        Animal monkey2 = new Monkey();
        Animal tiger1 = new Tiger();
        Animal tiger2 = new Tiger();
        Animal elephant = new Elephant();

        zoo.add(monkey1);
        zoo.add(tiger1);
        zoo.add(monkey2);
        zoo.add(elephant);
        zoo.add(tiger2);

        zoo.eat(new Food());
    }
}
