package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P14_COMPARATOR__Porownywanie_obiektow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleClass {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "A", "1", "aA", "Aa", "A1", "a1", "1A");
        System.out.println(strings);
//        Collections.sort(strings);
//        System.out.println(strings);
        Comparator<String> comparator1 = Comparator.naturalOrder();
        strings.sort(comparator1);
        System.out.println(strings);
        Comparator<String> comparator = comparator1.reversed();
        strings.sort(comparator);
        System.out.println(strings);
        System.out.println();

        List<String> strings2 = Arrays.asList("af", "fA", "1", "2aA", "Aa", "A1", "a1", "1A");
        System.out.println(strings2);
        Comparator<String> comparator2 = Comparator.<String>naturalOrder().reversed();
        strings2.sort(comparator2);
        System.out.println(strings2);

        System.out.println();
        List<Cat> cats = Arrays.asList(
                new Cat(3, "Krzysio"),
                new Cat(2, "Stasio"),
                new Cat(1, "Rysio"),
                new Cat(7, "Rysio"),
                new Cat(8, "Rysio"),
                new Cat(6, "Karol"),
                new Cat(5, "Zbyś"),
                new Cat(4, "Prysio")
        );
        System.out.println(cats);
        Comparator<Cat> mySecondComparator = new Comparator<>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (o1.getName().equals(o2.getName())) {
                    i += o1.getId() - o2.getId();
                }
                return i;
            }
        };
        Comparator<Cat> myFirstComparator = new Comparator<>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getId() - o2.getId();
            }
        };

        cats.sort(myFirstComparator);
        System.out.println(cats);
        cats.sort(mySecondComparator);
        System.out.println(cats);
        cats.sort(mySecondComparator.reversed());
        System.out.println(cats);

        Comparator<Cat> my3Comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                int i = o1.getName().compareTo(o2.getName());
                return i;
            }
        }.thenComparing(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getId()-o2.getId();
            }
        });

        cats.sort(my3Comparator);
        System.out.println(cats);

        Comparator<Cat> catLambdaComperator = (c1, c2) -> {
            if (c1 == null) {
                return 1;
            } else if (c2 == null) {
                return -1;
            } else {
                int i = c1.getName().compareTo(c2.getName());
                if (i == 0) {
                    i += c1.getId() - c2.getId();
                }
                return i;
            }
        };

        Comparator<Cat> cat2LambdaComparator = Comparator.comparing((Cat c) -> c.getName()).reversed();

        Comparator<Cat> cat3LambdaComparator = Comparator
                .comparing((Cat c) -> c.getName())
                .thenComparingInt(c->c.getId());

        List<Cat> cats2 = Arrays.asList(
                new Cat(3, "Krzysio"),
                new Cat(2, "Stasio"),
                new Cat(1, "Rysio"),
                new Cat(7, "Rysio"),
                new Cat(1, "Rysio"),
                new Cat(6, "Karol"),
                new Cat(5, "Zbyś"),
                new Cat(4, "Prysio")
        );
        System.out.println();
        System.out.println(cats2);
        cats2.sort(catLambdaComperator);
        System.out.println(cats2);

        cats2.sort(cat2LambdaComparator);
        System.out.println(cats2);



//        cats.sort((f, s)->{
//            return f.getName().length()-s.getName().length();
//        });
//        System.out.println(cats);
    }
}
