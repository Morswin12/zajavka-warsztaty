package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_27_Querying_JPQL_Problem_n_plus_1;

public class Main {
    /*
    todo
        Problem n + 1 (skupimy się na wydajności zapytań Hibernate w odniesieniu do tego problemu)
            -> Problem ten jest związany z pobieraniem kolekcji. Najczęściej przejawia się w relacjach One-to-many, a
                z racji, że jest to najczęstsza relacja, to problem ten również często występuje. Dlatego powinniśmy
                dogłębnie poznać tak potężne narzędzia jak Hibernate i rozumieć co robią pod spodem za nas, aby dobrze
                poustawiać właściwości i znać konsekwencje naszych wyborów.
            -> Jeżeli oprzemy się o wartości domyślne i będziemy kodować bez zastanowienia to dojść do sytuacji, gdzie
                aplikacja w ciągu sekundy będzie generowała 500 zapytań na sekundę do bazy danych, a odpowiednia
                konfiguracja zredukuje tą ilość np. do 10. Dlatego widać, że programista oprócz odpowiedniego jest
                odpowiedzialny zarówno za poprawność biznesowego działania, jak również za wydajność aplikacji.
            -> Czyli podstawowy problem jaki stoi za n + 1, to tragiczny spadek wydajności.
            -> Jak ten problem zauważyć? Najlepiej i najszybciej np. przez analizę generowanych zapytań przez
                Hibernate. Dlatego należy mieć ustawione np. w HibernateUtil Map.Entry(Environment.SHOW_SQL, true) i
                obserwować, czy nie ma zbyt dużo zapytań, które można ograniczyć lub łączyć.

    @Fetch(value = FetchMode.JOIN) -> joinując zapytania z podrzędnych encji ograniczamy wiele zapytań do jednego
                            rozbudowanego.

    @BatchSize(size = 3) - adnotacja którą możemy ustawić pod adnotacja @OneToMany, która decyduje o ilości podrzędnych
                            encji, które będą joinowane z zapytaniem do encji głównej. Czyli np. jeśli mamy 100
                            właścicieli i każdy ma po 5 zwierząt (zwierzęta są w osobnej tabeli) to przy ustawieniu
                            @BatchSize(size = 25), będziemy mieć 4 zapytania, zamiast 100. Stosujemy to np., gdy z
                            jakiegoś powodu nie działa nam JOIN FETCH, czy inny rodzaj łączenia zapytań.

     */
}
