package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_26_Querying_FetchMode;

public class Main {
    /*
    todo
        FetchType -> Możemy go rozumieć jako "Czy pobierać powiązane encje?". ten parametr przypisywaliśmy w Fetch w
                właściwościach relacji. Ustawiamy go we właściwościach adnotacji @OneToMany/@ManyToMany przypisując do
                "fetch = FetchType.(do wyboru: LAZY, EAGER". FetchType umieszczony jest w paczce jakarta.persistence
                oznacza to, że FetchType jest mechanizmem typowym dla JPA
        FetchMode -> Możemy go rozumieć "Jak pobierać powiązane encje?". Ustawiamy go pod adnotacjami
                @OneToMany/@ManyToMany używając adnotacji @Fetch(value = FetchMode.(do wyboru: JOIN,SELECT,SUBSELECT).
                zarówno @Fetch jak i FetchMode pochodzą z paczki org.hibernate.orm:hibernate-core, czyli jest to
                mechanizm typowy dla Hibernate.
            -> @Fetch(value = FetchMode.SELECT) - jest to domyślne ustawienie, gdy nie wpiszemy nic. To ustawienie
                    sprawia, że wywoływany jest oddzielny select do encji zależnej.
                    W przypadku relacji jeden do wielu (@OneToMany), Hibernate użyje osobnych zapytań SELECT do
                    pobrania powiązanych danych dla każdego elementu kolekcji.
            -> @Fetch(value = FetchMode.JOIN) - dzięki temu ustawienia zapytanie z encji zależnej jest joinowane i
                    zamiast 2 mamy jedno.
                    oznacza, że Hibernate spróbuje załadować powiązane dane, wykonując złączenie (JOIN) z głównym
                    zapytaniem.
                    W praktyce oznacza to, że Hibernate spróbuje połączyć dane związane z encją podczas wykonywania
                    zapytania, co może być skuteczne w przypadku pewnych sytuacji, ale może również prowadzić do
                    większej ilości danych pobieranych niż potrzebne.
            -> @Fetch(value = FetchMode.SUBSELECT) - możemy oznacza, że Hibernate użyje jednego zapytania subselect do
                    pobrania danych związanych z kolekcją encji.
                    W praktyce oznacza to, że Hibernate wykorzysta jedno zapytanie SQL do pobrania wszystkich danych
                    związanych z kolekcją, co może być bardziej wydajne niż wykonywanie osobnych zapytań dla każdego
                    elementu kolekcji.
            Jakie domyślne zachowania są stosowane przez Hibernate do FetchMode, jeśli go nie ustawimy:
                -> Jeśli mamy ustawione FetchType.LAZY to domyślne ustawienie jest FetchMode.SELECT
                -> Jeśli mamy ustawione FetchType.EAGER to:
                    -> Jeśli pobieramy wartość przez session.find(), to domyślne ustawienie będzie FetchMode.JOIN;
                    -> Jeśli pobieramy wartość przez JPQL, to domyślne ustawienie będzie FetchMode.SELECT;

     */
}
