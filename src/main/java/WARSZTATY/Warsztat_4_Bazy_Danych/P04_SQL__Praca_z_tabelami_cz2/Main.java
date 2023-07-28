package WARSZTATY.Warsztat_4_Bazy_Danych.P04_SQL__Praca_z_tabelami_cz2;

public class Main {
    public static void main(String[] args) {
       // DDL- Data Definition Language polecenia służące do tworzenia tabel
    /*
    TWORZENIE TABELKI:
    CREATE TABLE EMPLOYEES(
    	ID			 			INT					NOT NULL,
	    NAME		 			VARCHAR(20)	   		NOT NULL,
	    SURNAME		 			VARCHAR(20)			NOT NULL,
	    AGE			 			SMALLINT,
	    SALARY		 			NUMERIC(7,2) 		NOT NULL,
	    DATE_OF_EMPLOYMENT 		DATE,
	    PRIMARY KEY(ID)
    );
         */
        /*
        pobieranie dostepnego schematu tabel z PostgrSQL do stworzonej przez nas tabelki zajavka
        SELECT * FROM information_schema.columns
        WHERE table_name = 'employees';
         */

        // DROP TABLE employees; usuwanie tabeli o nazwie employees

        /*
        zmienianie tabeli
        ALTER TABLE EMPLOYEES
        ALTER COLUMN SURNAME DROP NOT NULL;  - usuwamy (drop) z surname constrajna, który wykluczał nulla
         */
    }
}
