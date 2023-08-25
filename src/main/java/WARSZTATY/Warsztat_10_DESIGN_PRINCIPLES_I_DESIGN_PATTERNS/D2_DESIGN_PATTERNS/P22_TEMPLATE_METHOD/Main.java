package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P22_TEMPLATE_METHOD;

public class Main {
    /* template method -> jest używany, wtedy gdy w kodzie chcemy określić jedno miejsce, które w sposób abstrakcyjny
                            określiłoby kroki jakiegoś algorytmu i konkretne implementacje tych kroków zostałyby
                            oddelegowane do konkretnych klas implementujących te kroki.
                            Przykład:
                            Budowa domu -> mamy liste kroków, które trzeba wykonać po kolei, żeby go wybudować. Nie
                                        wstawimy okien bez ścian, nie położymy dachu bez fundamentów, ścian, wieńców...
     */
    public static void main(String[] args) {

        HouseTemplate houseTemplate1 = new WoodenHouse();
        System.out.println(houseTemplate1);
        houseTemplate1.build();
        System.out.println();
        HouseTemplate houseTemplate2 = new BrickHouse();
        System.out.println(houseTemplate2);
        houseTemplate2.build();
    }
}
