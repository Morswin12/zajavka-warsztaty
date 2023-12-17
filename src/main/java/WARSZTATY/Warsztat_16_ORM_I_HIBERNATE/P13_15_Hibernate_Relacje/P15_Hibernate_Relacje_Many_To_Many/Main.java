package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P15_Hibernate_Relacje_Many_To_Many;

public class Main {
    /*
    Junction table -> jest to tzw. tabela pomostowa (asocjacyjną), która jest potrzebna do odzwierciedlenia relacji
                      many-to-many. Służy do tego, aby złączyć ze sobą dwie tabele odwołując się do kluczy głównych
                      tych tabel, które wchodzą ze sobą w relacje. Tabela taka zawiera wpisy, które oznaczają relacje
                      same w sobie.



     CREATE TABLE employee
(
	employee_id SERIAL NOT NULL,
	name varchar(20) NOT NULL,
	breed varchar(20) NOT NULL,
	salary NUMERIC(7, 2) NOT NULL,
	since TIMESTAMP WITH TIME ZONE NOT NULL,
 	primary key (employee_id)
);

CREATE TABLE project
(
	project_id SERIAL NOT NULL,
	name varchar(64) NOT NULL,
	description TEXT NOT NULL,
	deadline TIMESTAMP WITH TIME ZONE NOT NULL,
 	PRIMARY KEY (project_id),
	UNIQUE (name)
);

CREATE TABLE project_assigment
(
	project_assigment_id SERIAL NOT NULL,
	employee_id INT NOT NULL,
	project_id INT NOT NULL,
	PRIMARY KEY (project_assigment_id),
	CONSTRAINT fk_project_assigment_employee
		FOREIGN KEY (employee_id)
			REFERENCES employee (employee_id),
	CONSTRAINT fk_project_assigment_project
		FOREIGN KEY (project_id)
			REFERENCES project (project_id)
);


     */
}
