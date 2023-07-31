package WARSZTATY.Warsztat_6_LOMBOCK.P4_;

import WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Dog;
import WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Owner;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Adam");
        Owner owner2 = new Owner("Bartek");
        WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Dog dog1 = WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Dog.init("Burek", 3, owner1);
        WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Dog dog2 = WARSZTATY.Warsztat_6_LOMBOCK.P2_Adnotacje_cz_1.Dog.init("Burek", 3, owner2);
        System.out.println(dog1.equals(dog2));

        Dog andrzej = dog1.withAge(12).withName("Andrzej");
        System.out.println(andrzej);
    }
}
