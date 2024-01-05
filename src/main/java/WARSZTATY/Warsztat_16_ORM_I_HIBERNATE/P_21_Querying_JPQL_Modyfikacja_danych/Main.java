package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_21_Querying_JPQL_Modyfikacja_danych;

public class Main {
    /*
    Kilka sposobów na wykonywanie bardziej złożonych zapytań SQL w Hibernate:
    1. JPQL -> Jakarta Persistence Query Language
            HQL -> Hibernate Query Language -> podzbiór JPQL (rozszerza go)
    2. Criteria API
    3. Native query
    4. Procedury składowane

        HQL:
            -> ma własna składnie i gramatykę nadal zapisuje się go w postaci Stringa, np: from Customer
                cust (Select * from customer),
            -> NIE SŁUŻY DO modyfikacji schematu bazy danych, tylko do zapytań CRUD;
            -> Zapytania HQL są tłumaczone przez Hibernate do konwencjonalnych SQL;
            -> Hibernate pozwala też na użycie SQL-a bezpośrednio (Native Query);
            -> SQL manipuluje danymi w bazie danych pracując w oparciu o tabele i kolumny. HQL robi to samo, ale
                pracuje używając klas i ich własności, które są następnie mapowane do struktury tabel w bazie danych.

     */
    public static void main(String[] args) {

    }
}
