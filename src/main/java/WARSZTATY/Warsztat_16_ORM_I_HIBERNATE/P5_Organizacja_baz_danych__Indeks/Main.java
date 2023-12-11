package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P5_Organizacja_baz_danych__Indeks;

public class Main {
    public static void main(String[] args) {
        /*
        Indeks -> służy do przyspieszania wykonywania zapytań. Jest wskaźnikiem do danych w tabeli

        CREATE index idx_car_brand ON car(brand, model)
        CREATE index -> tworzymy index
        idx_car_brand ->idx to konwencja skrót od indeksu, car to nazwa tabeli, brand to nazwa kolumny
        ON -> czyli na co stawiamy indeks
        car(brand, model) -> i tu mamy indeks postawiony na 2-óch kolumnach: brand i model z tabeli car. Może być jedna
                            lub wiele kolumn, jednak gdy będziemy selectować (WHERE brand = BMW) tylko po jednej z
                            tych kolumn to indeks nie zostanie użyty
            Domyślnie indeks jest  stawiany na kluczu głównym (PRIMARY KEY)
         */
    }
}
