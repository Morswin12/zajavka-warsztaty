package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P3_Resource_bundle.code;

import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Resource bandle
//        ResourceBundle
        System.out.println("Coś po polsku ");

        System.out.println(Locale.getDefault());
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("Store", Locale.ITALIAN);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Store", new Locale(args[0], args[1]));
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("Store", new Locale("pl","PL"));

        System.out.println();
        System.out.println(resourceBundle.getString("mainPage"));
        System.out.println();

        String mainPage = resourceBundle.getString("mainPage");
        String footer = resourceBundle.getString("footer");

        System.out.println(mainPage);
        System.out.println(footer);

        Map<String, String> collect = resourceBundle.keySet().stream()
                .collect(Collectors.toMap(key -> key, resourceBundle::getString));

        System.out.println(collect);

    }
}
