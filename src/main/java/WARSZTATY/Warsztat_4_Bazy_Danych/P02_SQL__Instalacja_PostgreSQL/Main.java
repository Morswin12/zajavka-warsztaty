package WARSZTATY.Warsztat_4_Bazy_Danych.P02_SQL__Instalacja_PostgreSQL;

public class Main {
    public static void main(String[] args) {

        // W terminalu:
        // > cd C:\Program Files\PostgreSQL\15\bin
        // > dir
        // > psql -U postgres   (uruchamiamy plik exe psql.exe przez użytkownika postgres)
        // prosi o wpisanie hasła ->  wpisujemy nasze hasło
        //    i przechodzimy do PostgreSQL teraz linijka zaczyna się od: "postgres=# "
        // \du - pokazuje listę użytkowników: List of roles"
        // \l  - tabelka z bazami danych, które tu mamy
        // \l+ - bardziej szczegółowa tabelka z bazami danych, które tu mamy
        // SELECT datname FROM pg_database;  pokazuje dostępne bazy danych
        // CREATE DATABASE zajavka;   tworzy nową bazę danych o nazwie zajavka
        // DROP DATABASE zajavka;     usuwa, jeśli ją rozłączymy pgAdmin PostgreSQL lub wyrzuca ERROR
        // DROP DATABASE IF EXISTS zajavka;  usuwa, jeśli ją rozłączymy pgAdmin PostgreSQL lub wyrzuca NOTICE z informacja
    }
}
