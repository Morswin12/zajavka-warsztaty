package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P15_COMPARABLE__Porownywanie_obiektow;

public class Dog implements Comparable<Dog> {
    private final String name;
    private final Integer id;

    public Dog(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dog: " + name + "_" + id;
    }

    @Override
    public int compareTo(Dog o) {
//        int i = this.name.compareTo(o.name); //rosnąco
        int i = o.name.compareTo(this.name);   //malejaco
        if (i == 0) {
            i += o.id - this.id;
        }
        return i;
    }
}
