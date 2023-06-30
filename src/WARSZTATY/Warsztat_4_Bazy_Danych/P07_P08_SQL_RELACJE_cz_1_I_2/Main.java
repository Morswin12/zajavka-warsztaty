package WARSZTATY.Warsztat_4_Bazy_Danych.P07_P08_SQL_RELACJE_cz_1_I_2;

public class Main {
    public static void main(String[] args) {
/*
CREATE TABLE ADDRESSES(
	ID INT NOT NULL,
	CITY VARCHAR(32) NOT NULL,
	STREET VARCHAR(64) NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE EMPLOYEES(
	ID INT NOT NULL,
	NAME VARCHAR(20) NOT NULL,
	SURNAME VARCHAR(20) NOT NULL,
	AGE INT,
	SALARY NUMERIC(7,2) NOT NULL,
	dATE_OF_EMPLOYMENT DATE,
	ADDRESS_ID INT NOT NULL,
	PRIMARY KEY(ID),
	CONSTRAINT fk_address
		FOREIGN key (ADDRESS_ID)
			REFERENCES ADDRESSES(ID)
);

INSERT INTO ADDRESSES (ID, CITY, STREET)
		VALUES (1, 'Warszawa', 'Marszałkowska');
INSERT INTO ADDRESSES (ID, CITY, STREET)
		VALUES (2, 'Gdańsk', 'Oliwska');
INSERT INTO ADDRESSES (ID, CITY, STREET)
		VALUES (3, 'Szczecin', 'Biała');

"id"	"city"	"street"
1	"Warszawa"	"Marszałkowska"
2	"Gdańsk"	"Oliwska"
3	"Szczecin"	"Biała"

INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
-- 		VALUES (1, 'Aleksander', 'Wypłata', 33, 8791.12, '2018-03-12', 1);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (2, 'Roman', 'Pomidorowy', 43, 7612.12, '2012-01-01', 2);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (3, 'Anna', 'Rosół', 38, 5728.90, '2015-07-18', 1);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (4, 'Urszula', 'Nowak', 39, 3817.21, '2014-12-15', 2);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (5, 'Stefan', 'Romański', 38, 9201.23, '2020-07-14', 1);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (6, 'Jolanta', 'Kowalska', 27, 6521.22, '2012-06-04', 3);

"id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"
1	"Aleksander"	"Wypłata"	33	8791.12	"2018-03-12"	1
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2
3	"Anna"	"Rosół"	38	5728.90	"2015-07-18"	1
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1
6	"Jolanta"	"Kowalska"	27	6521.22	"2012-06-04"	3


SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, ADR.ID, CITY, STREET
	FROM EMPLOYEES AS EMP
		INNER JOIN ADDRESSES AS ADR ON EMP.ADDRESS_ID = ADR.ID;

 "id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"	"id-2"	"city"	"street"
1	"Aleksander"	"Wypłata"	33	8791.12	"2018-03-12"	1	1	"Warszawa"	"Marszałkowska"
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2	2	"Gdańsk"	"Oliwska"
3	"Anna"	"Rosół"	38	5728.90	"2015-07-18"	1	1	"Warszawa"	"Marszałkowska"
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2	2	"Gdańsk"	"Oliwska"
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1	1	"Warszawa"	"Marszałkowska"
6	"Jolanta"	"Kowalska"	27	6521.22	"2012-06-04"	3	3	"Szczecin"	"Biała"


ALTER TABLE EMPLOYEES
	ALTER COLUMN ADDRESS_ID DROP NOT NULL;

DELETE FROM EMPLOYEES;
DELETE FROM ADDRESSES;


INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (1, 'Warszawa', 'Marszałkowska');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (2, 'Gdańsk', 'Oliwska');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (3, 'Szczecin', 'Biała');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (4, 'Szczecin', 'Niebieska');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (5, 'Zakopane', 'Wodna');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (6, 'Zakopane', 'Piaskowa');
INSERT INTO ADDRESSES (ID, CITY, STREET) VALUES (7, 'Kraków', 'Wawelska');


INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
		VALUES (1, 'Aleksander', 'Wypłata', 33, 8791.12, '2018-03-12');
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (2, 'Roman', 'Pomidorowy', 43, 7612.12, '2012-01-01', 2);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
		VALUES (3, 'Anna', 'Rosół', 38, 5728.90, '2015-07-18');
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (4, 'Urszula', 'Nowak', 39, 3817.21, '2014-12-15', 2);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
		VALUES (5, 'Stefan', 'Romański', 38, 9201.23, '2020-07-14', 1);
INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
		VALUES (6, 'Jolanta', 'Kowalska', 27, 6521.22, '2012-06-04');


SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, ADR.ID, CITY, STREET
	FROM EMPLOYEES AS EMP
		INNER JOIN ADDRESSES AS ADR ON EMP.ADDRESS_ID = ADR.ID; -bez słowa inner też działa

"id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"	"id-2"	"city"	"street"
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2	2	"Gdańsk"	"Oliwska"
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2	2	"Gdańsk"	"Oliwska"
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1	1	"Warszawa"	"Marszałkowska"


SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, ADR.ID, CITY, STREET
	FROM EMPLOYEES AS EMP
		FULL JOIN ADDRESSES AS ADR ON EMP.ADDRESS_ID = ADR.ID;

"id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"	"id-2"	"city"	"street"
1	"Aleksander"	"Wypłata"	33	8791.12	"2018-03-12"
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2	2	"Gdańsk"	"Oliwska"
3	"Anna"	"Rosół"	38	5728.90	"2015-07-18"
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2	2	"Gdańsk"	"Oliwska"
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1	1	"Warszawa"	"Marszałkowska"
6	"Jolanta"	"Kowalska"	27	6521.22	"2012-06-04"
							5	"Zakopane"	"Wodna"
							6	"Zakopane"	"Piaskowa"
							4	"Szczecin"	"Niebieska"


SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, CITY, STREET
	FROM EMPLOYEES AS EMP
		LEFT JOIN ADDRESSES AS ADR ON EMP.ADDRESS_ID = ADR.ID;

"id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"	"city"	"street"
1	"Aleksander"	"Wypłata"	33	8791.12	"2018-03-12"
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2	"Gdańsk"	"Oliwska"
3	"Anna"	"Rosół"	38	5728.90	"2015-07-18"
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2	"Gdańsk"	"Oliwska"
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1	"Warszawa"	"Marszałkowska"
6	"Jolanta"	"Kowalska"	27	6521.22	"2012-06-04"



SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, CITY, STREET
	FROM EMPLOYEES AS EMP
		RIGHT JOIN ADDRESSES AS ADR ON EMP.ADDRESS_ID = ADR.ID;

"id"	"name"	"surname"	"age"	"salary"	"date_of_employment"	"address_id"	"city"	"street"
2	"Roman"	"Pomidorowy"	43	7612.12	"2012-01-01"	2	"Gdańsk"	"Oliwska"
4	"Urszula"	"Nowak"	39	3817.21	"2014-12-15"	2	"Gdańsk"	"Oliwska"
5	"Stefan"	"Romański"	38	9201.23	"2020-07-14"	1	"Warszawa"	"Marszałkowska"
							"Zakopane"	"Wodna"
							"Zakopane"	"Piaskowa"
							"Szczecin"	"Niebieska"
							"Szczecin"	"Biała"
							"Kraków"	"Wawelska"

 */
    }
}
