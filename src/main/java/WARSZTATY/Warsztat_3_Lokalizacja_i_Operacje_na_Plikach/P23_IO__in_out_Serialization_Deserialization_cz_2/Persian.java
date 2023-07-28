package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

import java.io.Serializable;

public class Persian extends Cat implements Serializable {

    public Persian() {
        System.out.println("Calling Persian Default Constructor");
    }

    public Persian(String name, String nickName) {
        super(name, nickName);
        System.out.println("Calling Persian Normal Constructor");
    }
}
