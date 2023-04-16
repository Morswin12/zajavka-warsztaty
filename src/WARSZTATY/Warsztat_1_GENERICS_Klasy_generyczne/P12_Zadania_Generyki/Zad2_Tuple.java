package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P12_Zadania_Generyki;

public class Zad2_Tuple {
    public static void main(String[] args) {

    }
    private Object key;
    private Object value;

    public Zad2_Tuple(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
