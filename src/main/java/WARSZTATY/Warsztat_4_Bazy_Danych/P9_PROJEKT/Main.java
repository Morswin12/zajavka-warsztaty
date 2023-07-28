package WARSZTATY.Warsztat_4_Bazy_Danych.P9_PROJEKT;

public class Main {
    public static void main(String[] args) {

/*

pkt 1. Stwórz wspomnianą bazę danych.
CREATE DATABASE zajavka_store


CREATE TABLE CUSTOMER(
	ID 		 			INT  			NOT NULL,
	USER_NAME			VARCHAR(32) 	NOT NULL,
	EMAIL				VARCHAR(32)		NOT NULL,
	NAME				VARCHAR(32)		NOT NULL,
	SURNAME 			VARCHAR(32)		NOT NULL,
	DATE_OF_BIRTH		DATE,
	TELEPHONE_NUMBER 	varchar(64),
	PRIMARY KEY(ID),
	UNIQUE(USER_NAME),
	UNIQUE (EMAIL)
);


CREATE TABLE PRODUCER(
	ID 		 			INT  			NOT NULL,
	PRODUCER_NAME		VARCHAR(64) 	NOT NULL,
	ADDRESS				VARCHAR(128)    NOT NULL,
	PRIMARY KEY(ID),
	UNIQUE (PRODUCER_NAME)
);


CREATE TABLE PRODUCT(
	ID 		 				INT  			NOT NULL,
	PRODUCT_CODE			VARCHAR(32)	 	NOT NULL,
	PRODUCT_NAME			VARCHAR(64) 	NOT NULL,
	PRODUCT_PRICE			NUMERIC(9, 2)	NOT NULL,
	ADULTS_ONLY				BOOLEAN			NOT NULL,
	DESCRIPTION				TEXT			NOT NULL,
	PRODUCER_ID				INT				NOT NULL,
	PRIMARY KEY(ID),
	UNIQUE (PRODUCT_CODE),
	CONSTRAINT 	fk_producer
		FOREIGN KEY (PRODUCER_ID)
			REFERENCES PRODUCER(ID)
);



CREATE TABLE PURCHASE(
	ID 		 				INT  			NOT NULL,
	CUSTOMER_ID				INT		 		NOT NULL,
	PRODUCT_ID				INT				NOT NULL,
	QUANTITY				INT				NOT NULL,
	DATE_TIME				TIMESTAMPTZ 	NOT NULL,
	PRIMARY KEY(ID),
	CONSTRAINT 	fk_customer
		FOREIGN KEY (CUSTOMER_ID)
			REFERENCES CUSTOMER(ID),
	CONSTRAINT 	fk_product
		FOREIGN KEY (PRODUCT_ID)
			REFERENCES PRODUCT(ID)
);



CREATE TABLE OPINION(
	ID 		 				INT  			NOT NULL,
	CUSTOMER_ID				INT		 		NOT NULL,
	PRODUCT_ID				INT				NOT NULL,
	STARS 					SMALLINT 		CHECK (STARS IN (1, 2, 3, 4, 5)   NOT NULL,
    COMMENT 				TEXT			NOT NULL,
	DATE_TIME				TIMESTAMPTZ 	NOT NULL,
	PRIMARY KEY(ID),
	CONSTRAINT 	fk_customer
		FOREIGN KEY (CUSTOMER_ID)
			REFERENCES CUSTOMER(ID),
	CONSTRAINT 	fk_product
		FOREIGN KEY (PRODUCT_ID)
			REFERENCES PRODUCT(ID)
);


PKT. 4: Nie podobają nam się opinie o ocenie niższej niż 4, więc usuń je wszystkie

DELETE FROM OPINION
WHERE STARS < 4;

PKT. 5: Wyświetl unikalne kody produktów, które zostały zakupione przed datą '2020-02-01'.

SELECT DISTINCT PRODUCT_CODE
	FROM purchase
		JOIN product ON purchase.PRODUCT_ID = product.ID
			WHERE purchase.DATE_TIME < '2020-02-01';

lub:

SELECT DISTINCT PR.PRODUCT_CODE
	FROM PURCHASE AS PUR
	INNER JOIN PRODUCT AS PR ON PUR.PRODUCT_ID = PR.ID
WHERE PUR.DATe_TIME < '2020-02-01';


PKT.6:  Wyświetl na ekranie kody oraz ilość dokonanych transakcji zakupowych dla 5 produktów, które
        pojawiają się w największej ilości transakcji. Wynik posortuj malejąco na podstawie ilości
        dokonanych transakcji zakupowych. Ilość dokonanych transakcji zakupowych nie oznacza, że
        produkt jest kupowany najczęściej w obrębie jednej transakcji zakupowej, tylko oznacza, że produkt
        pojawia się w największej ilości dokonanych transakcji zakupowych.

SELECT DISTINCT PRODUCT.PRODUCT_CODE,
	COUNT(PRODUCT.PRODUCT_CODE) AS COUNT_PURCHASE
		FROM PURCHASE
		JOIN PRODUCT ON purchase.PRODUCT_ID = PRODUCT.ID
			GROUP BY PRODUCT.PRODUCT_CODE
			ORDER BY COUNT_PURCHASE DESC
			LIMIT(5)


PKT.7:  Wyświetl na ekranie wszystkich klientów którzy zakupili produkty przeznaczone dla dorosłych
        (flaga ADULTS_ONLY ustawiona na true).

SELECT DISTINCT CUSTOMER.USER_NAME, product.adults_only
	FROM purchase
		JOIN CUSTOMER ON purchase.CUSTOMER_ID = CUSTOMER.ID
		JOIN PRODUCT ON purchase.PRODUCT_ID = PRODUCT.ID
			WHERE PRODUCT.ADULTS_ONLY = true;


PKT. 8: Wprowadzamy promocję w naszym sklepie i chcemy aby wszystkie produkty od producenta Bruen
        Group, które kosztują więcej niż 50 pieniędzy zostały przecenione na 40 pieniędzy.


update PRODUCT
SET PRODUCT_PRICE = '€40'
	WHERE PRODUCER_ID IN (
				SELECT ID
					FROM PRODUCER
						WHERE PRODUCER_NAME = 'Bruen Group'
				) AND
					PRODUCT_PRICE > '€50'



PKT 9. Znajdź osoby, które wystawiły co najmniej jedną opinię o wartości 5 gwiazdek.

SELECT DISTINCT CUSTOMER.USER_NAME, CUSTOMER.NAME, CUSTOMER.SURNAME, OPINION.STARS
	FROM OPINION
		JOIN CUSTOMER ON OPINION.CUSTOMER_ID = CUSTOMER.ID
			WHERE OPINION.STARS > 4


 */

    }
}
