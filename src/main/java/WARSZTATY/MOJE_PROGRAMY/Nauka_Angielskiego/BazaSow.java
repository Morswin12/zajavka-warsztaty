package WARSZTATY.MOJE_PROGRAMY.Nauka_Angielskiego;

import java.util.Map;
import java.util.TreeMap;

public class BazaSow {
    private TreeMap<String, String> slowka = new TreeMap<>();

    public BazaSow() {
        addSlowka();
    }

    private void addSlowka() {
        slowka.put("affect mood", "wpływać na nastrój");
        slowka.put("still life", "martwa natura");
        slowka.put("silly", "głupi");
        slowka.put("none of them", "żaden z nich");
        slowka.put("commit suicide", "popełnić samobójstwo");
        slowka.put("save up for", "oszczędzać na coś");
        slowka.put("landmark", "symbol miasta, np: wiea Eiffla");
        slowka.put("variety of products", "różnorodność produktów");
        slowka.put("friend or foe", "przyjaciel czy wróg");
    }

    public Map<String, String> getSlowka() {
        return slowka;
    }
}
