package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P34_Zadania;

public class Zad5 {
    public static void main(String[] args) {
        String string = "kobylamamalybok";
        String string1 = "rower";
        String string2 = "kajak";

        System.out.println("Is \"" + string + "\" palindron? : " + checkPalindrom(string));
        System.out.println("Is \"" + string1 + "\" palindron? : " + checkPalindrom(string1));
        System.out.println("Is \"" + string2 + "\" palindron? : " + checkPalindrom(string2));

        System.out.println();
        System.out.println("Is \"" + string + "\" palindron? : " + checkPalindrom2(string));

        System.out.println();
        System.out.println("Is \"" + string + "\" palindron? : " + checkPalindrom3(string));
    }

    private static boolean checkPalindrom(String string) {
        String reduce = string
                .chars()
                .boxed()
                .map(i -> Character.toString(i))
                .reduce((l, r) -> r.concat(l))
                .orElse("no word ");
        System.out.println("original: " + string);
        System.out.println("reversed: " + reduce);

        return reduce.equals(string);
    }

    private static boolean checkPalindrom2(String string) {
        var reduce = string
                .chars()
                .mapToObj(i -> String.valueOf((char) i))
                .reduce((l, r) -> r.concat(l))
                .orElse("no word ");
        System.out.println("original: " + string);
        System.out.println("reversed: " + reduce);

        return reduce.equals(string);
    }

    private static boolean checkPalindrom3(String string) {
        String noWord = string.chars()
                .boxed()
                .map(String::valueOf)
                .reduce(String::concat)
                .orElse("no word");

        var reduce = string
                .chars()
                .mapToObj(String::valueOf)
                .reduce((l, r) -> r.concat(l))
                .orElse("no word ");

        System.out.println("original: " + noWord );
        System.out.println("reversed: " + reduce);

        return reduce.equals(noWord);
    }
}
