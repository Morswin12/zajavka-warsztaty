package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P13_Java_15;

public class Main {
    public static void main(String[] args) {
        // 1. Text Blocks
        String string = "dsdff" +
                "dfsdfsdf" +
                "sdfsdfsdf" +
                "sdfdsffff" +
                "ffffffff";

        String string2 = """
                dsdff
                dfsdfsdf
                sdfsdfsdf
                sdfdsffff
                ffffffff\n""";

        System.out.println(string);
        System.out.println();
        System.out.println(string2);

        // 2. Character escaping
        String string3 = "qwer \\\\\\\\\\\\\\\\ Asdf \"zxcv\"";
        String string4 = "qwer " + System.lineSeparator() + " Asdf \"zxcv\"";

        System.out.println(string3);
        System.out.println(string4);

        String string5 = """
                Zajavka %s dssd
                sdfsdfsdf %d
                dfde
                erer
                sssss""".formatted(" goro ", 44);

        System.out.println(string5);

        // Preview features:
        // 3. Pattern Matching instanceof
        // 4. Records - rodzaj klasy która tylko przechowuje dane
        // 5. Sealed Classes - klasy zapieczętowane


    }


}
