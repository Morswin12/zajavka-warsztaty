package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P17_Test;

import java.util.*;

public class CitiesToCompareAgain implements Comparable<CitiesToCompareAgain>, Comparator<CitiesToCompareAgain> {

    private final String someText;
    private final Integer someNumber;

    public CitiesToCompareAgain(final String someText, final int someNumber) {
        this.someText = someText;
        this.someNumber = someNumber;
    }

    @Override
    public String toString() {
        return someNumber.toString();
    }


    @Override
    public int compareTo(CitiesToCompareAgain element) {
        return element.someNumber - someNumber;
    }

    @Override
    public int compare(CitiesToCompareAgain element1, CitiesToCompareAgain element2) {
        return element1.someText.compareTo(element2.someText);
    }

    public static void main(String[] args) {
        CitiesToCompareAgain element1 = new CitiesToCompareAgain("Text1", 2);
        CitiesToCompareAgain element2 = new CitiesToCompareAgain("Text2", 3);
        CitiesToCompareAgain element3 = new CitiesToCompareAgain("Text3", 1);

        List<CitiesToCompareAgain> list = new ArrayList<>();
        list.add(element1);
        list.add(element2);
        list.add(element3);

        Collections.sort(list);

        System.out.println(list);

        quiz();
    }

    private static void quiz() {
        List<String> list = Arrays.asList("Warszawa", "Zakopane", "Augustów", "Jelenia Góra");
        Collections.sort(list, (e1, e2) -> e1.compareTo(e2));
        System.out.println(Collections.binarySearch(list, "Augustów"));
    }
}
