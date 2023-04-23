package WARSZTATY.MOJE_PROGRAMY.Nauka_Angielskiego;

import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Czasy czasy = Czasy.Present_Simple;
        Czasy[] listaCzasow = Czasy.values();
        System.out.println(czasy.getUses());
        BazaSow bazaSow = new BazaSow();
        TreeMap<String, String> slowka = (TreeMap<String, String>) bazaSow.getSlowka();

        Random random = new Random();
        int i = random.nextInt(listaCzasow.length);
        int nrLosowegoSlowa = random.nextInt(slowka.size());
        System.out.println(i);
        System.out.println(listaCzasow[i].getUses());

        for (int j = 0; j < slowka.size(); j++) {

        }
        System.out.println("\n" + slowka);

    }
}
