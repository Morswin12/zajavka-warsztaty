package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P14_Hibernate_Relacje_One_To_Many;

public class Main {
    /*
    create table owner
(
	owner_id serial not null,
	name varchar(32) not null,
	surname varchar(32) not null,
	phone varchar(32) not null,
	email varchar(32) not null,
	primary key (owner_id)
);

create table pet
(
	pet_id serial not null,
	name varchar(32) not null,
	breed varchar(32) not null,
	owner_id INT not null,
	primary key (pet_id),
	constraint fk_pet_owner
		foreign key (owner_id)
			references owner (owner_id)
);


     */
}
