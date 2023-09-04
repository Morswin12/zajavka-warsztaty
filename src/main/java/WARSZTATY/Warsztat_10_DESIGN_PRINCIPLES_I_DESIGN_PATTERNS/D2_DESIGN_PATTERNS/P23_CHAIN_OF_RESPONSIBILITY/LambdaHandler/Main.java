package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.LambdaHandler;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> textZajavkaHandler = (String input) ->
                input.replace("zajavka nie jest super" , "zajavka jest super");
        UnaryOperator<String> textBugHandler = (String input) ->
                input.replace("w zadaniu jest błąd", "w zadaniu nie ma błędu");
        UnaryOperator<String> textOpinionHandler = (String input) ->
                input.replace("mam złą opinię o zajavce", " zajavka jest super");

        Function<String, String> pipeline = textZajavkaHandler
                .andThen(textBugHandler)
                .andThen(textOpinionHandler);

        String input = "Wziąłem udział w zajavce i powiem wam, że zajavka nie jest super. " +
            "Zrobiłem zadanie i w zadaniu jest błąd. " +
            "Podsumowując mam złą opinię o zajavce";

        String result = pipeline.apply(input);

        System.out.println(result);
    }
}
