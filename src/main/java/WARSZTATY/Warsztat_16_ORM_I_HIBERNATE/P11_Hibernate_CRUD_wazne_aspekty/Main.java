package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P11_Hibernate_CRUD_wazne_aspekty;

public class Main {
    /*
    Przypominamy sobie, że w skrócie transakcja jest to jednostka pracy, która jest wykonana na bazie danych. Schemat
        działania transakcji składa się z 3 podstawowych operacji:
        - begin -> komenda rozpoczynająca transakcję;
        - commit -> komenda kończąca transakcję i wprowadzająca zmiany w bazie danych;
        - rollback -> komenda kończąca transakcję i wycofująca wprowadzane zmiany w bazie danych;

    Transakcje muszą spełniać zasadę ACID, czyli
        - niepodzielność -> transakcja wykona się cała, albo wcale,
        - spójność -> musi zmienić dane, których dotyczy tylko w dozwolony sposób,
        - izolację (Constituency-> każda transakcja powinna wykonać się w całkowitej izolacji bez wiedzy o istnieniu
            innych transakcjach;
        - trwałość -> po zakończeniu transakcji wprowadzone zmiany są trwałe, nawet w przypadku awarii prądu

    W Hibernate transakcje są bardzo blisko związane z Obiektem Session, bo to na nim wykonujemy komendy jak:
        - session.beginTransaction();
        - session.getTransaction().commit();
        - session.getTransaction().rollback();

    Session jest Closeable, czyli możemy używać w try with resources.


    Na obiekcie Session możemy także wykonać inne metody, jak np.:
        - persist() -> było wcześniej;
        - remove() -> było wcześniej;
        - refresh() -> wyciągnięcie wszystkich zmian stanu encji z bazy danych, które zostały wykonane poza bieżącą
            sesją i po wczytaniu encji; Metodę tą możemy zastosować, gdy będziemy mieli do czynienia z sytuacją, gdzie
            nasza baza danych będzie modyfikowana przez jakaś inną aplikację i w konsekwencji encja, nad którą
            pracujemy może nie posiadać najnowszych informacji o swojej reprezentacji w bazie danych. W takim przypadku
            refresh() odświeży nam encję najnowszymi danymi z bazy danych; Metoda ta przeładowuje wartości pól,
            nadpisując je. Używa się jej raczej rzadko;
        - marge() -> może być rozumiane odwrotnie do metody refresh(). Zaktualizuje bazę danych wartościami z encji.
            Będziemy tego używać, gdy mamy encje w stanie detached, a będziemy chcieli przenieść ją do stanu persistent.
        - detached() -> wyciąga nam daną encję z persistent context


    Różnice
                    JPA             a               Hibernate
                    Interfejs                      Implementacja tego Interfejsu
                    EntityManager                   Session
                                                Wiele metod jest oznaczone jako @Deprecated
      */


}
