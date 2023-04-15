package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P1_Generyczne_Klasy;

public class Bag<T> {

    private T element;

    public void pack(T element) {
        this.element = element;
    }

    public T getElement(){
        return element;
    }

    public T empty() {
        T element = this.element;
        this.element = null;
        return element;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "element=" + element +
                '}';
    }
}
