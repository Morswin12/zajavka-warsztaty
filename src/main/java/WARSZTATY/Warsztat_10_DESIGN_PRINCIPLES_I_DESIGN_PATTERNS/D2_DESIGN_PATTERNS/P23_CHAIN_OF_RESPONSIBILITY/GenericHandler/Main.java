package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.GenericHandler;

public class Main {
    public static void main(String[] args) {
        GenericHandler<String> textBugHandler = new TextBugHandler();
        GenericHandler<String> textOpinionHandler = new TextOpinionHandler();
        GenericHandler<String> textZajavkaHandler = new TextZajavkaHandler();
        textBugHandler.setNextHandler(textOpinionHandler);
        textOpinionHandler.setNextHandler(textZajavkaHandler);

        String result = textZajavkaHandler.handle("Wziąłem udział w zajavce i powiem wam, że zajavka nie jest super. " +
                "Zrobiłem zadanie i w zadaniu jest błąd. " +
                "Podsumowując mam złą opinię o zajavce");

        String result2 = textBugHandler.handle("Wziąłem udział w zajavce i powiem wam, że zajavka nie jest super. " +
                "Zrobiłem zadanie i w zadaniu jest błąd. " +
                "Podsumowując mam złą opinię o zajavce");

        System.out.println(result);
        System.out.println();
        System.out.println(result2);
    }
}
