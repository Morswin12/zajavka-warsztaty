package WARSZTATY.Warsztat_4_Bazy_Danych.P05_SQL_OPERACJE_cz1;

public class Main {
    public static void main(String[] args) {
        // SELECT * FROM EMPLOYEES -> pobieranie naszej tabeli
         /*
         dodawanie danych do tabeli:
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (1, 'Aleksander', 'Kwaśniewski', 63, 8973.23, '2019-04-16');
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (2, 'Roman', 'Pomidorowy', 43, 7612.23, '2012-01-01');
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (3, 'Anna', 'Rosół', 38, 5728.23, '2015-07-18');
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (4, 'Urszula', 'Nowak', 39, 3817.23, '2014-12-15');
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (5, 'Stefan', 'Romański', 38, 9201.23, '2020-07-14');
         INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
         VALUES (6, 'Jolanta', 'Kowalska', 27, 6521.23, '2012-06-04');

        SELECT * FROM EMPLOYEES - * oznacza wszystkie kolumny, zamiast gwiazdki moemy wpisać które kolumny nas interesują :
        SELECT ID, NAME, AGE FROM EMPLOYEES - TU POKAŻE TYLK O KOLUMNY WYPISANE

        1	"Aleksander"	"Kwaśniewski"	63	8973.23	"2019-04-16"
        2	"Roman"	"Pomidorowy"	43	7612.23	"2012-01-01"
        3	"Anna"	"Rosół"	38	5728.23	"2015-07-18"
        4	"Urszula"	"Nowak"	39	3817.23	"2014-12-15"
        5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"
        6	"Jolanta"	"Kowalska"	27	6521.23	"2012-06-04"
        7	"Aleksander"	"Kwaśniewski"	63	8973.23	"2019-04-16"
        8	"Aleksander"	"Kwaśniewski"	63	23893.32	"2019-04-16"
          */

        /*usuwanie np wiersza o id większym od 6
        DELETE FROM EMPLOYEES WHERE ID > 6;
         */

        /* wypisz kolumny id oraz name i zmień ich nazwę na goro_id, oraz super_name, ale tylko do odczytu, oryginalna tabela jest bez zmian
SELECT
	ID AS GORO_ID,
	NAME AS SUPER_NAME
FROM EMPLOYEES
         */

        /* wyciąga tylko pracowników o imieniu "Roman":
ELECT *
FROM EMPLOYEES
WHERE name = 'Roman';
         */

        /* możemy łączyć zapytania przy pomocy "AND" lub "OR"
SELECT *
FROM EMPLOYEES
WHERE age = 38 AND name = 'Stefan';

SELECT *
FROM EMPLOYEES
WHERE age = 39 OR name = 'Stefan';

         */
/*
SELECT
	NAME,
	AGE,
	AGE % 10 AS AGE_MOD,
	age / 10 as age_dziesiatki,
	AGE * 7 as age_dog,
	age + 18 - 3 as age_coś,
	AGE > 38 as agee,
	name != 'Roman' as no_Roman_name,
	name <> 'Anna' as no_Anna_name,
	name = 'Urszula' as Urszula_name
FROM EMPLOYEES

"name"	        "age"	"age_mod"	"age_dziesiatki"	"age_dog"	"age_coś"	"agee"	"no_roman_name"	"no_anna_name"	"urszula_name"
"Aleksander"	63	        3	        6	            441         	78	    true	    true        	true        	false
"Roman"	        43	        3	        4	            301         	58	    true	    false	        true	        false
"Anna"	        38	        8	        3	            266	            53	    false	    true	        false       	false
"Urszula"	    39	        9	        3           	273	            54	    true	    true        	true        	true
"Stefan"	    38	        8	        3	            266	            53	    false	    true	        true	        false
"Jolanta"	    27	        7	        2	            189	            42  	false	    true        	true	        false
 */

/*
SELECT *
FROM EMPLOYEES
WHERE
	NAME < 'S'                              - 1.1 imię zaczyna się na literę mniejszą (w alfabecie) niż 's'
	AND AGE >= 40                           - 1.2 oraz wiek większy równy 40
	OR NAME IN ('Anna', 'Urszula', 'Tomasz')- 2.1 lub imię jedno z listy podanej w nawiasie
	AND AGE BETWEEN 39 AND 50;              - 2.2 oraz wiek między 39 a 50 (w tym przypadku, ta część filtruje tylko to, co przejdzie po or
*/
        
/*
możemy także wyszukać osoby, które mają nulle w niektórych komórkach
SELECT * 
FROM EMPLOYEES
WHERE AGE IS NULL
lub tych, którzy nie mają nulla
WHERE AGE IS NOT NULL
 */

/*

SELECT *
FROM EMPLOYEES
WHERE NAME LIKE '%o%' OR NAME LIKE '%rsz%' OR NAME LIKE 'Roman'   - like suy do sprawdzenia, czy występuje dokładnie
                                                                    wskazane imię lub jakaś część, ale wtedy musimy
                                                                    dodać % aby zwrócić uwagę że coś może być przed
                                                                    lub po lub tu i tu
 */
    }
}
