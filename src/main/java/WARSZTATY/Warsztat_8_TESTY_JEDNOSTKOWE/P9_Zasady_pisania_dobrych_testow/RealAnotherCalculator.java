package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P9_Zasady_pisania_dobrych_testow;

import java.util.Random;

public class RealAnotherCalculator implements IAnotherCalculator{
    @Override
    public int run() {
        System.out.println("Real life implementation");
        int i = new Random().nextInt(10,20);
        return i;
    }
}
