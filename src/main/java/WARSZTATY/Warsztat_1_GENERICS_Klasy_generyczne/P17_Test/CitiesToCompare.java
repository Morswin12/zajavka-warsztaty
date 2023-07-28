package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P17_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitiesToCompare implements Comparator<CitiesToCompare> {

    private final String someText;
    private final Integer someNumber;

    public CitiesToCompare(final String someText, final int someNumber) {
        this.someText = someText;
        this.someNumber = someNumber;
    }

    @Override
    public String toString() {
        return someNumber.toString();
    }

    @Override
    public int compare(CitiesToCompare element1, CitiesToCompare element2) {
        return element1.someText.compareTo(element2.someText);
    }

    public static void main(String[] args) {
        CitiesToCompare element1 = new CitiesToCompare("Text1", 2);
        CitiesToCompare element2 = new CitiesToCompare("Text2", 1);

        List<CitiesToCompare> list = new ArrayList<>();
        list.add(element1);
        list.add(element2);

//        Collections.sort(list);

        System.out.println(list);
    }
}
