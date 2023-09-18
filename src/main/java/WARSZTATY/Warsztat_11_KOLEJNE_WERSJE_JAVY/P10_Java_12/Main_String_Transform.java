package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P10_Java_12;

import java.util.Arrays;

public class Main_String_Transform {
    public static void main(String[] args) {
        String input = "Hej co tam słychać zajavkowicze?";
        Integer transform = input.transform(element -> element.length());
        System.out.printf("String: \"%s\" have: %s length%n", input, transform );

        String[] s = input.transform(el -> el.split(" "));
        System.out.println(Arrays.toString(s));
    }
}
