package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P10_Java_12;

public class Main_String_indent_transform {
    public static void main(String[] args) {
        String input = "###\n\tzajavka\n\t\tzajavka\n\t\tzajavka\n###";

//        System.out.println(input);

        System.out.println("#1\n" + input.indent(0));   // nic się nie dzieje
        System.out.println("#2\n" + input.indent(-1));  // usuwany jest jeden znak (u nas tabulator) z każdej lini
        System.out.println("#3\n" + input.indent(1));   // dodawana jest 1 spacja przed każdą inią

        System.out.println("#2\n" + input.indent(-5));  // usuwany jest jeden tabulator z każdej lini
        System.out.println("#3\n" + input.indent(8));   // dodawana jest 1 spacja przed każdą inią
    }
}
