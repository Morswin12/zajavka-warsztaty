package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P13_Hibernate_Relacje_One_To_One;

public class Main {
    /*
    ERD -> Entity Relationship Diagram, w bazach danych

    create table customer
(
	customer_id SERIAL not null,
	name varchar(32) not null,
	surname varchar(32) not null,
	phone varchar(32) not null,
	email varchar(32) not null,
	address_id int not null,
	primary key (customer_id),
	UNIQUE (email),
	UNIQUE (address_id),
	Constraint fk_customer_address
		foreign key (address_id)
			references address (address_id)
);

create table address
(
	address_id SERIAL not null,
	country varchar(32) not null,
	city varchar(32) not null,
	postal_code varchar(32) not null,
	address varchar(32) not null,
	primary key (address_id)
);
     */
    public static void main(String[] args) {

    }
}
