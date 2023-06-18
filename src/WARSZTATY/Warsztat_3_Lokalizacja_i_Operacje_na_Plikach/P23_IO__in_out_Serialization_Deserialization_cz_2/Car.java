package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {
    public static final long serialVersionUID = 1L;

    private final String name;
    private final Long year;

    private final List<Door> doors;
    private String someNull;

    public Car(String name, Long year, List<Door> doors) {
        this.name = name;
        this.year = year;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public Long getYear() {
        return year;
    }

    public List<Door> getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", someNull='" + someNull + '\'' +
                '}';
    }
}
