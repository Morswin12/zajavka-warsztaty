package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P9_Hibernate_Intro_cz3;

public class Main {
    public static void main(String[] args) {

        //TODO
        // Strategie zarządzania bazami danych (np. dodawanie, usuwanie, modyfikowanie tabel, kolumn):
        //      - narzędzia jak np. Flyway (taki Git dla baz danych) pozwala zapisywać historie zmian struktury bazy
        //          danych
        //      - hbm2ddl parametr. Ustawienie wartości hibernate.hbm2ddl.auto powoduje, że Hibernate będzie generował
        //          i wykonywał DDL (Data Definition Language) za nas automatycznie. Parametr ten może przyjąć
        //          następujące wartości:
        //              - none -> Hibernate nic nie robi z ddl;
        //              - create-only -> Hibernate ma utworzyć schemat bazy danych na podstawie modelu encji;
        //              - drop -> Hibernate ma usunąć schemat bazy danych na podstawie modelu encji;
        //              - create -> usuń i stwórz na nowo na podstawie modelu encji;
        //              - create-drop ->  usuń i stwórz na nowo na podstawie modelu encji, ale gdy zostanie zamknięty
        //                  EntityManagerFactory lub SessionFactory schemat bazy danych zostanie usunięty ponownie;
        //              - validate -> Hibernate ma sprawdzić, czy schemat bazy danych jest zgodny z modelem mapowana
        //                  encji;
        //              - update -> porównanie istniejącego schematu z mapowaniem encji i wygenerowanie odpowiednich
        //                  skryptów migracji schematu;
        // Cykl życia encji:
        //      - TRANSIENT -> encja, która nie ma swojej representacji persistence context i nie jest zarządzana w
        //          żadnej sesji. Obiekty te istnieją na stercie jaki normalny obiekt Java.
        //      - PERSISTENT (Managed) -> Encja jest już we władaniu Persistence context'u, co oznacza, że persistent
        //          provider (np. Hibernate) będzie pilnował zmian w encji. Do bazy danych zmiany są wprowadzane przy
        //          użyciu metody persist() wywołaną na obiekcie Session. Co ważne musi to być wykonane w obrębie
        //          aktywnej transakcji. Jeżeli encja jest w stanie persistent, zmiany w encji są automatycznie
        //          synchronizowane na bazie z momentem zatwierdzenia transakcji.
        //              Encja taka jest mapowana do konkretnego wiersza bazy danych, identyfikowanego przez klucz.
        //          Bieżąca sesja Hibernate jest odpowiedzialna za śledzenie wszystkich zmian dokonanych w zarządzanej
        //          encji i propagacje tych zmian do bazy danych.
        //      - DETACHED -> Stan oznaczający, że encja ma reprezentację w bazie danych, ale nie jest już zarządzana
        //          przez Session i nie jest śledzona przez persistence context. Wszelkie zmiany w tej encji nie
        //          zostaną odzwierciedlone w bazie danych i na odwrót. Encję taka można utworzyć zamykając sesje,
        //          z którą była powiązana lub usuwając ją z sesji za pomocą wywołania metody detach().
        //      - REMOVED -> użycie metody remove() z Session ustawia encję w stan Remove, co oznacza, że po
        //          zakończeniu transakcji odpowiedni wiersz w bazie danych zostanie usunięty.



        /*
        DDL to skrót od "Data Definition Language" (język definicji danych). Jest to rodzaj języka programowania, który
         umożliwia definiowanie, modyfikowanie i usuwanie struktur danych w bazie danych. DDL jest często używane w
         kontekście systemów zarządzania bazą danych (DBMS) i jest jednym z dwóch głównych rodzajów języków SQL, obok
         języka DML (Data Manipulation Language).

Operacje DDL obejmują tworzenie nowych tabel, definiowanie typów danych, modyfikowanie schematu bazy danych (np.
dodawanie, usuwanie lub modyfikowanie kolumn tabeli), tworzenie indeksów i innych struktur danych. Przykłady poleceń
DDL to:

CREATE TABLE: Tworzenie nowej tabeli.
ALTER TABLE: Modyfikacja struktury tabeli, takie jak dodawanie nowych kolumn lub usuwanie istniejących.
DROP TABLE: Usuwanie tabeli.
CREATE INDEX: Tworzenie nowego indeksu dla jednej lub wielu kolumn tabeli.
Operacje DDL są zazwyczaj używane przez administratorów baz danych lub osoby odpowiedzialne za projektowanie i
zarządzanie strukturą bazy danych. Odpowiednie zastosowanie poleceń DDL jest kluczowe dla utrzymania spójności i
integralności danych w bazie danych.
         */
    }
}
