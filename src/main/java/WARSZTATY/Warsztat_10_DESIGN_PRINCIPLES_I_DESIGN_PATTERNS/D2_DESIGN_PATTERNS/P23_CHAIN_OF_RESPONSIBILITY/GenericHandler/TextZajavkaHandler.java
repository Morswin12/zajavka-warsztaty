package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.GenericHandler;

public class TextZajavkaHandler extends GenericHandler<String> {
    @Override
    protected String handleInput(String input) {
        return input.replace("zajavka nie jest super" , "zajavka jest super");
    }
}
