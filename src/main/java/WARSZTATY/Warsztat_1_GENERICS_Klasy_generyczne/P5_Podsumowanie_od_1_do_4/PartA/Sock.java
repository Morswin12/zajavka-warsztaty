package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P5_Podsumowanie_od_1_do_4.PartA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sock<T extends Collection<U>, U> {
    private List<T> item = new ArrayList<>();

    public Sock(T item) {
        this.item.add(item);
    }

    public boolean put(T element) {

        if ((element != null)&&(this.item == null || !this.item.equals(element))) {
            this.item.add(element);
            int size = element.size();
            System.out.println(size);
            return true;
        } else {
            return false;
        }
    }

    public T getItem() {
        return (T) item;
    }
}
