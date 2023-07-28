package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P14_COMPARATOR__Porownywanie_obiektow;

public class Cat {
    private Integer id;
    private String name;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat: " + id + ", " + name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
