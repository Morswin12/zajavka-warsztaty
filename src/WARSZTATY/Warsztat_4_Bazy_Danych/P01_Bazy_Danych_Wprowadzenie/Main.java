package WARSZTATY.Warsztat_4_Bazy_Danych.P01_Bazy_Danych_Wprowadzenie;

public class Main {
    public static void main(String[] args) {
        // CRUD - Create, Read, Update, Delete
        // DBMS - Database Management System
        // np.: PostgreSQL, Oracle Database, MySQL
        // Server - oprogramowanie które dostarcza pewną funkcjonalność urządzenia, które z niego korzystają
        // Database Server, Client-Server, Server Bazy Danych,

        // Czym są dane? - wszystkie informacje, które są zapisywane przez program np. historia zakupów, loginy, dane
        //                  nasze, itp.
        // Relacyjne bazy danych, czyli takie uporządkowanie danych, żeby można było między nimi się komunikować, np.
        //                  tabelki i wiersze jak w excel

        // ID   | Imię      | Nazwisko  | Miasto
        // 1    | Karol     | Rogowski  | Warszawa
        // 2    | Paweł     | Snopek    | Kielce
        // 3    | Paweł     | Snopek    | Kielce
        // 4    | Ania      | Żak       | Kopcie

        // Nierelacyjne - jakieś inne uporządkowanie np.: NoSQL -not only SQL, ale nie będziemy się tym zajmować

        // SQL - Structured Query Language - język zapytań do Baz Danych
        // JDBC - Java Database Connectivity - API służące do podłączenia się w bardzo podstawowy sposób do Bazy Danych
        //              przy wykorzystaniu Javy
        // JPA - Java Persistent Api
        // RDBMS - Relational Database Management System (np.: PostgreSQL, Oracle Database, MySQL)

        // Data Integrity - (integralność danych) reguły pozwalające utrzymać porządek w naszych danych
        //  - entity integrity - (integralność encji) - np. nie może być dwóch identycznych wierszy
        // ID   | Imię      | Nazwisko  | Miasto
        // 1    | Karol     | Rogowski  | Warszawa
        // 1    | Karol     | Rogowski  | Warszawa - nie może być 2 takich samych wierszy
        // 2    | Paweł     | Snopek    | Kielce
        // 3    | Paweł     | Snopek    | Kielce - tak jest ok
        // 4    | Ania      | Żak       | Kopcie
        //  - domain integrity (integralność domeny), czyli w kolumnie z nazwiskami trzymamy tylko nazwiska, a nie nr
        //                  telefonów czy Miasta
        //  - referential integrity (więzy integralności), jeśli będziemy mieć powiązane ze sobą np. tabele A i B, to
        //                  obie muszą istnień. Np. w jednej tabeli mamy dane z połączenia kilku danych z drugiej tabeli
        //  - user-defined integrity (integralność narzucona przez użytkownika {programisty}) jakieś nasze dodatkowe
        //                  wytyczne

        // Constraints (konstrajny) - ograniczenia, które wymuszaj nas pewne rzeczy, które muszą być spełnione w danej
        //          kolumnie lub całej tabeli:
        //  - NOT NULL - brak pustych komórek
        //  - UNIQUE - muszą być unikalne wartości, np. możemy narzucić, aby nie dało się powtórzyć nr telefonu lub
        //                  nazwiska
        //  - DEFAULT - wartość domyślna, jeśli ktoś nie poda jakiejś danej
        //  - CHECK - sprawdzamy, czy dane są w odpowiednim dla nas formacie (np. w formacie JSON- JavaScript Object
        //                  Notation)
        //  - PRIMARY KEY - klucz główny. Jednoznacznie identyfikuje unikalny rekord albo wiersz w bazie danych (coś
        //                  jak pesel), czyli np. ID wyżej w tabeli poz. 3 i 4
        //  - FOREIGN KEY - klucz (konstrain) jednoznacznie identyfikujący odniesienie się do wpisu w innej tabeli np.
        //                  zamiast miasta w kolumnie z miastami możemy podać nr ID, na którym znajduje się dane miasto
        //                  w osobnej tabeli z miastami




    }
}
