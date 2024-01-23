package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_28_Querying_Set_vs_List;

public class Main {
    /*
todo
    * Set vs List np. w relacjach OneToMany/ManyToMany
    * Użycie Set zamiast Listy zmniejsza nam ilość zapytań do bazy danych. Ale nie możemy mieć duplikatów oraz nie możemy
        go posortować co jest możliwe przy PersistenceBag z odpowiednimi adnotacjami. Set będzie zajmować więcej
        miejsca niż Lista. Hibernate-ową implementacją Set-a jest PersistentSet<Object>, który pod sobą ma HashSet,
        co sprawia, że musimy pamiętać o poprawnym zaimplementowaniu metod equals oraz hashcode.
    * W Hibernate mamy implementacje Listy w postaci PersistentBag<Object> implementującą List, która jest:
        -> unordered (nieuporządkowana) - nie zachowuje kolejności wstawiania elementów w liście (w przeciwieństwie np.
            do ArrayList<Object>, czy też LinkList<Object>). choć możemy użyć adnotacji @OrderBy("breed ASC"), co nam
            posortuje tą listę.
        -> unkeyed (bezkluczową???) - pozwala na przechowywanie duplikatów;
     */
}
