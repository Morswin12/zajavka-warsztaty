package WARSZTATY.Warsztat_5_BUILDING_TOOLS.P4_Zaleznosci_cz1;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Jsoup.connect("https://app.zajavka.pl").get().title());
        System.out.println(Jsoup.connect("https://app.zajavka.pl").get().location());
    }
}
