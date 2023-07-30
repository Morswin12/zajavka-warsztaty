package WARSZTATY.Warsztat_5_BUILDING_TOOLS.P10_Maven_Fat_Jar_oraz_Profiles;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        System.out.println(Jsoup.connect("https://app.zajavka.pl").get().title());

    }
}
