package WARSZTATY.Warsztat_4_Bazy_Danych.P06_SQL_OPERACJE_cz2;

public class Main {
    public static void main(String[] args) {
/*
Sortowanie:
SELECT *
FROM EMPLOYEES
WHERE AGE IS NOT NULL               - dla wieku który nie jest nulem
ORDER BY AGE DESC, SURNAME ASC      - sortuj po wieku malejąco, a jeśli się powtarza (DESC- descending), to po nazwisku rosnąco (ASC- ascending)
LIMIT 4   - ogranicza do 4 wierszy
 */

/*
SELECT DISTINCT NAME        - distinct pozwala wydrukować tylko unikalne wartości (taki Set) nie będzie powtórzeń
FROM EMPLOYEES
ORDER BY NAME DESC

 */

/*
SELECT NAME, COUNT(*) - grupuje po kluczu imię i podaje imię oraz w drugiej kolumnie ile jest takich imion
FROM EMPLOYEES
GROUP BY NAME

 - zlicza ilość imion
 SELECT  COUNT(NAME)
FROM EMPLOYEES

- zlicza ilość unikalnych imion
SELECT  COUNT(DISTINCT NAME)
FROM EMPLOYEES


 SELECT NAME,                       - służy do wyciągnięcia czegoś z bazy danych
	COUNT(ID) AS MEMBERS,           -
	SUM(AGE) AS SUM_AGES,
	SUM(SALARY) AS SUM_SALARIES,
	AVG(SALARY) AS ŚREDNIA_PENSJA,
	MAX(AGE) AS MAKSYMALNY_WIEK,
	MIN(SALARY) AS MINIMALNA_WYPŁATA
FROM EMPLOYEES
GROUP BY NAME



SELECT
	COUNT(AGE),
	MAX(AGE),
	MIN(SALARY),
	AVG(AGE) AS ŚREDNIA_WIEKU
FROM EMPLOYEES


- edycja danych
 UPDATE EMPLOYEES
SET
	SALARY = 23000,
 	SURNAME = 'Dupazbita'
WHERE NAME = 'Roman';


 - usuwanie (trzeba uważać):
DELETE FROM EMPLOYEES
WHERE ID= 10;

SELECT *
FROM EMPLOYEES


ORDER BY AGE DESC NULLS LAST
 */
    }
}
