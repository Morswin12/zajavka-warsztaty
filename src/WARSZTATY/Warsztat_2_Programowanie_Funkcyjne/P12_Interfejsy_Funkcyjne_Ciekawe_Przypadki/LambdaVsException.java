package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P12_Interfejsy_Funkcyjne_Ciekawe_Przypadki;

import java.util.function.Supplier;

public class LambdaVsException {
    public static void main(String[] args) {

        Supplier<String> supplier1 = LambdaVsException::wrapped;
        Supplier<String> supplier2 = LambdaVsException::staticCreationUnChecked;
    }

    private static String wrapped() {
        try {
            return staticCreationChecked();
        } catch (Exception e) {
            return "";
        }
    }

    private static String staticCreationChecked() throws Exception {
        return "staticCreationChecked";
    }

    private static String staticCreationUnChecked() throws RuntimeException {
        return "staticCreationUnChecked";
    }
}
