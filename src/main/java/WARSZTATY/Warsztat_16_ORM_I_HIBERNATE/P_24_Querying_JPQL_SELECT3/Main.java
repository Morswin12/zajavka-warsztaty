package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_24_Querying_JPQL_SELECT3;

public class Main {
    /*
        HQL wspiera takie typy Join'ów jak:
            -> INNER JOIN - (domyślnie samo Join oznacza INNER JOIN). Szukamy przecięcia 2 zbiorów, czyli wyświetlimy
                    tylko te rekordy z tabeli owner, dla których znajdziemy dopasowanie w tabeli pet i jednocześnie
                    wyświetlimy tylko te rekordy z tabeli pet, dla których znajdziemy dopasowanie w tabeli owner. Stąd
                    analogia do przecięcia zbiorów.

            -> LEFT OUTER JOIN - (dłuższa nazwa od LEFT JOIN). Zwrócimy wszystkie rekordy z tabeli owner, nawet te,
                    dla których nie znaleźliśmy dopasowanie w tabeli pet i jednocześnie zwrócimy tylko te rekordy z
                    tabeli pet, dla których znaleźliśmy dopasowanie w tabeli owner.

            -> RIGHT OUTER JOIN - (dłuższa nazwa od RIGHT JOIN). Zwrócimy wszystkie rekordy z tabeli pet, nawet te,
                    dla których nie znaleźliśmy dopasowanie w tabeli owner i jednocześnie zwrócimy tylko te rekordy z
                    tabeli owner, dla których znaleźliśmy dopasowanie w tabeli pet.

            -> FULL OUTER JOIN - (dłuższa nazwa od RIGHT JOIN). Zwrócimy wszystkie rekordy z tabeli owner, nawet te,
                    dla których nie znaleźliśmy dopasowanie w tabeli owner i jednocześnie zwrócimy wszystkie rekordy z
                    tabeli pet, dla których nie znaleźliśmy dopasowanie w tabeli owner.

            -> CROSS JOIN - ten rodzaj Joina służy do generowania sparowanej kombinacji każdego wiersza z tabeli owner
                    z każdym wierszem z tabeli pet. Inaczej jest to znane jako iloczyn kartezjański (cartesian product).
                    Iloczyn kartezjański to iloczyn 2 zbiorów A i B. Efektem takiego iloczynu jest zbiór, który zawiera
                    wszystkie pary (a, b), gdzie 'a' należy do zbioru 'A', a 'b' do zbioru 'B'. Oznacza się go symbolem
                    A X B. Jeżeli mielibyśmy dwa zbiory A = {a, b} oraz B = {1, 2, 3} to iloczyn kartezjański
                    wyglądałby tak:
                    A X B = {{a, 1}, {a, 2},{a, 3}, {b, 1}, {b, 2}, {b, 3}}.


   */
}
