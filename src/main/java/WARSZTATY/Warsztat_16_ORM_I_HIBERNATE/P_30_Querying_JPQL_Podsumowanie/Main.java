package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_30_Querying_JPQL_Podsumowanie;

public class Main {
    /*
    Sortowanie wyników z Bazy danych:
        1. Możemy w HQL dopisać "ORDER BY" np: "SELECT ow FROM Owner ow ORDERED BY ow.email ASC, ow.name DESC;", i
            dzięki temu mamy sortowanie po emailu rosnąco, a  jeśli jest taki sam email, to po imieniu malejąco;
        2. Pod adnotacją zależności (@OneToMany) możemy napisać adnotację "@OrderedBy("breed ASC"). ale w tym przypadku
            musimy mieć Listę (np. private List<Pet> pets, a nie private Set<Pet> pets)
     */
}
