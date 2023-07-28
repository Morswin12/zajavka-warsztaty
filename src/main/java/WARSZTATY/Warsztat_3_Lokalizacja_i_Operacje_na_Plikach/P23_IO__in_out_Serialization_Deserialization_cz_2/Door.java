package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

import java.io.Serializable;

public class Door implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String which;

    public Door(String which) {
        this.which = which;
    }

    public String getWhich() {
        return which;
    }

    @Override
    public String toString() {
        return "Door{" +
                "which='" + which + '\'' +
                '}';
    }
}
