package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part1;

public record Person<T>(String name, String surname, Long age, T someField) implements Name {

    public Person{
        System.out.println("Calling constructor" + name);
    }

    public Person(String name) {
        this(name, "sdddddddddd", 333333333323L, null);
    }

    public static final String SOME_STRING = "SOME_STRING";

    public static final Integer COUNTER;

    static {
        COUNTER = 100;
    }

    boolean isMature() {
        return age >= 18;
    }

    @Override
    public String artistName() {
        return "Przekutacz";
    }
}
