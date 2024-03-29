CREATE TABLE OPINION(
	ID 		 				INT  			NOT NULL UNIQUE,
	CUSTOMER_ID				INT		 		NOT NULL,
	PRODUCT_ID				INT				NOT NULL,
	STARS 					SMALLINT 		NOT NULL 			CHECK (STARS >= 1 AND STARS <= 5),
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